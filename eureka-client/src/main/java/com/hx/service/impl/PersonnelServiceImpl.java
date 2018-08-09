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
    public Integer savePersonner(String userName,String userSex,String userKiev,String userNation,
                                 String userNative,String userHealth,String userBirthday,String userPartyTime,
                                 String userTimeToWork,String userEducation,
                                 String userSchoolTag,String userBiye,String userFamilyName,
                                 String userTypeOfKinship,String userContact,String userProfessional,
                                 String userTheNation) throws Exception{
        Integer count= personnelDao.savePersonner(userName,userSex,userKiev,userNation,userNative,
                userHealth,userBirthday,userPartyTime,userTimeToWork,userEducation,userSchoolTag,
                userBiye,userFamilyName,userTypeOfKinship,userContact,userProfessional,userTheNation);
        return count;
    }

    @Override
    public List<Personnel> selectPersonner(Integer pageStart, Integer pageSize) throws Exception{
        List<Personnel> list=personnelDao.findPersonner(pageStart,pageSize);
        return list;
    }


    @Override
    public Integer deletePersonner(Integer userId)throws Exception {
        Integer count=personnelDao.deletePersonner(userId);
        return count;
    }
}
