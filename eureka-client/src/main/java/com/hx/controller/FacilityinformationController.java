/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: FacilityinformationController
 * Author:   zlh
 * Date:     2018/8/12 14:54
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hx.controller;

import com.alibaba.fastjson.JSONObject;
import com.hx.model.Facilityinformation;
import com.hx.model.Personnel;
import com.hx.service.FacilityinformationService;
import com.hx.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zlh
 * @create 2018/8/12
 * @since 1.0.0
 */
@RestController
public class FacilityinformationController {
    @Autowired
    FacilityinformationService facilityinformationService;
    //新增
    @RequestMapping(value="/saveFacility")
    public String saveFacility(Facilityinformation facilityinformation){
        String str=facilityinformationService.saveFacility(facilityinformation);
        JSONObject json = new JSONObject();
        json.put("str", str);
        return "successCallBack("+json.toJSONString()+")";
    }
    //查询,分页
    @RequestMapping(value="/selectFacility")
    public String selectFacility(Integer pageStart,Integer pageSize) {
        List<Facilityinformation> list=facilityinformationService.selectFacility(pageStart,pageSize);
        String json= JSONObject.toJSONString(list);
        return json;
    }
    //根据id删除
    @RequestMapping(value="/deleteFacility")
    public String deleteFacility(Integer facilityId){
        String str=facilityinformationService.deleteFacility(facilityId);
        JSONObject json = new JSONObject();
        json.put("str", str);
        return "successCallBack("+json.toJSONString()+")";
    }
}