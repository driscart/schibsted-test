package com.schibsted.test.dao.impl;

import java.io.File;
import java.net.URLDecoder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.schibsted.test.dao.UserDao;
import com.schibsted.test.model.User;
import com.schibsted.test.model.UserXML;

public class UserDaoImpl implements UserDao {
	
	public UserXML getAllUsers() {
		
		UserXML users = new UserXML();
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(UserXML.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			//Convert url to utf-8 to replace %20 for space
			ClassLoader classLoader = getClass().getClassLoader();
			String path = classLoader.getResource("users.xml").getFile();
			path = URLDecoder.decode(path, "utf-8");
			File fileXml = new File(path);
			if (fileXml.exists()) {
				users = (UserXML) jaxbUnmarshaller.unmarshal(fileXml);
			}
		} catch (Exception e) {
			System.out.println("Can't get users: " + e.getStackTrace());
		}
		return users;
		
	}

	public User getUser(String username, String password) {
		UserXML users = getAllUsers();
		User userFinded = null; 
		if (users != null) {
			for (User user : users.getUsers()) {
				if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
					userFinded = user;
					break;
				}
			}
		}
		return userFinded;
	}

}
