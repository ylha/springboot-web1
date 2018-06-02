package com.springbootjpa.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryDao  extends JpaRepository<Country,Long>{

}
