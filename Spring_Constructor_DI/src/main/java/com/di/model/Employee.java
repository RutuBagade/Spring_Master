package com.di.model;

public class Employee
{
	private int Employeeid;
	
	private String Employeename;
	private float EmployeeSalary;
	
	public Employee(int employeeid) {
		
		Employeeid = employeeid;
		System.out.println("int is injected");
	}

	public Employee(String employeename) {
		
		Employeename = employeename;
		System.out.println("String is injected");
	}

	public Employee(int employeeid, String employeename, float employeeSalary) {
		
		Employeeid = employeeid;
		Employeename = employeename;
		EmployeeSalary = employeeSalary;
	}
	public void show()
	{
		System.out.println(Employeeid+" "+Employeename+" "+EmployeeSalary);
	}

}
