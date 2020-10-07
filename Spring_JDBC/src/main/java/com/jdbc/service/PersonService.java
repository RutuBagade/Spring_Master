package com.jdbc.service;

import java.util.List;

import com.jdbc.model.Person;

public interface PersonService {
	public void inserPersondeatils(Person s);
	public void updatePersondetails(Person Person );
	public void deletePersondetails(int id);
	public Person findPersonsByID(int id);
	public List<Person> findAll();
	public void deletePersonByEmail(String email,String addr);


}
