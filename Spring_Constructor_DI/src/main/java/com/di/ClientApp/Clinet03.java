package com.di.ClientApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.di.model.Car;



public class Clinet03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap=new ClassPathXmlApplicationContext("carengine.xml");
		Car car=ap.getBean("car", Car.class);
		car.displayInfo();
	}

}
