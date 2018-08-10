package com.hx.service;

import com.hx.model.Personnel;

import java.util.List;

public interface PersonnelService {
    List<Personnel> selectPersonner(Integer pageStart, Integer pageSize) ;

    String deletePersonner(Integer userId);

    String savePersonner(Personnel personnel);
}
