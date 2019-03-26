package com.hxzy.mybatis.dao;

import java.util.List;

import com.hxzy.mybatis.pojo.User;

public interface UserDao {
	
	public  void insertUser(User user);
	public  void deleteUserById(int id);
	public  User  findUserById(int id);
	public List<User>  findUsers();
	
	

}
