package com.di.model;

public class Country 
{
	 private int id;
	 private String name;

	
	
	public Country(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public String toString() {
		// TODO Auto-generated method stub
		return "Country details -> id "+id+" name "+name;
	}
	
	 
}
