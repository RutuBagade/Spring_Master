package com.pack.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PassengerBean {
	@Value("Manoj kumar")
	private String passengername;
	@Value("rutubagade9@gmail.com")
	private String email;
	@Value("9139251151")
	private String phone;
	@Override
	public String toString() {
		return "PassengerBean [passengername=" + passengername + ", email=" + email + ", phone=" + phone + "]";
	}

}
