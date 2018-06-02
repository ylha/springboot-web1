package com.springbootmongodb.demo;


import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CountryRepository extends MongoRepository<Country,String> {
    public Country findByCountrycode(String firstName);
    public List<Country> findByCountryname(String lastName);

}
