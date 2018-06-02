package com.springbootmongodb.demo;


import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class Country implements Serializable {
    //实体类参考本人博客地址：https://blog.csdn.net/yl_hahha/article/details/80208161\
    @Id
    private String id;
    private String countryname;
    private String countrycode;

    public Country() {
    }

    //idea 生成构造器的快捷键  alt+insert
    public Country(String countryname, String countrycode) {
        this.countryname = countryname;
        this.countrycode = countrycode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }
    public String getCountrycode() {
        return countrycode;
    }
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
    @Override
    public String toString() {
        return "Country [id=" + id + ", countryname=" + countryname + ", countrycode=" + countrycode + "]";
    }
}
