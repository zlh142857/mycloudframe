package com.hx.service;

import com.hx.model.Personnel;

import java.util.List;

public interface PersonnelService {
    Integer savePersonner(String userName, String userSex, String userKiev, String userNation, String userNative,
                          String userHealth, String userBirthday, String userPartyTime, String userTimeToWork,
                          String userEducation, String userSchoolTag, String userBiye, String userFamilyName,
                          String userTypeOfKinship, String userContact, String userProfessional, String userTheNation) throws Exception;

    List<Personnel> selectPersonner(Integer pageStart, Integer pageSize) throws Exception;

    Integer deletePersonner(Integer userId)throws Exception;
}
