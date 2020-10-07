package com.test.jdbc.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.test.jdbc.model.Student;

public class StudentRowMapper implements RowMapper {

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException
	{ Student st=new Student();

		st.setStudname(rs.getNString("studname"));
		st.setStudaddr(rs.getString("studaddr"));
		st.setStudclass(rs.getString("studclass"));
		return st;
	}

}
