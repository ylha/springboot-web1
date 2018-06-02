package com.demomybatistransational.demo;

import org.springframework.beans.factory.NamedBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class CountryServiceImpl {
    @Autowired(required = false)
    private CountryMapper mapper;
    @Transactional
    public void testUpdate(){
        long id =2;
         mapper.update("dq",id);
         int i=1/0;
         mapper.update("hh",id);
    }
}
