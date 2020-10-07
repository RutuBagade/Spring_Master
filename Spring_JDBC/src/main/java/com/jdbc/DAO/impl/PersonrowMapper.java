package com.jdbc.DAO.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jdbc.model.Person;

public class PersonrowMapper implements RowMapper {

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person person=new Person();
		person.setId(rs.getInt("id"));
		person.setName(rs.getString("name"));
		person.setAddr(rs.getString("addr"));
		person.setEmail(rs.getString("email"));
		person.setTelephone(rs.getString("telephone"));
		return person;
	}

}
