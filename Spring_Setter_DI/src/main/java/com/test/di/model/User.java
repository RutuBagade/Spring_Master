package com.test.di.model;

public class User 
{
	private int userid;
	private String username;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
    public String Show()
    {
    	System.out.println(userid+" "+username);
    	return "Successfully ";
    }
}
