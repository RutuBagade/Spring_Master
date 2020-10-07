package com.test.di.model;

public class Person
{
	private int id;
	private String name;
	private int Age;
	private Country country;
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
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		this.Age = age;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
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
