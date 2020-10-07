package com.jdbc.App;

import java.security.Provider.Service;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbc.model.Person;
import com.jdbc.service.PersonService;

public class Client {
	
	public static void main(String[] args) 
	{
		
     ApplicationContext ap=new ClassPathXmlApplicationContext("Person_Bean.xml");	
     PersonService service=ap.getBean("personserviceImplementation",PersonService.class);
     
     //Insertion of Data into DB
     Person person=new Person();
     //person.setId(4);
     person.setName("Shrutika");
     person.setAddr("Dhane");
     person.setEmail("shruti@1996gmail.com");
     person.setTelephone("78562315478");
     service.inserPersondeatils(person);
     
     
     //Updation data into DB
     person.setId(2);
     person.setEmail("sohoo12@gmail.com");  
     service.updatePersondetails(person);
     
     
     //Deletion of data based on id
     service.deletePersondetails(1);
     
     //fetch data based on id
     Person p=service.findPersonsByID(3);
     System.out.println(p);
     
   //get all Person Details
     
     List<Person> list=service.findAll();
     Iterator<Person> itr=list.iterator();
     while(itr.hasNext())
     {System.out.println(itr.next());
     }
     
     
	
	//delete Person pn basis of email and addr
 service.deletePersonByEmail("kombdi96@gmail.com","baramati");
 
	}}

