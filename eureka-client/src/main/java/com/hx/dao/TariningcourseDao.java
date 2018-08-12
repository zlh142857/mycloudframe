/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: TariningcourseDao
 * Author:   zlh
 * Date:     2018/8/12 15:55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hx.dao;

import com.hx.model.Tariningcourse;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zlh
 * @create 2018/8/12
 * @since 1.0.0
 */
@Transactional
public interface TariningcourseDao extends CrudRepository<Tariningcourse,Integer> {
    @Query(value="SELECT * FROM tariningcourse LIMIT :pageStart,:pageSize",nativeQuery = true)
    List<Tariningcourse> selectTariningcourse(@Param("pageStart") Integer pageStart,@Param("pageSize") Integer pageSize);
    @Modifying
    @Query(value="DELETE FROM tariningcourse WHERE Course_Id=:courseId",nativeQuery = true)
    Integer deleteTariningcourse(@Param("courseId") Integer courseId);
}