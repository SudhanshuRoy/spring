package com.masai.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.model.College;
import com.masai.model.Student;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		College collage = ctx.getBean("cl1",College.class);
		List<Student> students= collage.getStudents();
		System.out.println("Collage name is "+collage.getCollegeName());
		System.out.println("-----------------------------");
		students.forEach(student -> {
		student.displayDetails();
		System.out.println("==================");
		});

	}

}
