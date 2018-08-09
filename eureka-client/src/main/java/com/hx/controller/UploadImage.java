package com.hx.controller;

import com.hx.config.FileUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UploadImage {
    //处理文件上传
    @RequestMapping(value="/uploadimg", method = RequestMethod.POST)
    public String uploadImg(@RequestParam("file") MultipartFile file,
                            HttpServletRequest request, String callback) {
        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();
        try {
            String filePath=FileUtil.uploadFile(file.getBytes(), fileName);
            //返回json
            return callback+"("+filePath+")";
        } catch (Exception e) {
            // TODO: handle exception
        }
        return callback+"upload fail";
    }
}
