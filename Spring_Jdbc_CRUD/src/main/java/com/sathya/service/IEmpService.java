package com.sathya.service;

import java.util.List;
import java.util.Map;

public interface IEmpService {
	int saveEmployee(int empno,String ename,double sal,int deptno);
	void updateEmployee(int empno,double sal);
	void deleteEmployee(int empno);
	
	Map findEmployeeById(int empno);
	List findEmployeesByDeptno(int deptno);

}
