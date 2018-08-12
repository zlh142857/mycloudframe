/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: TariningcourseServiceImpl
 * Author:   zlh
 * Date:     2018/8/12 15:54
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hx.service.impl;

import com.hx.dao.OutboundDao;
import com.hx.dao.TariningcourseDao;
import com.hx.model.Outbound;
import com.hx.model.Tariningcourse;
import com.hx.service.TariningcourseService;
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
public class TariningcourseServiceImpl implements TariningcourseService{
    @Autowired
    TariningcourseDao tariningcourseDao;

    @Override
    public String saveTariningcourse(Tariningcourse tariningcourse) {
        try{
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            Date dura=sdf.parse(tariningcourse.getCourseDuration());
            tariningcourse.setCourseDurationt(dura);
            Tariningcourse tar=tariningcourseDao.save(tariningcourse);
            if(tar != null){
                return "新增成功";
            }
        }catch (Exception e){
            System.out.println("新增失败");
        }
        return "新增失败";
    }

    @Override
    public List<Tariningcourse> selectTariningcourse(Integer pageStart, Integer pageSize) {
        List<Tariningcourse> list=null;
        try {
            list=tariningcourseDao.selectTariningcourse(pageStart,pageSize);
            return list;
        }catch (Exception e){
            System.out.println("查询失败");
        }
        return list;
    }

    @Override
    public String deleteTariningcourse(Integer courseId) {
        try {
            Integer count=tariningcourseDao.deleteTariningcourse(courseId);
            if(count != 0){
                return "删除成功";
            }
        }catch (Exception e){
            System.out.println("删除失败");
        }
        return "删除失败";
    }
}