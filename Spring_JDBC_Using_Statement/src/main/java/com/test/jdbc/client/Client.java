package com.test.jdbc.client;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.jdbc.DAO.StudentDAOImplement;
import com.test.jdbc.model.Student;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext ap=new ClassPathXmlApplicationContext("Student_Bean.xml");
       StudentDAOImplement student=ap.getBean("studentdao", StudentDAOImplement.class);
       Student st=new Student();
      /*// st.setStudid(2);
       st.setStudname("Rucha");
       st.setStudaddr("satara");
       st.setStudclass('c');
       student.saveEmployee(st);
       System.out.println("Student Record is successfully inserted");*/
      /* //update record based on id
       st.setStudid(102);
       st.setStudname("Tushar");
       st.setStudclass("C");
       int i=student.updateEmployee(st);
       if(i>0)
       {
    	   System.out.println("Record is updated Successfully");
       }
       //delete record based on id
       int i1=student.deleteEmployee(106);
      
    	   System.out.println("Record is deleted successfully");   */
    	  
	}

}
