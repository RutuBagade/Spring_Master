package com.test.collectionwithDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("Beans01.xml");
		Library lb=ap.getBean("lib", Library.class);
             lb.display();
	}

}
