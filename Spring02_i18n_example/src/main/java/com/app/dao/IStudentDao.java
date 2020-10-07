package com.app.dao;

import java.util.List;

import com.app.beans.Student;

public interface IStudentDao {
	public int saveStudent(Student stud);
	public void updateStudent(Student stud);
	public void deleteStudent(int studId);
	public  Student getStudentById(int studId);
	public List<Student> getAllStudents();

}
