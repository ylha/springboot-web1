package com.demomybatistransational.demo;



public class Country {
    //实体类参考本人博客地址：https://blog.csdn.net/yl_hahha/article/details/80208161
    private long id;
    private String countryname;
    private String countrycode;
    public long getId() {
        return id;
    }
    public void setId(long id) {
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
