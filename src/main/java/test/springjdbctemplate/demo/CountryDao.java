package test.springjdbctemplate.demo;

import java.util.List;

public interface CountryDao {
    int add(Country c);
    List<Country> getList();
}
