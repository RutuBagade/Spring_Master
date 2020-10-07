package com.sathya.dao;

import java.util.List;
import java.util.Map;

public interface IEmpdao {
	int saveEmployee(int empno,String ename,double sal,int deptno);
	void updateEmployee(int empno,double sal);
	void deleteEmployee(int empno);
	
	Map findEmployeeById(int empno);
	List findEmployeesByDeptno(int deptno);
}
