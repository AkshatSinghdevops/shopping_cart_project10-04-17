package com.niit.shoppingcart.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="User")  //if the class name and table name is different
@Component
public class User {
	
	@Id
	private String id;
	
	
	
	private String name;
	
	private String password;
	
	private String phone;
	
	private String email;
	
	private String role;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact() {
		return phone;
	}

	public void setContact(String contact) {
		this.phone=phone;
	}

	public String getMail() {
		return email;
	}

	public void setMail(String mail) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	

}
