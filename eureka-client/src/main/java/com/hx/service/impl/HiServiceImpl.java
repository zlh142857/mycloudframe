package com.hx.service.impl;

import com.hx.dao.HiDao;
import com.hx.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiServiceImpl implements HiService {
    @Autowired
    private HiDao hiDao;
    @Override
    public Long selectCount() {
        Long count=hiDao.count();
        return count;
    }
}
