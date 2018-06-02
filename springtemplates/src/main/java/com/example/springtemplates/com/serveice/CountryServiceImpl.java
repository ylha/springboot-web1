package com.example.springtemplates.com.serveice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import test.springjdbctemplate.demo.CountryDao;

import java.util.List;

/**
 * 提供给controller
 * 此处我们直接用单元测试来测试，controller 无非就是restful的url
 */
@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryDao dao;

    @Override
    public int add(test.springjdbctemplate.demo.Country c) {
        return dao.add(c);
    }

    @Override
    public List<test.springjdbctemplate.demo.Country> getList() {

        return dao.getList();
    }
}
