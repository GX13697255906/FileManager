package com.cn.controller;

import com.cn.entity.File;
import com.cn.service.FileService;
import com.cn.service.IFileService;
import com.cn.serviceImpl.FileServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/file/")
@Api(value = "文件处理")
public class FileController {

    @Autowired
    private FileService fileServices;
    @Autowired
    private IFileService fileService;

    @ApiOperation(value = "文件上传",notes = "文件上传")
    @RequestMapping(value="upload", method=RequestMethod.POST)
    public String filesUpload(HttpServletRequest request){
        return  fileService.uploadFile(request);
    }

    @RequestMapping(value = "/files",method = RequestMethod.GET)
    public List<File> findFiles(@RequestParam(required = false) String type){
        return fileService.findFiles(type);
    }

}
