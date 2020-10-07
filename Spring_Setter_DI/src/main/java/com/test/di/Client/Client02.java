package com.test.di.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.di.config.beansconfig;
import com.test.di.model.Person;

public class Client02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext ap=new ClassPathXmlApplicationContext("Beans.xml");
		ApplicationContext ap=new AnnotationConfigApplicationContext(beansconfig.class);
		Person person=ap.getBean("person", Person.class);
		person.showPerson();
	}

}
