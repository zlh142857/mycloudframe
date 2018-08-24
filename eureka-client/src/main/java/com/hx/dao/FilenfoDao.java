/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: FilenfoDao
 * Author:   zlh
 * Date:     2018/8/12 15:16
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hx.dao;

import com.hx.model.Filenfo;
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
public interface FilenfoDao extends CrudRepository<Filenfo,Integer> {
    @Query(value="SELECT * FROM fileinfo LIMIT :pageStart,:pageSize",nativeQuery = true)
    List<Filenfo> selectFilenfo(@Param("pageStart") Integer pageStart,@Param("pageSize") Integer pageSize);
    @Modifying
    @Query(value="DELETE FROM fileinfo WHERE File_Id=:fileId",nativeQuery = true)
    Integer deleteFilenfo(@Param("fileId")Integer fileId);
}