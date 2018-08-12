/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ThesescretequipmentServiceImpl
 * Author:   zlh
 * Date:     2018/8/12 16:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hx.service.impl;

import com.hx.dao.TariningcourseDao;
import com.hx.dao.ThesescretequipmentDao;
import com.hx.model.Tariningcourse;
import com.hx.model.Thesescretequipment;
import com.hx.service.ThesescretequipmentService;
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
public class ThesescretequipmentServiceImpl implements ThesescretequipmentService{
    @Autowired
    ThesescretequipmentDao thesescretequipmentDao;

    @Override
    public String saveThesescretequipment(Thesescretequipment thesescretequipment) {
        try{
            Thesescretequipment the=thesescretequipmentDao.save(thesescretequipment);
            if(the != null){
                return "新增成功";
            }
        }catch (Exception e){
            System.out.println("新增失败");
        }
        return "新增失败";
    }

    @Override
    public List<Thesescretequipment> selectThesescretequipment(Integer pageStart, Integer pageSize) {
        List<Thesescretequipment> list=null;
        try {
            list=thesescretequipmentDao.selectThesescretequipment(pageStart,pageSize);
            return list;
        }catch (Exception e){
            System.out.println("查询失败");
        }
        return list;
    }

    @Override
    public String deleteThesescretequipment(Integer courseId) {
        try {
            Integer count=thesescretequipmentDao.deleteThesescretequipment(courseId);
            if(count != 0){
                return "删除成功";
            }
        }catch (Exception e){
            System.out.println("删除失败");
        }
        return "删除失败";
    }
}