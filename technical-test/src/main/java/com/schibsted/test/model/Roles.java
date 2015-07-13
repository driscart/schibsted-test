package com.schibsted.test.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "roles" )
public class Roles {
	
	private List<Rol> roles;

	public List<Rol> getRoles() {
		return roles;
	}
	@XmlElement( name = "rol" )
	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}

}
