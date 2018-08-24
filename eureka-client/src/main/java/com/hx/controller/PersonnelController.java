package com.hx.controller;

import com.alibaba.fastjson.JSONObject;
import com.hx.model.Personnel;
import com.hx.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.concurrent.SuccessCallback;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
public class PersonnelController {
    public static final String ISO_8859_1 = "ISO-8859-1";
    @Autowired
    PersonnelService personnerService;
    //新增
    @RequestMapping(value="/savePersonnel")
    public String savePersonnel(Personnel personnel){
        String str=personnerService.savePersonner(personnel);
        JSONObject json = new JSONObject();
        json.put("str", str);
        return "successCallBack("+json.toJSONString()+")";
    }
    //查询,分页
    @RequestMapping(value="/selectPersonnel")
    public String selectPersonnel(Integer pageStart,Integer pageSize) {
        List<Personnel> list=personnerService.selectPersonner(pageStart,pageSize);
        String json=JSONObject.toJSONStringWithDateFormat(list,"yyyy-MM-dd");
        return json;
    }
    //根据id删除
    @RequestMapping(value="/deletePersonnel")
    public String deletePersonnel(Integer userId, HttpServletRequest req, HttpServletResponse res){
        String str=personnerService.deletePersonner(userId);
        JSONObject json = new JSONObject();
        json.put("str", str);
        return "successCallBack("+json.toJSONString()+")";
    }
}

