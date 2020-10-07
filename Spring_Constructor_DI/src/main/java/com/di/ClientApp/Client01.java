package com.di.ClientApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.di.model.Employee;

public class Client01 {
public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("Beans.xml");
		Employee e1=ap.getBean("emp", Employee.class);
		e1.show();
		Employee e2=ap.getBean("e1", Employee.class);
		e2.show();
		Employee e21=ap.getBean("e3", Employee.class);
		e21.show();
}

}
