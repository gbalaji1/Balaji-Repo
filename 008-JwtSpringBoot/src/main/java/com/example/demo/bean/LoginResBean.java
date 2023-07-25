package com.example.demo.bean;

public class LoginResBean {

	private String jwtToken;
	private String username;

	public LoginResBean(String jwtToken, String username) {
		super();
		this.jwtToken = jwtToken;
		this.username = username;
	}

	public LoginResBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
