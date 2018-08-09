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
    @RequestMapping(value="/savePersonnel",method=RequestMethod.POST)
    public String savePersonnel(String userName,String userSex,String userKiev,String userNation,
                                String userNative,String userHealth,String userBirthday,String userPartyTime,
                                String userTimeToWork, String callback,String userEducation,
                                String userSchoolTag,String userBiye,String userFamilyName,
                                String userTypeOfKinship,String userContact,String userProfessional,
                                String userTheNation) throws Exception {
        Integer count=personnerService.savePersonner(userName,userSex,userKiev,userNation,userNative,
                userHealth,userBirthday,userPartyTime,userTimeToWork,userEducation,userSchoolTag,
                userBiye,userFamilyName,userTypeOfKinship,userContact,userProfessional,userTheNation);
        if(count != 0){
            return callback +"(新增成功)";
        }
        return callback +"(新增失败)";
    }
    //查询,分页
    @RequestMapping(value="/selectPersonnel")
    public String selectPersonnel(String callback,Integer pageStart,Integer pageSize) throws Exception {
        List<Personnel> list=personnerService.selectPersonner(pageStart,pageSize);
        String json=JSONObject.toJSONStringWithDateFormat(list,"yyyy-MM-dd");
        return callback +"("+json+")";
    }
    //根据id删除
    @RequestMapping(value="/deletePersonnel",method=RequestMethod.POST)
    public String deletePersonnel(Integer userId, String callback)throws Exception{
        Integer count=personnerService.deletePersonner(userId);
        if(count != 0){
            return callback +"(删除成功)";
        }
        return callback +"(删除失败)";
    }
}

