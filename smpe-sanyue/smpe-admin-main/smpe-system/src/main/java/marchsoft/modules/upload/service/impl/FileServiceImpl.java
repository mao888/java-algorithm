package marchsoft.modules.upload.service.impl;

import cn.hutool.core.util.StrUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import marchsoft.config.bean.FileProperties;
import marchsoft.enums.ResultEnum;
import marchsoft.exception.BadRequestException;
import marchsoft.modules.upload.service.FileService;
import marchsoft.utils.FileUtils;
import marchsoft.utils.SecurityUtils;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * class description：文件管理
 *
 * @author RenShiWei
 * Date: 2020/2/5
 **/
@RequiredArgsConstructor
@Slf4j
@Service
public class FileServiceImpl implements FileService {

    private final FileProperties fileProperties;

    @Override
    public String upload(MultipartFile multipartFile) {
        File file = FileUtils.upload(multipartFile, fileProperties.getPath());
        if (file == null) {
            log.error(StrUtil.format("【文件上传失败】操作人id：{}", SecurityUtils.getCurrentUserId()));
            throw new BadRequestException(ResultEnum.FILE_UPLOAD_FAIL);
        }
        //返回图片地址
        log.info(StrUtil.format("【图片上传成功】操作人id：{}，文件名：{}", SecurityUtils.getCurrentUserId(), file.getName()));
        return file.getName();
    }

    /**
     * description:加载文件资源
     *
     * @param fileName 文件名
     * @return 文件资源
     * @author RenShiWei
     * Date: 2020/7/21 9:48
     */
    @Override
    public Resource loadFileAsResource(String fileName) {
        String path = fileProperties.getPath() + fileName;
        Resource resource = FileUtils.loadFileAsResource(path);
        if (resource == null) {
            log.error(StrUtil.format("【文件资源不存在】操作人id：{}，fileName：{}", SecurityUtils.getCurrentUserId(), fileName));
            throw new BadRequestException(ResultEnum.FILE_LOADING_FAIL);
        }
        return resource;
    }


}

