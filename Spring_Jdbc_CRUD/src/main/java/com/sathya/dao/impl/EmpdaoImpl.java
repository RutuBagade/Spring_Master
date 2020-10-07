package com.sathya.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sathya.dao.IEmpdao;
@Repository
public class EmpdaoImpl implements IEmpdao
{
	@Autowired
    private JdbcTemplate jdbctemplate;
	
	public int saveEmployee(int empno, String ename, double sal, int deptno) {
		return jdbctemplate.update("insert into emp values(?,?,?,?)",empno,ename,sal,deptno);
	}

	public void updateEmployee(int empno, double sal) {
		// TODO Auto-generated method stub
		jdbctemplate.update("update  emp set sal=? where empno=?", sal,empno);
	}

	public void deleteEmployee(int empno) {
		// TODO Auto-generated method stub
		jdbctemplate.update("delete from  emp  where empno=?",empno);
	}

	
	public Map findEmployeeById(int empno) {
		// TODO Auto-generated method stub
		return jdbctemplate.queryForMap("select * from emp where empno=?",empno);
	}

	public List findEmployeesByDeptno(int deptno) {
		// TODO Auto-generated method stub
		return jdbctemplate.queryForList("select * from emp where deptno=?",deptno);
	}

	
}
