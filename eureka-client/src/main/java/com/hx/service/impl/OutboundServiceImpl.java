/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: OutboundServiceImpl
 * Author:   zlh
 * Date:     2018/8/12 15:44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hx.service.impl;

import com.hx.dao.FilenfoDao;
import com.hx.dao.OutboundDao;
import com.hx.model.Filenfo;
import com.hx.model.Outbound;
import com.hx.service.OutboundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zlh
 * @create 2018/8/12
 * @since 1.0.0
 */
@Service
public class OutboundServiceImpl implements OutboundService{
    @Autowired
    OutboundDao outboundDao;

    @Override
    public String saveOutbound(Outbound outbound) {
        try{
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            Date returndate=sdf.parse(outbound.getExitReturndate());
            Date togo=sdf.parse(outbound.getExitTogoabroadtodate());
            outbound.setExitReturndatet(returndate);
            outbound.setExitTogoabroadtodatet(togo);
            Outbound out=outboundDao.save(outbound);
            if(out != null){
                return "新增成功";
            }
        }catch (Exception e){
            System.out.println("新增失败");
        }
        return "新增失败";
    }

    @Override
    public List<Outbound> selectOutbound(Integer pageStart, Integer pageSize) {
        List<Outbound> list=null;
        try {
            list=outboundDao.selectOutbound(pageStart,pageSize);
            return list;
        }catch (Exception e){
            System.out.println("查询失败");
        }
        return list;
    }

    @Override
    public String deleteOutbound(Integer exitId) {
        try {
            Integer count=outboundDao.deleteOutbound(exitId);
            if(count != 0){
                return "删除成功";
            }
        }catch (Exception e){
            System.out.println("删除失败");
        }
        return "删除失败";
    }
}