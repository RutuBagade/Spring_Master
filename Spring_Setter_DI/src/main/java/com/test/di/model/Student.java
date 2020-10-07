package com.test.di.model;

public class Student 
{
	private int StudID;
	private String StudName;
	private String StudAddress;
	
	public int getStudID() {
		return StudID;
	}
	public void setStudID(int studID) {
		StudID = studID;
	}
	public String getStudName() {
		return StudName;
	}
	public void setStudName(String studName) {
		StudName = studName;
	}
	public String getStudAddress() {
		return StudAddress;
	}
	public void setStudAddress(String studAddress) {
		StudAddress = studAddress;
	}
	public void getStudentInfo()
	{
		System.out.println(StudID +" "+ StudName + " "+StudAddress);
	}

}
