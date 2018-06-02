package com.demomybatis.demomybatis;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemomybatisApplicationTests {
	@Autowired(required = false)
	private CountryMapper mapper;
	@Test
	public void contextLoads() {
	}
	@Test
    public void testFindAll(){
		List<Country> counList = mapper.findCounList();
		Assert.assertTrue(counList.size()>1);
	}
	//
	@Test
	public void testInsert(){
		int add = mapper.add("shenzhen", "sz");
		Assert.assertTrue(add>0);
	}
}
