package com.di.ClientApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.di.model.Person;

public class Client02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext ap=new ClassPathXmlApplicationContext("appcontext.xml");
      Person p=ap.getBean("person",Person.class);
      p.showPerson();
	}

}
