package com.hxzy.mybatis.pojo;

import java.util.Date;

public class User {
	private  int id;
	private  String name;
	private  int age;
	private  Date birthday;
	private  int  mySal;
	
	
	
	
	public int getMySal() {
		return mySal;
	}
	public void setMySal(int mySal) {
		this.mySal = mySal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", birthday=" + birthday + ", mySal=" + mySal
				+ "]";
	}
	public User(int id, String name, int age, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}
	public User() {
		super();
	}
	
	
	
	

}
