/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: FacilityinformationService
 * Author:   zlh
 * Date:     2018/8/12 14:55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hx.service;

import com.hx.model.Facilityinformation;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zlh
 * @create 2018/8/12
 * @since 1.0.0
 */
public interface FacilityinformationService {

    String saveFacility(Facilityinformation facilityinformation);

    List<Facilityinformation> selectFacility(Integer pageStart, Integer pageSize);

    String deleteFacility(Integer facilityId);
}