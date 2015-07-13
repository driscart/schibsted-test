package com.schibsted.test.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "rol" )
public class Rol {
	
	private String idRol;

	public String getIdRol() {
		return idRol;
	}
	@XmlElement( name = "idRol" )
	public void setIdRol(String idRol) {
		this.idRol = idRol;
	}
	
}
