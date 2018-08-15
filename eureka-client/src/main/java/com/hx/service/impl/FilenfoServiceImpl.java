/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: FilenfoServiceImpl
 * Author:   zlh
 * Date:     2018/8/12 15:15
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hx.service.impl;

import com.hx.dao.FacilityinformationDao;
import com.hx.dao.FilenfoDao;
import com.hx.model.Facilityinformation;
import com.hx.model.Filenfo;
import com.hx.service.FilenfoService;
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
public class FilenfoServiceImpl implements FilenfoService{
    @Autowired
    FilenfoDao filenfoDao;

    @Override
    public String saveFilenfo(Filenfo filenfo) {
        try{
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
            Date filedate=sdf.parse(filenfo.getFileDateofdispatch());
            filenfo.setFileDateofdispatcht(filedate);
            Filenfo file=filenfoDao.save(filenfo);
            if(file != null){
                return "新增成功";
            }
        }catch (Exception e){
            System.out.println("新增失败");
        }
        return "新增失败";
    }

    @Override
    public List<Filenfo> selectFilenfo(Integer pageStart, Integer pageSize) {
        List<Filenfo> list=null;
        try {
            list=filenfoDao.selectFilenfo(pageStart,pageSize);
            return list;
        }catch (Exception e){
            System.out.println("查询失败");
        }
        return list;
    }

    @Override
    public String deleteFilenfo(Integer fileId) {
        try {
            Integer count=filenfoDao.deleteFilenfo(fileId);
            if(count != 0){
                return "删除成功";
            }
        }catch (Exception e){
            System.out.println("删除失败");
        }
        return "删除失败";
    }
}