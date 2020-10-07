package com.pack.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tripmanagement {
	@Value("satara")
	private String source;
	@Value("pune")
	private String destination;
	@Value("135.40")
	private double amount;
	@Autowired
	private DriverBean driverBean;
	@Autowired
	private PassengerBean passengerBean;
	 public void tripcompleted()
	 {
		 System.out.println("Source: "+source);
		 System.out.println("Destination: "+destination);
		 System.out.println("Amount u have to pay: "+amount);
		 System.out.println("Driver Data: "+driverBean);
		 System.out.println("Passenger Data: "+passengerBean);
	 }
}
