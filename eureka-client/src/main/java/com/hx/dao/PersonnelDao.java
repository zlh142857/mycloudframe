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

    @Query(value="SELECT * FROM personnel LIMIT :pageStart,:pageSize",nativeQuery = true)
    List<Personnel> findPersonner(@Param("pageStart") Integer pageStart,@Param("pageSize") Integer pageSize);//返回查询personnerlist集合

    @Modifying
    @Query(value="DELETE FROM personnel WHERE User_Id=:userId",nativeQuery = true)
    Integer deletePersonner(@Param("userId") Integer userId); //根据人员id进行删除


}
