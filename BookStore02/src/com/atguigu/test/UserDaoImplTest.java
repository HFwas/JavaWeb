package com.atguigu.test;

import org.junit.Test;

import com.atguigu.bean.User;
import com.atguigu.dao.UserDao;
import com.atguigu.dao.impl.UserDaoImpl;

public class UserDaoImplTest {

	private UserDao userDao = new UserDaoImpl();
	
	@Test
	public void testGetUser() {
		User user = userDao.getUser(new User(null, "test01", "test01", null));
		System.out.println(user);
	}

	@Test
	public void testCheckUserName() {
	}

	@Test
	public void testSaveUser() {
	}

}
