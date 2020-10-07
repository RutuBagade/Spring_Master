package com.sathya.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.dao.IEmpdao;
import com.sathya.service.IEmpService;

@Service
public class EmployeeServiceImpl implements IEmpService
{
	@Autowired
	private IEmpdao dao;

	public int saveEmployee(int empno, String ename, double sal, int deptno) {
		// TODO Auto-generated method stub
		return dao.saveEmployee(deptno, ename, sal, deptno);
	}

	
	public void updateEmployee(int empno, double sal) {
		// TODO Auto-generated method stub
		dao. updateEmployee(empno, sal);
	}

	
	public void deleteEmployee(int empno) {
		// TODO Auto-generated method stub
		dao.deleteEmployee( empno);
	}

	
	public Map findEmployeeById(int empno) {
		// TODO Auto-generated method stub
		return dao.findEmployeeById(empno);
	}

	
	public List findEmployeesByDeptno(int deptno) {
		// TODO Auto-generated method stub
		return dao.findEmployeesByDeptno(deptno);
	}

}
