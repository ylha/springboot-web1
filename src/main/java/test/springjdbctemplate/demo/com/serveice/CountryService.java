package test.springjdbctemplate.demo.com.serveice;

import test.springjdbctemplate.demo.Country;

import java.util.List;

public interface CountryService {
    int add(Country c);
    List<Country> getList();
}
