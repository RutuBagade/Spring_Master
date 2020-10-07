package com.properties.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value("${person.name}")
	private String personName;
	@Value("${person.email}")
	private String personEmail;
	@Value("${person.mobile}")
	private String personMobile;
	@Autowired
	private Address address;
	@Autowired
	private EducationDetails educationDetails;
	
	public void PersonDetails()
	{
		System.out.println("Name: "+personName);
		System.out.println("Email: "+personEmail);
		System.out.println("Mobile: "+personMobile);
		System.out.println("Address: "+address);
		System.out.println("EducationDetails: "+educationDetails);
	}
	

}
