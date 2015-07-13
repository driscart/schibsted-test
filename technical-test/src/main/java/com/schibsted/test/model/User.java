package com.schibsted.test.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "user" )
public class User {

	private String username;
	private String password;
	private Roles roles;
	
	public String getUsername() {
		return username;
	}
	@XmlElement( name = "username" )
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	@XmlElement( name = "password" )
	public void setPassword(String password) {
		this.password = password;
	}
	public Roles getRoles() {
		return roles;
	}
	@XmlElement( name = "roles" )
	public void setRoles(Roles roles) {
		this.roles = roles;
	}
	
}
