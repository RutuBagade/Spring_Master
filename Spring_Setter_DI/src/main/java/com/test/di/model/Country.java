package com.test.di.model;

public class Country 
{
	 private int id;
	 private String name;

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

	
	public String toString() {
		// TODO Auto-generated method stub
		return "Country details -> id "+id+" name "+name;
	}
	
	 
}
