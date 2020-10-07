package com.test.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.test.di.model.Country;
import com.test.di.model.Person;

@Configuration
@ComponentScan(basePackages="com.test.di")
public class beansconfig {
	@Bean
	public Person person()
	{ 
		Person person=new Person();
	person.setId(101);
	person.setName("rutuja");
	person.setAge(23);
	person.setCountry(new Country());
		return person;
	}
	@Bean
	public Country country()
	{
		Country country=new Country();
		country.setId(121);
		country.setName("india");
		return country;
		
	}
	

}
