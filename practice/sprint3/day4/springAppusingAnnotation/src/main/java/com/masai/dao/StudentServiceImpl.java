package com.masai.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Student;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao sDao;

	@Override
	public String saveStudent(Student student) {
		
		return sDao.insertStudentDetails(student);
	}

	@Override
	public List<Student> getAllStudents() {
		
		return sDao.getAllStudentDetails();
	}
	
	

}
