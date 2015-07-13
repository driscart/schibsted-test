package com.schibsted.test.service.impl;

import com.schibsted.test.dao.UserDao;
import com.schibsted.test.dao.impl.UserDaoImpl;
import com.schibsted.test.model.User;
import com.schibsted.test.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public User getUser(String username, String password) {
		return getUserDao().getUser(username, password);
	}

	public UserDao getUserDao() {
		if(userDao == null) {
			setUserDao(new UserDaoImpl());
		}
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
