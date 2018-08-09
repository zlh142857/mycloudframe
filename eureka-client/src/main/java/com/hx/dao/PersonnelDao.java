package com.hx.dao;

import com.hx.model.Personnel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface PersonnelDao extends CrudRepository<Personnel,Integer> {
    @Modifying
    @Query(value="INSERT INTO personnnel(User_Id,User_Name,User_Sex,User_Kiev,User_Nation,User_Native,User_Health" +
            ",User_Birthday,User_PartyTime,User_TimeToWork,User_Education,User_SchoolTag,User_Biye,User_FamilyName," +
            "User_TypeOfKinship,User_Contact,User_Professional,User_TheNation) VALUES (:userId,:userName,:userSex,:userKiev," +
            ":userNation,:userNative,:userHealth,:userBirthday,:userPartyTime,:userTimeToWork,:userEducation,:userSchoolTag," +
            ":userBiye,:userFamilyName,:userTypeOfKinship,:userContact,:userProfessional,:userTheNation)",nativeQuery = true)
    Integer savePersonner(@Param("userName") String userName,@Param("userSex") String userSex,
                          @Param("userKiev") String userKiev, @Param("userNation")String userNation,
                          @Param("userNative") String userNative,
                          @Param("userHealth")String userHealth,@Param("userBirthday") String userBirthday,
                          @Param("userPartyTime") String userPartyTime,
                          @Param("userTimeToWork")String userTimeToWork, @Param("userEducation")String userEducation,
                          @Param("userSchoolTag")String userSchoolTag, @Param("userBiye")String userBiye,
                          @Param("userFamilyName")String userFamilyName, @Param("userTypeOfKinship")String userTypeOfKinship,
                          @Param("userContact")String userContact, @Param("userProfessional")String userProfessional,
                          @Param("userTheNation")String userTheNation
                          );
    @Query(value="SELECT * FROM personnel LIMIT :pageStart,:pageSize",nativeQuery = true)
    List<Personnel> findPersonner(@Param("pageStart") Integer pageStart,@Param("pageSize") Integer pageSize);//返回查询personnerlist集合

    @Modifying
    @Query(value="DELETE FROM personnel WHERE User_Id=:userId",nativeQuery = true)
    Integer deletePersonner(@Param("userId") Integer userId); //根据人员id进行删除


}
