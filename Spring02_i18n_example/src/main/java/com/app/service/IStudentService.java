package com.app.service;



import java.util.List;

import com.app.beans.Student;

public interface IStudentService {
	
		public int save(Student student);
		public void update(Student student);
		public void delete(int studentId);
		public  Student getStudentById(int studentId);
		public  List<Student> getAllStudents();
		


}

