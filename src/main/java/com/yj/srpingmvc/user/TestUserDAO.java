package com.yj.srpingmvc.user;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import IBaseDao.IBaseDao;

public interface TestUserDAO extends IBaseDao{
	
	void insertList(@Param("list") List<Map<String,Object>> list);
	void insert(Map<String,Object> map);
	void update(Map<String,Object> list);
	
	void delete(Map<String,Object> list);

	Map<String,String> findById(String id);
	List<Map<String,String>> findAll(String id);

}
