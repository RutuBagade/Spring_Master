package com.jdbc.DAO.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbc.DAO.PersonDAO;
import com.jdbc.model.Person;
@Repository
public class PersonDAOImplementation  implements PersonDAO
{
@Autowired
	private JdbcTemplate jt;
	
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public void savePerson(Person s) {
		String sql="Insert into Person Values(?,?,?,?,?)";
		int count=jt.update(sql, new Object[] {s.getId(),s.getName(),s.getAddr(),s.getEmail(),s.getTelephone()});
		if(count>0)
		{
			System.out.println("Record is inserted Successfully ");
		}
		else
		{
			System.out.println("Record is Not Inserted");
		}
		
	}

	public void updatePerson(Person s) {
		String sql="update Person set email=? where id=?";
		int count =jt.update(sql, new Object[] {s.getEmail(),s.getId()});
		if(count>0)
		{
			System.out.println("Record is updated Successfully");
		}
		else
		{
			System.out.println("Record is Not existed");
		}
	}

	public void deletePerson(int id) {
		String sql="delete from Person where id=?";
		int count=jt.update(sql, id);
		if(count>0)
		{
			System.out.println("Record is deleted Successfully");
		}
		else
		{
			System.out.println("Record is not existed");
		}
	}
	public void deletePersonByEmailandaddr(String email,String addr) {
		String sql="delete from Person where  email=? and addr=?";
		int count=jt.update(sql, new Object[] {email,addr});
		if(count>0)
		{
			System.out.println("Record is deleted Successfully");
		}
		else
		{
			System.out.println("Record is not existed");
		}
	}

	public Person getPersonsByID(int id) {
		String sql="select * from person where id=?";
		Person per = (Person) jt.queryForObject(sql, new Object[]
			        { id }, new PersonrowMapper());
		System.out.println(id+" Person details:");
		return per;
	}

	public List<Person> getPersonDetails() {
		String  sql="select * from person";
		System.out.println("All Record Details: ");
		return jt.query(sql, new PersonrowMapper());
		
		
	}

}
