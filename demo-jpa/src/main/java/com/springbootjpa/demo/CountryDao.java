package com.springbootjpa.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CountryDao  extends JpaRepository<Country,Long>{
    /**
     * 自定义jpa 删除与更新sql语句
     * @param id
     * @return
     */
        @Transactional
        @Modifying
        @Query(value = "delete  from country where id = :id",nativeQuery = true)
        public int delete(@Param("id") long id);
    @Transactional
    @Modifying
    @Query(value = "update  country set countryname=:name where id = :id",nativeQuery = true)
    public int update(@Param("name") String name,@Param("id") long id);
}
