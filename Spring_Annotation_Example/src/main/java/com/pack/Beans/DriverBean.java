package com.pack.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DriverBean {
	@Value("Sanu vichare")
	private String drivername;
	@Value("8208079008")
	private String contactnumber;
	@Value("0789556")
	private String vehiclenumber;
	@Override
	public String toString() {
		return "DriverBean [drivername=" + drivername + ", contactnumber=" + contactnumber + ", vehiclenumber="
				+ vehiclenumber + "]";
	}
	
}
