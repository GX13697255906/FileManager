package com.cn.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

@Service
public class FileService {

    private String filepath = "E:/file/image/";

    public String uploadFile(HttpServletRequest request){

    List<MultipartFile> files =((MultipartHttpServletRequest)request).getFiles("multiple");
    MultipartFile file = null;
    BufferedOutputStream stream = null;
    for (int i =0; i< files.size(); ++i) {
        file = files.get(i);
        if (!file.isEmpty()) {
            try {
                File copyFile = new File(filepath+file.getOriginalFilename());
                byte[] bytes = file.getBytes();
                String contentType = file.getContentType();
                System.out.println("type = "+contentType);
                System.out.println(file.getOriginalFilename());
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
    return  "上传成功";
}

}
