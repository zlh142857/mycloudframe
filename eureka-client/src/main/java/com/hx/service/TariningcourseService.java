/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: TariningcourseService
 * Author:   zlh
 * Date:     2018/8/12 15:54
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hx.service;

import com.hx.model.Outbound;
import com.hx.model.Tariningcourse;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zlh
 * @create 2018/8/12
 * @since 1.0.0
 */
public interface TariningcourseService {

    String saveTariningcourse(Tariningcourse tariningcourse);

    List<Tariningcourse> selectTariningcourse(Integer pageStart, Integer pageSize);

    String deleteTariningcourse(Integer courseId);
}