package com.test.jdbc.DAO;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import  com.test.jdbc.DAO.StudentRowMapper;
import com.test.jdbc.model.Student;

public class StudentDAOImplement 
{
	private JdbcTemplate template;
	

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int saveEmployee(Student s) {
		String sql="Insert into Student Values('"+s.getStudid()+"','"+s.getStudname()+"','"+s.getStudaddr()+"','"+s.getStudclass()+"')";
		return template.update(sql);
	}

	public int updateEmployee(Student s) {
		String sql="update Student set studname='"+s.getStudname()+"',studclass='"+s.getStudclass()+"' where studid='"+s.getStudid()+"'";
		return template.update(sql);
	}

	public int deleteEmployee(int studid) {
		String sql="delete  from Student where studid='"+studid+"'";
		return template.update(sql);
	}

	

}
