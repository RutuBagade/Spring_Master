package com.properties.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.properties.Config.Appconfig;
import com.properties.beans.Person;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
      Person person=context.getBean("person",Person.class);
      person.PersonDetails();
	}

}
