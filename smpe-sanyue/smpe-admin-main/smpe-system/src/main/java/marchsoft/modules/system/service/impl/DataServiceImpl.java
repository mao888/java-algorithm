package marchsoft.modules.system.service.impl;

import lombok.RequiredArgsConstructor;
import marchsoft.enums.DataScopeEnum;
import marchsoft.modules.system.entity.Dept;
import marchsoft.modules.system.entity.dto.RoleSmallDTO;
import marchsoft.modules.system.entity.dto.UserDTO;
import marchsoft.modules.system.service.IDataService;
import marchsoft.modules.system.service.IDeptService;
import marchsoft.modules.system.service.IRoleService;
import marchsoft.modules.system.service.mapstruct.DeptMapStruct;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author Wangmingcan
 * @date 2020/8/17 22:24
 * description 数据权限服务实现
 */
@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = "data")
public class DataServiceImpl implements IDataService {

    private final IRoleService roleService;

    private final IDeptService deptService;

    /**
     * @param user UserDto
     * @return List<Long>
     * @author Wangmingcan
     * @date 2020-08-23 15:53
     * description 用户角色改变时需清理缓存
     */
    @Override
    @Cacheable(key = "'user:' + #p0.id")
    public List<Long> getDataScopeWithDeptIds(UserDTO user) {
        // 用于存储部门id
        Set<Long> deptIds = new HashSet<>();
        // 查询用户角色
        List<RoleSmallDTO> roleSet = roleService.findRoleByUserId(user.getId());
        // 获取对应的部门ID
        for (RoleSmallDTO role : roleSet) {
            DataScopeEnum dataScopeEnum = DataScopeEnum.find(role.getDataScope());
            switch (Objects.requireNonNull(dataScopeEnum)) {
                case THIS_LEVEL:
                    //如果是本级设置为当前用户的部门id
                    // MODIFY description: 现在本级权限包括子部门，如果以后是多部门需要修改本方法 @liuxingxing 2021-02-06
                    ArrayList<Dept> depts = new ArrayList<Dept>() {{
                        add(deptService.getById(user.getDeptId()));
                    }};
                    deptIds.addAll(deptService.getDeptChildren(depts));
                    break;
                case CUSTOMIZE:
                    //当前角色的部门和子部门权限
                    deptIds.addAll(getCustomize(deptIds, role));
                    break;
                default:
                    //默认为全部，返回null
                    return new ArrayList<>(deptIds);
            }
        }
        return new ArrayList<>(deptIds);
    }

    /**
     * description 获取数据权限ID
     * <p>
     * todo 感觉获取子部门是有问题的 @liuixingxing 2020-11-27
     *
     * @param deptIds 部门ID
     * @param role    角色（默认是 '自定义'）
     * @return Set<Long> 数据权限ID
     * @author Wangmingcan
     * @date 2020-08-23 15:54
     */
    private Set<Long> getCustomize(Set<Long> deptIds, RoleSmallDTO role) {
        /* 添加当前角色的所有部门id，包括子部门 */
        Set<Dept> depts = deptService.findByRoleId(role.getId());
        for (Dept dept : depts) {
            deptIds.add(dept.getId());
            List<Dept> deptChildren = deptService.findByPid(dept.getId());
            if (deptChildren != null && deptChildren.size() != 0) {
                deptIds.addAll(deptService.getDeptChildren(deptChildren));
            }
        }
        return deptIds;
    }
}
