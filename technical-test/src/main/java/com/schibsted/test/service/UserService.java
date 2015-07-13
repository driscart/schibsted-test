package com.schibsted.test.service;

import com.schibsted.test.model.User;

public interface UserService {

	User getUser(String username, String password);
	
}
