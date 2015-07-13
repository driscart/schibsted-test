package com.schibsted.test.dao;

import com.schibsted.test.model.User;

public interface UserDao {

	User getUser(String username, String password);
	
}
