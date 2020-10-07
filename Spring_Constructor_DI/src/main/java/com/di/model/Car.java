package com.di.model;

public class Car {
	private String carname;
	private int carmodelno;
	public Engine engine;
	
	public Car(String carname, int carmodelno, Engine engine) {
		
		this.carname = carname;
		this.carmodelno = carmodelno;
		this.engine = engine;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return carname+" "+carmodelno;
	}
	public void displayInfo()
	{
		System.out.println("Car details: "+toString());
		System.out.println("Engine Details: "+engine.toString());
	}

}
