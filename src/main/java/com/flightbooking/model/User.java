package com.flightbooking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int user_id;
	
	private String email;
	
	private String username;
	
	private String password;
	
	@Column(columnDefinition="tinyint(1) default 0")
	private Boolean isAdmin;
	
	public User() {
		
	}

	public User(int user_id, String email, String username, String password, Boolean isAdmin) {
		super();
		this.user_id = user_id;
		this.email = email;
		this.username = username;
		this.password = password;
		this.isAdmin = isAdmin;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}


	
	
	
}
