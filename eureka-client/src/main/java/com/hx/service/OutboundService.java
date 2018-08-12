/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: OutboundService
 * Author:   zlh
 * Date:     2018/8/12 15:44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hx.service;

import com.hx.model.Outbound;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zlh
 * @create 2018/8/12
 * @since 1.0.0
 */
public interface OutboundService {

    String saveOutbound(Outbound outbound);

    List<Outbound> selectOutbound(Integer pageStart, Integer pageSize);

    String deleteOutbound(Integer exitId);
}