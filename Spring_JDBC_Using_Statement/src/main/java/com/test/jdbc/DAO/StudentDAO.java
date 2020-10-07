package com.test.jdbc.DAO;

import com.test.jdbc.model.Student;

public interface StudentDAO {
	public int saveEmployee(Student s);
	public int updateEmployee(Student student );
	public int deleteEmployee(int studid);
	public Student getStudentsByID(int studid);

}
