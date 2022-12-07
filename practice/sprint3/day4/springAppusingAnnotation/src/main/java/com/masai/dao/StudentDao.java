package com.masai.dao;
import java.util.List;

import com.masai.model.Student;

public interface StudentDao {
	public String insertStudentDetails(Student student);
	public List<Student> getAllStudentDetails();

}
