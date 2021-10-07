package com.example.demo.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	private String  Collegename;
	private String  Username;
	private Integer  Mobilenumber;
	private String  Address;
	private String  Password;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getCollegename() {
		return Collegename;
	}
	public void setCollegename(String collegename) {
		Collegename = collegename;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public Integer getMobilenumber() {
		return Mobilenumber;
	}
	public void setMobilenumber(Integer mobilenumber) {
		Mobilenumber = mobilenumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

}
