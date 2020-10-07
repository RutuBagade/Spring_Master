package com.jdbc.DAO;

import java.util.List;

import com.jdbc.model.Person;

public interface PersonDAO 
{
	public void savePerson(Person s);
	public void updatePerson(Person Person );
	public void deletePerson(int id);
	public Person getPersonsByID(int id);
    public List<Person> getPersonDetails();
    public void deletePersonByEmailandaddr(String email,String addr);
}
