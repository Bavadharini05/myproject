package com.database.ELP.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserModel {
	@Id
	private int id;
	private String email;
	private String password;
	private String username;
	private String MobileNumber;
	private String UserRole;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getUserRole() {
		return UserRole;
	}
	public void setUserRole(String userRole) {
		UserRole = userRole;
	}
	
}
