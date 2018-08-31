package com.hx.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

@RestController
public class TxtController {
    @RequestMapping(value="/txt")
    public String txt(@RequestParam("file") MultipartFile file,
                      HttpServletRequest request){
        if(file.isEmpty()){
            JSONObject json = new JSONObject();
            String str="file为空";
            json.put("str", str);
            return "successCallBack("+json.toJSONString()+")";
        }else{
            try {
                InputStream infile=file.getInputStream();
                System.out.println(infile);
            } catch (IOException e) {
                e.printStackTrace();
                return "获取inputstream出错";
            }
            JSONObject json = new JSONObject();
            String str="有file";
            json.put("str", str);
            return "successCallBack("+json.toJSONString()+")";
        }
    }

}
