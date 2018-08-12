/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ThesescretequipmentService
 * Author:   zlh
 * Date:     2018/8/12 16:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hx.service;

import com.hx.model.Thesescretequipment;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zlh
 * @create 2018/8/12
 * @since 1.0.0
 */
public interface ThesescretequipmentService {

    String saveThesescretequipment(Thesescretequipment tariningcourse);

    List<Thesescretequipment> selectThesescretequipment(Integer pageStart, Integer pageSize);

    String deleteThesescretequipment(Integer courseId);
}