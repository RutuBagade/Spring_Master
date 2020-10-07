package com.test.di.model;

public class Car {
	private String carname;
	private int carmodelno;
	public Engine engine;
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public int getCarmodelno() {
		return carmodelno;
	}
	public void setCarmodelno(int carmodelno) {
		this.carmodelno = carmodelno;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return carname+" "+carmodelno;
	}
	public void displayInfo()
	{
		System.out.println(toString());
		System.out.println(engine.toString());
	}

}
