package com.wayne.jwt.demo.model;

import java.io.Serializable;

public class JwtRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7143180644058710402L;
	private String username;
	private String password;
	public JwtRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public JwtRequest() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
