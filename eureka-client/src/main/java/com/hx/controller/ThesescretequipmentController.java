/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ThesescretequipmentController
 * Author:   zlh
 * Date:     2018/8/12 16:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hx.controller;

import com.alibaba.fastjson.JSONObject;
import com.hx.model.Tariningcourse;
import com.hx.model.Thesescretequipment;
import com.hx.service.TariningcourseService;
import com.hx.service.ThesescretequipmentService;
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
public class ThesescretequipmentController {
    @Autowired
    ThesescretequipmentService thesescretequipmentService;
    //新增
    @RequestMapping(value="/saveThesescretequipment")
    public String saveThesescretequipment(Thesescretequipment tariningcourse){
        String str=thesescretequipmentService.saveThesescretequipment(tariningcourse);
        JSONObject json = new JSONObject();
        json.put("str", str);
        return "successCallBack("+json.toJSONString()+")";
    }
    //查询,分页
    @RequestMapping(value="/selectThesescretequipment")
    public String selectThesescretequipment(Integer pageStart,Integer pageSize) {
        List<Thesescretequipment> list=thesescretequipmentService.selectThesescretequipment(pageStart,pageSize);
        String json= JSONObject.toJSONString(list);
        return json;
    }
    //根据id删除
    @RequestMapping(value="/deleteThesescretequipment")
    public String deleteThesescretequipment(Integer courseId){
        String str=thesescretequipmentService.deleteThesescretequipment(courseId);
        JSONObject json = new JSONObject();
        json.put("str", str);
        return "successCallBack("+json.toJSONString()+")";
    }
}