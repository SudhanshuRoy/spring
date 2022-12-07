package com.masai.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.masai.model.Student;
import com.masai.utility.EMUtil;
@Repository
public class StudentDaoImpl implements StudentDao{

	@Override
	public String insertStudentDetails(Student student) {
		String msg="Registration Fail!";
		EntityManager em=EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(student);
		
		em.getTransaction().commit();
		em.close();
		msg="Student registered successfully!";
		return msg;
	}

	@Override
	public List<Student> getAllStudentDetails() {
		List<Student> students=new ArrayList<>();
		EntityManager em=EMUtil.provideEntityManager();
		String jpql="From Student";
		TypedQuery<Student> q=em.createQuery(jpql, Student.class);
		  students= q.getResultList();
		  em.close();
		return students;
	}

}
