package com.example.springtemplates;

import java.util.List;

public interface CountryDao {
    int add(Country c);
    List<Country> getList();
}
