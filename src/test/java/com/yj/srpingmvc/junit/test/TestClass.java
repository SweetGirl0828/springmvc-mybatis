package com.yj.srpingmvc.junit.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yj.srpingmvc.junit.base.BaseTest;
import com.yj.srpingmvc.user.TestUserDAO;



public class TestClass extends BaseTest{
	@Autowired
	private TestUserDAO dao;
	
	@Test
	public void test(){
		 List<Map<String,String>> resultList = dao.findAll("");
		System.out.println(resultList);
	}

}
