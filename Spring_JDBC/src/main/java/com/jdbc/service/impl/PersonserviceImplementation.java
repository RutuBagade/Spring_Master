package com.jdbc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.jdbc.DAO.PersonDAO;
import com.jdbc.model.Person;
import com.jdbc.service.PersonService;
@Service
public class PersonserviceImplementation implements PersonService 
{
	@Autowired
       private PersonDAO dao;
 

	public void setDao(PersonDAO dao) {
		this.dao = dao;
	}

	public void inserPersondeatils(Person person) {
		dao.savePerson(person);
	
	}

	public void updatePersondetails(Person Person) {
		
		dao.updatePerson(Person);
		
	}

	public void deletePersondetails(int id) {
		// TODO Auto-generated method stub
		dao.deletePerson(id);
		
	}

	public Person findPersonsByID(int id) {
		// TODO Auto-generated method stub
		return dao.getPersonsByID(id);
	}

	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return dao.getPersonDetails();
	}

	public void deletePersonByEmail(String email, String addr) {
		
	 dao.deletePersonByEmailandaddr(email, addr);
	}

	
	

}
