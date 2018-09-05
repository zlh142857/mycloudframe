package com.hx.controller;

import com.hx.config.FileUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@RestController
public class HttpTwo {
    @RequestMapping("/httptwo")
    public void httptwo(MultipartFile file, HttpServletResponse response){
        String fileName=file.getOriginalFilename();
        try {
            FileUtil.uploadFile(file.getBytes(), fileName);
            response.setCharacterEncoding("utf-8");
            response.setContentType("application/json; charset=utf-8");
            PrintWriter out = response.getWriter();
            out.print("成功了");
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
