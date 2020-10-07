package com.test.di.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.di.model.Student;
import com.test.di.model.User;

public class Client_App01 {

	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("appcontext.xml");
		//student model classs
		Student st=ap.getBean("studentdetails", Student.class);
		st.getStudentInfo();
		
      //set byusing setter method
		st.setStudID(102);
		st.setStudName("Priyanaka");
		st.setStudAddress("Pune");
		st.getStudentInfo();
		
		//user model class
		User user=ap.getBean("user", User.class);
		String msg=user.Show();
		System.out.println(msg);
		
		
	}

}
