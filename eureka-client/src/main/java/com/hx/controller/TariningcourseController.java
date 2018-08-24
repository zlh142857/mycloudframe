/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: TariningcourseController
 * Author:   zlh
 * Date:     2018/8/12 15:53
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hx.controller;

import com.alibaba.fastjson.JSONObject;
import com.hx.model.Outbound;
import com.hx.model.Tariningcourse;
import com.hx.service.OutboundService;
import com.hx.service.TariningcourseService;
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
public class TariningcourseController {
    @Autowired
    TariningcourseService tariningcourseService;
    //新增
    @RequestMapping(value="/saveTariningcourse")
    public String saveTariningcourse(Tariningcourse tariningcourse){
        String str=tariningcourseService.saveTariningcourse(tariningcourse);
        JSONObject json = new JSONObject();
        json.put("str", str);
        return "successCallBack("+json.toJSONString()+")";
    }
    //查询,分页
    @RequestMapping(value="/selectTariningcourse")
    public String selectTariningcourse(Integer pageStart,Integer pageSize) {
        List<Tariningcourse> list=tariningcourseService.selectTariningcourse(pageStart,pageSize);
        String json= JSONObject.toJSONStringWithDateFormat(list,"yyyy-MM-dd");
        return json;
    }
    //根据id删除
    @RequestMapping(value="/deleteTariningcourse")
    public String deleteTariningcourse(Integer courseId){
        String str=tariningcourseService.deleteTariningcourse(courseId);
        JSONObject json = new JSONObject();
        json.put("str", str);
        return "successCallBack("+json.toJSONString()+")";
    }
}