package com.cn.serviceImpl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cn.entity.File;
import com.cn.mapper.FileMapper;
import com.cn.service.FileService;
import com.cn.service.IFileService;
import org.apache.logging.log4j.Logger;
import org.codehaus.plexus.logging.LoggerManager;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xun.guo123
 * @since 2018-09-23
 */
@Service
@Transactional
public class FileServiceImpl extends ServiceImpl<FileMapper, File> implements IFileService {

    private String imagePath = "E:/file/image/";
    private String videoPath = "E:/file/video/";

    @Override
    public List<File> findFiles(String type) {
        if(type == null){
            type = "image/jpeg";
        }else  if(type.equals("image")){
            type = "image/jpeg";
        }else if(type.equals("video")){
            type = "video/mp4";
        }
        EntityWrapper<File> entityWrapper = new EntityWrapper<>();
        entityWrapper.eq("type",type);
        return baseMapper.selectList(entityWrapper);
    }

    @Override
    public String uploadFile(HttpServletRequest request){
        List<MultipartFile> files =((MultipartHttpServletRequest)request).getFiles("multiple");
        MultipartFile file = null;
        BufferedOutputStream stream = null;
        if(!CollectionUtils.isEmpty(files)){
            File fileEntity = null;
            for (int i =0; i< files.size(); ++i) {
                fileEntity = new File();
                file = files.get(i);
                if (!file.isEmpty()) {
                    try {
                        String filepath = null;
                        String contentType = file.getContentType();
                        if(contentType.equals("video/mp4")){
                            filepath = videoPath;
                        }else if(contentType.equals("image/jpeg")){
                            filepath = imagePath;
                        }
                        String path = filepath+file.getOriginalFilename();

                        fileEntity.setName(file.getOriginalFilename());
                        fileEntity.setCreateTime(new Date());
                        fileEntity.setType(file.getContentType());
                        fileEntity.setUserId(null);
                        fileEntity.setOrderby(0);
                        fileEntity.setPath(path);
                        baseMapper.insert(fileEntity);

                        java.io.File copyFile = new java.io.File(path);
                        byte[] bytes = file.getBytes();
                        System.out.println("type = "+contentType);
                        System.out.println(file.getOriginalFilename());
                        System.out.println("filepath = "+filepath);
                        stream = new BufferedOutputStream(new FileOutputStream(copyFile));
                        stream.write(bytes);
                        stream.close();
                    } catch (Exception e) {
                        stream =  null;
                        return "You failed to upload " + i + " =>" + e.getMessage();
                    }
                } else {
                    return "You failed to upload " + i + " because the file was empty.";
                }
            }
        }

        return  "上传成功";
    }

}
