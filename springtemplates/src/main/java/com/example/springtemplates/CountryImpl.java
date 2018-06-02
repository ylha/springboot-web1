package com.example.springtemplates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 实现类
 */
@Repository
public class CountryImpl implements CountryDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Country c) {
        return jdbcTemplate.update("INSERT into country(countryname,countrycode) VALUES ('beijing','666')");
    }

    @Override
    public List<Country> getList() {
        //快速生成返回值 crtl+alt+v
        List<Country> query = jdbcTemplate.query("select * from country", new Object[]{},new BeanPropertyRowMapper<>(Country.class));
        if (query != null && query.size() > 0){
            return query;
        }
        return null;
    }
}
