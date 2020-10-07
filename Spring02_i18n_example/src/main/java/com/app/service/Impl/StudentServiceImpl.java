package com.app.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.beans.Student;
import com.app.dao.IStudentDao;
import com.app.service.IStudentService;
@Service
@Transactional
public class StudentServiceImpl implements IStudentService {
	@Autowired
    private IStudentDao dao;
	
	@Transactional
	@Override
	public int save(Student student) {
		// TODO Auto-generated method stub
		return dao.saveStudent(student);
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int studentId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Student getStudentById(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
