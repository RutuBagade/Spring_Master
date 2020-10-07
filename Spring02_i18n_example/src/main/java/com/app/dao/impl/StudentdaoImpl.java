package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.beans.Student;
import com.app.dao.IStudentDao;
@Repository
public class StudentdaoImpl implements IStudentDao {
	@Autowired
    private HibernateTemplate ht;
	
	@Override
	public int saveStudent(Student stud) {
		// TODO Auto-generated method stub
		return (Integer)ht.save(stud);
	}

	@Override
	public void updateStudent(Student stud) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStudent(int studId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Student getStudentById(int studId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
