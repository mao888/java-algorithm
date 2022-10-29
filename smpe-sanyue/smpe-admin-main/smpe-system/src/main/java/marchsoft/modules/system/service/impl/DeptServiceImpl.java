package marchsoft.modules.system.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.LocalDateTimeUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.ReflectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.models.auth.In;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import marchsoft.base.BasicServiceImpl;
import marchsoft.base.PageVO;
import marchsoft.enums.DataScopeEnum;
import marchsoft.enums.ResultEnum;
import marchsoft.exception.BadRequestException;
import marchsoft.modules.system.entity.Dept;
import marchsoft.modules.system.entity.Role;
import marchsoft.modules.system.entity.User;
import marchsoft.modules.system.entity.bo.UserBO;
import marchsoft.modules.system.entity.dto.DeptDTO;
import marchsoft.modules.system.entity.dto.DeptQueryCriteria;
import marchsoft.modules.system.entity.dto.UserDTO;
import marchsoft.modules.system.mapper.DeptMapper;
import marchsoft.modules.system.mapper.RoleMapper;
import marchsoft.modules.system.mapper.UserMapper;
import marchsoft.modules.system.service.IDataService;
import marchsoft.modules.system.service.IDeptService;
import marchsoft.modules.system.service.IUserService;
import marchsoft.modules.system.service.mapstruct.DeptMapStruct;
import marchsoft.utils.CacheKey;
import marchsoft.utils.FileUtils;
import marchsoft.utils.RedisUtils;
import marchsoft.utils.SecurityUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>
 * 部门 服务实现类
 * </p>
 *
 * @author Wangmingcan
 * @since 2020-08-17
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class DeptServiceImpl extends BasicServiceImpl<DeptMapper, Dept> implements IDeptService {

    private final DeptMapper deptMapper;
    private final DeptMapStruct deptMapStruct;
    private final IUserService userService;
    private final UserMapper userMapper;
    private final RedisUtils redisUtils;
    private final RoleMapper roleMapper;

    /**
     * Description:
     * 根据角色id查询角色所属部门
     *
     * @param id: 角色id
     * @return java.util.Set<marchsoft.modules.system.entity.Dept>
     * @author liuxingxing
     * @date 2020/11/26 15:43
     **/
    @Override
    public Set<Dept> findByRoleId(Long id) {
        return deptMapper.findByRoleId(id);
    }

    /**
     * Description:
     * 根据部门id查询部门
     *
     * @param id: 部门id
     * @return marchsoft.modules.system.entity.dto.DeptDTO
     * @author liuxingxing
     * @date 2020/11/26 15:42
     **/
    @Override
    public DeptDTO findById(Long id) {
        Dept dept = deptMapper.selectById(id);
        if (ObjectUtil.isEmpty(dept)) {
            log.error(StrUtil.format("【查找部门失败】操作人id：{}，查找目标id：{}", SecurityUtils.getCurrentUserId(), id));
            throw new BadRequestException(ResultEnum.DATA_NOT_FOUND);
        }
        return deptMapStruct.toDto(dept);
    }

    /**
     * Description:
     * 根据pid(父部门)查询子部门集
     *
     * @param pid: 父级部门id
     * @return java.util.List<marchsoft.modules.system.entity.Dept>
     * @author liuxingxing
     * @date 2020/11/26 15:44
     **/
    @Override
    public List<Dept> findByPid(long pid) {
        LambdaQueryWrapper<Dept> deptLambdaQueryWrapper = new LambdaQueryWrapper<>();
        deptLambdaQueryWrapper.eq(Dept::getPid, pid);
        return list(deptLambdaQueryWrapper);
    }

    /**
     * Description:
     * 获取 deptList中部门与其子部门的id
     *
     * @param deptList: 需要查找部门集合
     * @return java.util.List<java.lang.Long>
     * @author liuxingxing
     * @date 2020/11/26 15:45
     **/
    @Override
    public List<Long> getDeptChildren(List<Dept> deptList) {
        List<Long> list = new ArrayList<>();
        deptList.forEach(dept -> {
                    if (ObjectUtil.isNotNull(dept) && dept.getEnabled()) {
                        list.add(dept.getId());
                        List<Dept> depts = this.findByPid(dept.getId());   //源码中是新的sql
                        if (depts.size() != 0) {
                            list.addAll(getDeptChildren(depts));
                        }
                    }
                }
        );
        return list;
    }

    /**
     * Description:
     * 导出queryAll的数据
     *
     * @param deptDtos: 待到处数据
     * @param response: 服务器响应对象
     * @throws IOException io异常
     * @author liuxingxing
     * @date 2020/11/26 15:45
     **/
    @Override
    public void download(List<DeptDTO> deptDtos, HttpServletResponse response) throws IOException {
        List<Map<String, Object>> list = new ArrayList<>();
        for (DeptDTO deptDto : deptDtos) {
            Map<String, Object> map = new LinkedHashMap<>();
            map.put("部门名称", deptDto.getName());
            map.put("部门状态", deptDto.getEnabled() ? "启用" : "停用");
            map.put("创建日期", ObjectUtil.isNull(deptDto.getCreateTime()) ? null :
                    LocalDateTimeUtil.format(deptDto.getCreateTime()
                            , DatePattern.NORM_DATETIME_FORMATTER));
            list.add(map);
        }
        FileUtils.downloadExcel(list, response);
    }

    /**
     * Description:
     * 根据criteria条件和isQuery查询
     * todo isQuery的作用
     *
     * @param criteria: Dept查询条件
     * @param isQuery:  是否判断当前用户数据权限
     * @return java.util.List<marchsoft.modules.system.entity.dto.DeptDTO>
     * @author liuxingxing
     * @date 2020/11/26 15:45
     **/
    @Override
    public List<DeptDTO> queryAll(DeptQueryCriteria criteria, Boolean isQuery) {
        List<Dept> depts = this.deptMapper.selectList(analysisQueryCriteria(criteria));
        return deptMapStruct.toDto(depts);
    }

    /**
     * Description:
     * 根据criteria条件和isQuery查询
     * todo isQuery的作用
     *
     * @param criteria: Dept查询条件
     * @param isQuery:  是否判断当前用户数据权限
     * @param pageVO:   分页条件
     * @return java.util.List<marchsoft.modules.system.entity.dto.DeptDTO>
     * @author liuxingxing
     * @date 2020/11/26 15:45
     **/
    @Override
    public IPage<DeptDTO> queryAll(DeptQueryCriteria criteria, PageVO pageVO, Boolean isQuery) {
        String dataScopeType = SecurityUtils.getDataScopeType();
        IPage<DeptDTO> returnPage = pageVO.buildPage();
        List<Long> currentUserDataScope = SecurityUtils.getCurrentUserDataScope();
        if (isQuery) {
            if (!dataScopeType.equals(DataScopeEnum.ALL.getValue())) {
                if (ObjectUtil.isNotNull(criteria.getPid())) {
                    if (!currentUserDataScope.contains(criteria.getPid())) {
                        // MODIFY description:是返回空还是报错,视具体情况而定 @liuxingxing 2020/12/4
//                        log.error(StrUtil.format("【查询部门失败】操作人id：{}，查询部门目标dept：{}", SecurityUtils.getCurrentUserId(),
//                                criteria.getPid() ));
//                        throw new BadRequestException("您没有查询部门目标dept：" + criteria.getPid() + "的权限。");
                        return returnPage;
                    }

                } else {
                    // 判断是否是全空查询
                    boolean isAllNull = true;
                    Field[] fields = ReflectUtil.getFields(criteria.getClass());
                    for (Field field : fields) {
                        if (ObjectUtil.isNotNull(ReflectUtil.getFieldValue(criteria, field))) {
                            if (!field.getName().equals("enabled")) {
                                isAllNull = false;
                                break;
                            }
                        }
                    }
                    if (isAllNull) {
                        // 查询条件为空
                        // MODIFY description: 默认查询当前用户的可用部门 @liuxingxing 2021-02-06
                        UserDTO userDTO = new UserDTO();
                        userDTO.setId(SecurityUtils.getCurrentUserId());
                        List<Long> dataScopeWithDeptIds = SecurityUtils.getCurrentUserDataScope();
                        List<Dept> collect = dataScopeWithDeptIds.stream().map(deptMapper::selectById).collect(Collectors.toList());
                        List<DeptDTO> deptDtos = deptMapStruct.toDto(collect);
                        deptDtos = buildTree(deptDtos);
                        return returnPage.setRecords(deptDtos).setTotal(deptDtos.size());
                    }
                }
            }
        }
        // MODIFY description: 用于给结果添加过滤，防止因名称查询导致越过部门判断 @liuxingxing 2021-02-05
        LambdaQueryWrapper<Dept> deptLambdaQueryWrapper = analysisQueryCriteria(criteria);
        if (isQuery && !dataScopeType.equals(DataScopeEnum.ALL.getValue())) {
            String depts = currentUserDataScope.toString();
            // 去掉[ ] 字符
            depts = depts.substring(1, depts.length() - 1);
            deptLambdaQueryWrapper.inSql(Dept::getId, depts);
        }
        IPage<Dept> page = this.deptMapper.selectPage(pageVO.buildPage(), deptLambdaQueryWrapper);
        List<DeptDTO> deptDtos = deptMapStruct.toDto(page.getRecords());
        deptDtos = buildTree(deptDtos);
        BeanUtil.copyProperties(page, returnPage);
        returnPage.setRecords(deptDtos);
        return returnPage;
    }

    /**
     * Description:
     * 根据当前部门获取所有上级数据(递归使用找上级的上级)
     * 如果是顶级部门就获取所有顶级部门
     * FIXME 递归使用 后续会优化
     *
     * @param deptDTO: 当前部门
     * @param depts:   递归缓存数组（返回的结果）
     * @return java.util.List<marchsoft.modules.system.entity.dto.DeptDTO>
     * @author liuxingxing
     * @date 2020/11/26 15:45
     **/
    @Override
    public List<DeptDTO> getSuperior(DeptDTO deptDTO, List<Dept> depts) {
        LambdaQueryWrapper<Dept> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Dept::getEnabled, true);
        queryWrapper.eq(Dept::getPid, deptDTO.getPid());
        if (deptDTO.getPid() == 0) {
            depts.addAll(list(queryWrapper));
            return deptMapStruct.toDto(depts);
        }
        depts.addAll(list(queryWrapper));
        return getSuperior(findById(deptDTO.getPid()), depts);
    }

    /**
     * Description:
     * 根据传入的部门集合构建部门树形结构
     *
     * @param deptDTOList: 部门集合
     * @return java.lang.Object
     * @author liuxingxing
     * @date 2020/11/26 15:45
     **/
    @Override
    public List<DeptDTO> buildTree(List<DeptDTO> deptDTOList) {
        // MODIFY description: 返回的序列是deptDTOList的顶级节点（没有父节点） @liuxingxing 2021-02-06
        Set<DeptDTO> trees = new LinkedHashSet<>();
        List<Long> collect = deptDTOList.stream().map(DeptDTO::getId).collect(Collectors.toList());
        for (DeptDTO deptDto : deptDTOList) {
            boolean isRoot = true;
            for (DeptDTO it : deptDTOList) {
                if (deptDto.getId() == it.getPid()) {
                    if (ObjectUtil.isNull(deptDto.getChildren())) {
                        deptDto.setChildren(new ArrayList<>());
                    }
                    if (!deptDto.getChildren().contains(it)) {
                        deptDto.getChildren().add(it);
                    }
                }
            }
            if (collect.contains(deptDto.getPid())) {
                isRoot = false;
            }
            if (isRoot) {
                trees.add(deptDto);
            }
        }
        return CollectionUtil.isEmpty(trees) ? deptDTOList : new ArrayList<>(trees);
    }

    /**
     * Description:
     * 新增部门
     *
     * @param dept: 新增部门实体
     * @author liuxingxing
     * @date 2020/11/26 15:45
     **/
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void create(Dept dept) {
        save(dept.setSubCount(0));
        updateSubCnt(ObjectUtil.isNull(dept.getPid()) ? 0 : dept.getPid());
        log.info(StrUtil.format("【添加部门成功】操作人id：{}，新增目标dept：{}", SecurityUtils.getCurrentUserId(),
                dept));
    }

    /**
     * Description:
     * 更新dept的子部门的数量
     *
     * @param deptId: 部门id
     * @author liuxingxing
     * @date 2020/11/26 21:09
     **/
    private void updateSubCnt(Long deptId) {
        if (deptId != 0) {
            LambdaQueryWrapper<Dept> queryWrapper = new LambdaQueryWrapper<>();
            queryWrapper.eq(Dept::getPid, deptId);
            int count = count(queryWrapper);
            LambdaUpdateWrapper<Dept> updateWrapper = new LambdaUpdateWrapper<>();
            updateWrapper.set(Dept::getSubCount, count).eq(Dept::getId, deptId);
            update(updateWrapper);
            log.info(StrUtil.format("【修改部门成功】操作人id：{}，修改目标dept：{}的子部门数量：{}", SecurityUtils.getCurrentUserId(),
                    deptId, count));
        }
    }

    /**
     * Description:
     * 修改部门
     *
     * @param resources: 修改部门实体
     * @author liuxingxing
     * @date 2020/11/26 15:46
     **/
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateDept(Dept resources) {
        Dept dept = getById(resources.getId());
        if (ObjectUtil.isEmpty(dept)) {
            log.error(StrUtil.format("【修改部门失败】操作人id：{}，修改目标不存在,修改目标deptId：{}", SecurityUtils.getCurrentUserId(),
                    resources.getId()));
            throw new BadRequestException(ResultEnum.DATA_NOT_FOUND);
        }
        // 旧部门 pid
        Long oldPid = dept.getPid();
        Long newPid = resources.getPid();
        if (resources.getPid() != 0 && resources.getId().equals(resources.getPid())) {
            log.error(StrUtil.format("【修改部门失败】操作人id：{}，修改目标的上级不能是自己,当前dept：{}", SecurityUtils.getCurrentUserId(),
                    resources));
            throw new BadRequestException("上级不能为自己");
        }
        resources.insertOrUpdate();
        // 更新父节点中子节点数目
        updateSubCnt(oldPid);
        updateSubCnt(newPid);
        log.info(StrUtil.format("【修改部门成功】操作人id：{}，修改目标dept：{}", SecurityUtils.getCurrentUserId(),
                resources));
        //清理缓存
        delCaches(resources.getId());
    }

    /**
     * Description:
     * 获取待删除的部门（递归调用）
     * FIXME 递归获取删除部门列表（包含本部门和本部门的子部门）
     *
     * @param menuList:    要删除部门
     * @param deptDTOList:
     * @return java.util.Set<marchsoft.modules.system.entity.dto.DeptDTO>
     * @author liuxingxing
     * @date 2020/11/26 15:46
     **/
    @Override
    public Set<DeptDTO> getDeleteDepts(List<Dept> menuList, Set<DeptDTO> deptDTOList) {
        for (Dept dept : menuList) {
            deptDTOList.add(deptMapStruct.toDto(dept));
            LambdaQueryWrapper<Dept> deptLambdaQueryWrapper = new LambdaQueryWrapper<>();
            deptLambdaQueryWrapper.eq(Dept::getPid, dept.getId());
            List<Dept> depts = list(deptLambdaQueryWrapper);
            if (ObjectUtil.isNotNull(depts) && depts.size() != 0) {
                getDeleteDepts(depts, deptDTOList);
            }
        }
        return deptDTOList;
    }

    /**
     * Description:
     * 验证是否被角色或用户关联
     *
     * @param deptDTOList:
     * @author liuxingxing
     * @date 2020/11/26 15:46
     **/
    @Override
    public void verification(Set<DeptDTO> deptDTOList) {
        Set<Long> deptIds = deptDTOList.stream().map(DeptDTO::getId).collect(Collectors.toSet());
        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
        userLambdaQueryWrapper.in(User::getDeptId, deptIds);
        if (userService.count(userLambdaQueryWrapper) > 0) {
            log.error(StrUtil.format("【删除部门失败】操作人id：{}，所选部门：{}存在用户关联，请解除后再试！", SecurityUtils.getCurrentUserId(),
                    deptIds.toString()));
            throw new BadRequestException("所选部门存在用户关联，请解除后再试！");
        }
        if (roleMapper.countByDeptIds(deptIds) > 0) {
            log.error(StrUtil.format("【删除部门失败】操作人id：{}，所选部门：{}存在角色关联，请解除后再试！", SecurityUtils.getCurrentUserId(),
                    deptIds.toString()));
            throw new BadRequestException("所选部门存在角色关联，请解除后再试！");
        }
    }

    /**
     * Description:
     * 删除部门实体
     *
     * @param deptDTOList: 删除的部门
     * @author liuxingxing
     * @date 2020/11/26 15:46
     **/
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteDept(Set<DeptDTO> deptDTOList) {
        for (DeptDTO deptDTO : deptDTOList) {
            // 清理缓存
            delCaches(deptDTO.getId());
            this.removeById(deptDTO.getId());
            updateSubCnt(deptDTO.getPid());
            log.info(StrUtil.format("【删除部门成功】操作人id：{}，删除目标dept：{}", SecurityUtils.getCurrentUserId(),
                    deptDTO));
        }
    }

    /**
     * Description:
     * 根据JobCruteruia 解析出查询Wrapper
     *
     * @param criteria: 岗位查询解析
     * @return com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper<marchsoft.modules.system.entity.Job>
     * @author liuxingxing
     * @date 2020/11/24 13:28
     **/
    private LambdaQueryWrapper<Dept> analysisQueryCriteria(DeptQueryCriteria criteria) {
        LambdaQueryWrapper<Dept> wrapper = new LambdaQueryWrapper<>();
        // 查询父部门为pid
        if (ObjectUtil.isNotNull(criteria.getPid())) {
            wrapper.eq(Dept::getPid, criteria.getPid());
        }
        if (StrUtil.isNotBlank(criteria.getName())) {
            // 默认使用Like匹配
            wrapper.like(Dept::getName, criteria.getName());
        }
        if (ObjectUtil.isNotNull(criteria.getEnabled())) {
            wrapper.eq(Dept::getEnabled, criteria.getEnabled());
        }
        if (ObjectUtil.isNotNull(criteria.getStartTime())) {
            // 如果只有开始时间，就默认从开始到现在
            wrapper.between(Dept::getCreateTime, criteria.getStartTime(),
                    ObjectUtil.isNull(criteria.getEndTime()) ? LocalDateTime.now() : criteria.getEndTime());
        }
        return wrapper;
    }


    /**
     * 清理缓存
     *
     * @param id /
     */
    private void delCaches(Long id) {
        List<Long> userIds = userMapper.findIdByDeptRoleId(id);
        // 删除数据权限
        redisUtils.delByKeys(CacheKey.DATA_USER, new HashSet<>(userIds));
        redisUtils.del(CacheKey.DEPT_ID + id);
        // 清除 Role 缓存
        List<Long> roleIds = roleMapper.findInDeptId(id);
        redisUtils.delByKeys(CacheKey.DEPT_ROLE, new HashSet<>(roleIds));
        //清除 user 缓存
        redisUtils.delByKeys(CacheKey.USER_ID, new HashSet<>(userIds));
    }
}
