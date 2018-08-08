package com.hx.controller;


import com.alibaba.fastjson.JSONObject;
import com.hx.config.FileUtil;
import com.hx.service.SchedualServiceHi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;


@RestController
public class TestController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam String name, String callback) {
        String result=schedualServiceHi.sayHiFromClientOne( name );
        String json= JSONObject.toJSONString(result);
        return callback +"("+json+")";
    }

    @RequestMapping(value="/toIndex")
    public String index(){
        System.out.println("ddddddddddddddddddddddddddddddddddddddddddd");

        return "/index";
    }
    //处理文件上传
    @RequestMapping(value="/uploadimg", method = RequestMethod.POST)
    public String uploadImg(@RequestParam("file") MultipartFile file,
                     HttpServletRequest request) {
        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();
        try {
            FileUtil.uploadFile(file.getBytes(), fileName);
        } catch (Exception e) {
            // TODO: handle exception
        }
        //返回json
        return "uploadimg success";
    }
}
