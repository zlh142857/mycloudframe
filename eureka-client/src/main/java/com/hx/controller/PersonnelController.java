package com.hx.controller;

import com.alibaba.fastjson.JSONObject;
import com.hx.model.Personnel;
import com.hx.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonnelController {
    @Autowired
    PersonnelService personnerService;
    //新增
    @RequestMapping(value="/savePersonnel")
    public String savePersonnel(String callback){
        Personnel personnel=new Personnel();
        personnel.setUserName("力气");
        String str=personnerService.savePersonner(personnel);
        return callback +str;
    }
    //查询,分页
    @RequestMapping(value="/selectPersonnel")
    public String selectPersonnel(String callback,Integer pageStart,Integer pageSize) {
        List<Personnel> list=personnerService.selectPersonner(pageStart,pageSize);
        String json=JSONObject.toJSONStringWithDateFormat(list,"yyyy-MM-dd");
        return callback +json;
    }
    //根据id删除
    @RequestMapping(value="/deletePersonnel")
    public String deletePersonnel(Integer userId, String callback){
        String str=personnerService.deletePersonner(userId);
        return callback +str;
    }
}

