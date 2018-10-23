package com.cn.service;

import com.cn.entity.File;
import com.baomidou.mybatisplus.service.IService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xun.guo123
 * @since 2018-09-23
 */
public interface IFileService extends IService<File> {

    String uploadFile(HttpServletRequest request);

    List<File> findFiles(String type);

}
