package com.masai.dao;
import java.util.List;

import com.masai.model.Student;

public interface StudentService {
	
	public String saveStudent(Student student);
	public List<Student> getAllStudents();

}
