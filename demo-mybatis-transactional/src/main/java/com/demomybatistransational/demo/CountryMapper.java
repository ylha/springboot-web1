package com.demomybatistransational.demo;



import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * service层是给controller调用，如果想写需要将dao包装成service，然后实现类来调用dao 来提供给controller调用
 * Invalid bound statement (not found)
 * 解决方法： @MapperScan("com.demomybatistransational.demo")
 */
public interface CountryMapper {

    public int update(@Param("countryname") String countryname,@Param("id")long id);
}
