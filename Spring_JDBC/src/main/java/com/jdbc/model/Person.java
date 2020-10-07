package com.jdbc.model;

import org.springframework.stereotype.Component;

@Component
public class Person {
	private int id;
	private String name;
	private String addr;
	private String email;
	private String telephone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
public String toString()
{
	return String.format("[%s - %s - %s - %s -%s]", id, name, addr, email,telephone);
	}
}
