package com.sathya.test;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sathya.config.AppConfig;

import com.sathya.dao.IEmpdao;
import com.sathya.dao.impl.EmpdaoImpl;
import com.sathya.model.Employee;
import com.sathya.service.IEmpService;
import com.sathya.service.impl.EmployeeServiceImpl;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		IEmpService dao = context.getBean("employeeServiceImpl", IEmpService.class);

		
		/*
		 * // TEST:Insert operation dao.saveEmployee(666, "Kunal", 65000.0, 35);
		 * System.out.println("Employees inserted");
		 * System.out.println("*********************************");
		 * 
		 */
		/*
		 * //TEST:Update Operation 
		 * dao. updateEmployee(7135, 7500.00 );
		 * System.out.println("Employees updated");
		 */
		  
		/*
		 * //TEST:delete Operation dao.deleteEmployee(7125);
		 * System.out.println("Employee deleted");
		 */
		  
		/*
		 * //TEST:Find employee By Id Map map=dao.findEmployeeById(2335);
		 * System.out.println(map);
		 */
		
		  //TEST:Find employee by dept no 
		List list=dao.findEmployeesByDeptno(35);
		  list.forEach( m -> System.out.println(m) );
		 
	}

}
