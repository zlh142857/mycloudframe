package com.hx.controller;

import com.hx.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class HiController {
    @Value("${server.port}")
    String port;
    @Autowired
    private HiService hiService;
    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
    @RequestMapping("/test")
    @ResponseBody
    public long test(HttpServletRequest request, HttpServletResponse response){
        Long count=hiService.selectCount();
        return count;
    }
}
