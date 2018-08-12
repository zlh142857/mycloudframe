/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: FacilityinformationServiceImpl
 * Author:   zlh
 * Date:     2018/8/12 14:55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hx.service.impl;

import com.hx.dao.FacilityinformationDao;
import com.hx.dao.PersonnelDao;
import com.hx.model.Facilityinformation;
import com.hx.model.Personnel;
import com.hx.service.FacilityinformationService;
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
public class FacilityinformationServiceImpl implements FacilityinformationService{
    @Autowired
    FacilityinformationDao facilityinformationDao;
    @Override
    public String saveFacility(Facilityinformation facilityinformation) {
        try{
            Facilityinformation fac=facilityinformationDao.save(facilityinformation);
            if(fac != null){
                return "新增成功";
            }
        }catch (Exception e){
            System.out.println("新增失败");
        }
        return "新增失败";
    }

    @Override
    public List<Facilityinformation> selectFacility(Integer pageStart, Integer pageSize) {
        List<Facilityinformation> list=null;
        try {
            list=facilityinformationDao.selectFacility(pageStart,pageSize);
            return list;
        }catch (Exception e){
            System.out.println("查询失败");
        }
        return list;
    }

    @Override
    public String deleteFacility(Integer facilityId) {
        try {
            Integer count=facilityinformationDao.deleteFacility(facilityId);
            if(count != 0){
                return "删除成功";
            }
        }catch (Exception e){
            System.out.println("删除失败");
        }
        return "删除失败";
    }
}