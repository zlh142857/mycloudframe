package com.hx.controller;


import com.alibaba.fastjson.JSONObject;
import com.hx.service.SchedualServiceHi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
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
    /*  http:
    multipart:
      enabled: true
      file-size-threshold: 0
      location: D:\image
      max-file-size: 10240Mb
      max-request-size: 102400Mb
    * */
}
