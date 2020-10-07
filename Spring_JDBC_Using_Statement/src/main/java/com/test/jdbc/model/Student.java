package com.test.jdbc.model;



public class Student {
	private int studid;
	private String studname;
	private String studaddr;
	private String studclass;
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public String getStudaddr() {
		return studaddr;
	}
	public void setStudaddr(String studaddr) {
		this.studaddr = studaddr;
	}
	public String getStudclass() {
		return studclass;
	}
	public void setStudclass(String string) {
		this.studclass = string;
	}
	  public String toString() {
	        return String.format("[%s - %s - %s - %s]", studid, studname, studaddr, studclass);
	    }


}
