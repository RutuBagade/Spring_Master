package com.test.di.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.di.model.Car;

public class Client03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap=new ClassPathXmlApplicationContext("car_beans.xml");
		Car car=ap.getBean("car", Car.class);
		car.displayInfo();
	}

}
