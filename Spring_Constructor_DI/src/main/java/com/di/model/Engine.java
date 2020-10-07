package com.di.model;

public class Engine {
	private String enginename;
	private  int  enginemodelyear;

	public Engine(String enginename, int enginemodelyear) {
		this.enginename = enginename;
		this.enginemodelyear = enginemodelyear;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return enginename+" "+enginemodelyear ;
	}
	

}
