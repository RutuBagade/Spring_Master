package com.di.model;

public class Person
{
	private int id;
	private String name;
	private int Age;
	private Country country;
	
	public Person(int id, String name, int age, Country country) {
		super();
		this.id = id;
		this.name = name;
		Age = age;
		this.country = country;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person details -> id "+id+" name "+name+" age "+Age;
	}
	
	 public void showPerson(){
		    System.out.println(toString());
		    System.out.println(country.toString());
		    }
}
