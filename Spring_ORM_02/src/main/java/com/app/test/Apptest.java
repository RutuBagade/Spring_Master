package com.app.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

import com.app.config.AppConfig;
import com.app.model.User;
import com.app.service.IUserService;
import org.hibernate.SessionFactory;
public class Apptest {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		// TODO Auto-generated method stub
		IUserService u=ac.getBean("userServiceImpl", IUserService.class);
		
		/*
		 * User user = new User(); user.setUserId(15); user.setUserName("Ashwini");
		 * user.setUserCode("LLB"); u.save(user);
		 * System.out.println("Saved data successful");
		 * 
		 */
		
			/*
			 * Test:UPDATE Operation
			 * User user11 = new User(); user11.setUserId(3);
			 * user11.setUserName("VickyRajkumar"); user11.setUserCode("psdf");
			 * u.update(user); System.out.println("update succesfull");
			 */
		  
		/*
		 * //Delete operation
		 *  User user12 = new User();
		 *   user12.setUserId(2);
		 * u.delete(2);
		 *  System.out.println(user12.getUserId()+" user deleted");
		 */
		
		  //retrive data in list<User>
		   List<User> list = u.getAllUsers();
		   for(User user:list)
			   System.out.println(user);
		 
		
			/*
			 * //retrive only one user data` / User user = u.getUserById(4);
			 * System.out.println(user);
			 */
		
		

	
	}

}
