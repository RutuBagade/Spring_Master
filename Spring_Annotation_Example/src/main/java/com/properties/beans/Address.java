package com.properties.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("${Houseno}")
	private String Houseno;
	@Value("${Street}")
	private String Street;
	@Value("${City}")
	private String City;
	@Value("${pincode}")
	private String pincode;
	@Override
	public String toString() {
		return "[" + Houseno + "," + Street + "," + City + ", " + pincode + "]";
	}
	
	

}
