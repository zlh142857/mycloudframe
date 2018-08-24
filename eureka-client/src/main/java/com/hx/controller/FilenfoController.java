/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: FilenfoController
 * Author:   zlh
 * Date:     2018/8/12 15:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hx.controller;

import com.alibaba.fastjson.JSONObject;
import com.hx.model.Facilityinformation;
import com.hx.model.Filenfo;
import com.hx.service.FacilityinformationService;
import com.hx.service.FilenfoService;
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
public class FilenfoController {
    @Autowired
    FilenfoService filenfoService;
    //新增
    @RequestMapping(value="/saveFilenfo")
    public String saveFilenfo(Filenfo filenfo){
        String str=filenfoService.saveFilenfo(filenfo);
        JSONObject json = new JSONObject();
        json.put("str", str);
        return "successCallBack("+json.toJSONString()+")";
    }
    //查询,分页
    @RequestMapping(value="/selectFilenfo")
    public String selectFilenfo(Integer pageStart,Integer pageSize) {
        List<Filenfo> list=filenfoService.selectFilenfo(pageStart,pageSize);
        String json= JSONObject.toJSONStringWithDateFormat(list,"yyyy-MM-dd");
        return json;
    }
    //根据id删除
    @RequestMapping(value="/deleteFilenfo")
    public String deleteFilenfo(Integer fileId){
        String str=filenfoService.deleteFilenfo(fileId);
        return JSONObject.toJSONString("successCallBack("+str+")");
    }

}