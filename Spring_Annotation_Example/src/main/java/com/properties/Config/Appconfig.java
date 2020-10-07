package com.properties.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.properties")
@PropertySource({"classpath:person.properties","classpath:Address.properties","classpath:EducationDetails.properties"})
public class Appconfig {

}
