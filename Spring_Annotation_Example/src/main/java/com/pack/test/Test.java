package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pack.Beans.Tripmanagement;
import com.pack.Config.AppConfig;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	Tripmanagement tripMgmt=context.getBean("tripmanagement",Tripmanagement.class);
	tripMgmt.tripcompleted();
	
}
}
