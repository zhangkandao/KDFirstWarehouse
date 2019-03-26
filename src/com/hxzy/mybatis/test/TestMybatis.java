package com.hxzy.mybatis.test;

import java.io.IOException;
import java.io.Reader;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.hxzy.mybatis.dao.UserDao;
import com.hxzy.mybatis.pojo.User;

public class TestMybatis {

	@Test
	public void testMybatis() throws IOException {

		// ��ȡsqlSessionFactoryBuilder����

		SqlSessionFactoryBuilder sessionFactoryBuilder =

				new SqlSessionFactoryBuilder();

		// ��ȡ�����ļ��ϵ�һ���ַ�������
		Reader resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");

		// ��ȡSqlSessionFactory����
		SqlSessionFactory build = sessionFactoryBuilder.build(resourceAsReader);

		// ��ȡSqlSession����

		SqlSession openSession = build.openSession();

		String sql = "com.hxzy.mybatis.pojo.UserMapper.insertUser";

		// ִ��sql����
		// �÷����ĵڶ�������sql�����������������

		// ����һ��User����
		User user = new User(10, "�⽮", 20, new Date());

		openSession.insert(sql, user);
		
//		String  sql ="com.hxzy.mybatis.pojo.UserMapper.deleteUserById";
//		
//		openSession.delete(sql, 3);
//		String  sql ="com.hxzy.mybatis.pojo.UserMapper.findUserById";
//		
//		User user = openSession.selectOne(sql, 2);
//		System.out.println(user);
//		String  sql ="com.hxzy.mybatis.pojo.UserMapper.findUsers";
//		
//		List<User> users = openSession.selectList(sql);
//		for(User user:users) {
//			System.out.println(user);
//		}

		//��ȡDao��ʵ��
		
//		UserDao  userDao=  openSession.getMapper(UserDao.class);
//		
//		 List<User>  users= userDao.findUsers();
//		for(User user:users) {
//			System.out.println(user);
//		}
//	
//		User  user =  new User(20, "����", 20, new Date());
//		UserDao mapper = openSession.getMapper(UserDao.class);
//		
//		User user = mapper.findUserById(20);
//		System.out.println(user);
		
		// �ύ����

		openSession.commit();

		// �ر�����
		openSession.close();

	}

}
