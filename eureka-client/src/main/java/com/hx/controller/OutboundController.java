/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: OutboundController
 * Author:   zlh
 * Date:     2018/8/12 15:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hx.controller;

import com.alibaba.fastjson.JSONObject;
import com.hx.model.Filenfo;
import com.hx.model.Outbound;
import com.hx.service.FilenfoService;
import com.hx.service.OutboundService;
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
public class OutboundController {
    @Autowired
    OutboundService outboundService;
    //新增
    @RequestMapping(value="/saveOutbound")
    public String saveOutbound(Outbound outbound, String callback){
        String str=outboundService.saveOutbound(outbound);
        return callback +str;
    }
    //查询,分页
    @RequestMapping(value="/selectOutbound")
    public String selectOutbound(String callback,Integer pageStart,Integer pageSize) {
        List<Outbound> list=outboundService.selectOutbound(pageStart,pageSize);
        String json= JSONObject.toJSONStringWithDateFormat(list,"yyyy-MM-dd");
        return callback +json;
    }
    //根据id删除
    @RequestMapping(value="/deleteOutbound")
    public String deleteOutbound(Integer exitId, String callback){
        String str=outboundService.deleteOutbound(exitId);
        return callback +str;
    }
}