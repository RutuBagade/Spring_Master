package com.test.di.model;

public class Engine {
	private String enginename;
	private  int  enginemodelyear;
	public String getEnginename() {
		return enginename;
	}
	public void setEnginename(String enginename) {
		this.enginename = enginename;
	}
	public int getEnginemodelyear() {
		return enginemodelyear;
	}
	public void setEnginemodelyear(int enginemodelyear) {
		this.enginemodelyear = enginemodelyear;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return enginename+" "+enginemodelyear ;
	}
	

}
