package com.database.ELP.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginModel {
	@Id
	private int id;
	private String Email;
	private String password;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
