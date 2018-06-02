package com.demomybatis.demomybatis;



import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import javax.naming.Name;
import java.util.List;

/**
 * service层是给controller调用，如果想写需要将dao包装成service，然后实现类来调用dao 来提供给controller调用
 */
@Mapper
public interface CountryMapper {
    @Insert("insert into country(countryname, countrycode) values(#{countryname}, #{countrycode})")
    int add(@Param("countryname") String countryname, @Param("countrycode") String countrycode);


    @Select("select id, countryname as countryname, countrycode as countrycode from country")
    List<Country> findCounList();
}
