package com.hx.service.impl;

import com.hx.dao.PersonnelDao;
import com.hx.model.Personnel;
import com.hx.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("personnerService")
public class PersonnelServiceImpl implements PersonnelService {
    @Autowired
    PersonnelDao personnelDao;

    @Override
    public List<Personnel> selectPersonner(Integer pageStart, Integer pageSize){
        List<Personnel> list=null;
        try {
            list=personnelDao.findPersonner(pageStart,pageSize);
            return list;
        }catch (Exception e){
            System.out.println("查询失败");
        }
        return list;
    }


    @Override
    public String deletePersonner(Integer userId){
        try {
            Integer count=personnelDao.deletePersonner(userId);
            if(count != 0){
                return "删除成功";
            }
        }catch (Exception e){
            System.out.println("删除失败");
        }
        return "删除失败";
    }

    @Override
    public String savePersonner(Personnel personnel) {
        try{
            Personnel per= personnelDao.save(personnel);
            if(per != null){
                return "新增成功";
            }
        }catch (Exception e){
            System.out.println("新增失败");
        }
        return "新增失败";
    }
}
