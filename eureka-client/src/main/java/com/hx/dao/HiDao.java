package com.hx.dao;

import com.hx.model.Test;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface HiDao extends CrudRepository<Test,Integer> {
    long count();
}
