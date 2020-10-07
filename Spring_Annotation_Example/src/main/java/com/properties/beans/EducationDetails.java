package com.properties.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EducationDetails {
	@Value("${edu.SSC}")
	private double SSC;
	@Value("${edu.HSC}")
	private double HSC;
	@Value("${edu.BE}")
	private double BE;
	@Override
	public String toString() {
		return "Marks Obtained: [SSC=" + SSC + ", HSC=" + HSC + ", BE=" + BE + "]";
	}

}
