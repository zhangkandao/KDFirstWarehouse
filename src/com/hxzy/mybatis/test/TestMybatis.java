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

		// 获取sqlSessionFactoryBuilder对象

		SqlSessionFactoryBuilder sessionFactoryBuilder =

				new SqlSessionFactoryBuilder();

		// 获取配置文件上的一个字符输入流
		Reader resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");

		// 获取SqlSessionFactory对象
		SqlSessionFactory build = sessionFactoryBuilder.build(resourceAsReader);

		// 获取SqlSession对象

		SqlSession openSession = build.openSession();

		String sql = "com.hxzy.mybatis.pojo.UserMapper.insertUser";

		// 执行sql操作
		// 该方法的第二个就是sql当中输入参数的类型

		// 创建一个User对象
		User user = new User(10, "吴疆", 20, new Date());

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

		//获取Dao的实例
		
//		UserDao  userDao=  openSession.getMapper(UserDao.class);
//		
//		 List<User>  users= userDao.findUsers();
//		for(User user:users) {
//			System.out.println(user);
//		}
//	
//		User  user =  new User(20, "李四", 20, new Date());
//		UserDao mapper = openSession.getMapper(UserDao.class);
//		
//		User user = mapper.findUserById(20);
//		System.out.println(user);
		
		// 提交事务

		openSession.commit();

		// 关闭连接
		openSession.close();

	}

}
