package com.masai.usecases;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import com.masai.dao.StudentService;
import com.masai.model.AppConfig;
import com.masai.model.Student;

@Controller(value="isuc")
public class InsertStudent {
	@Autowired
	private StudentService sservice;
	
	public void insetStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		
		Student student =new Student();
		
		student.setName(name);
		student.setMarks(marks);
		
		sservice.saveStudent(student);
	}

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		InsertStudent s1=ctx.getBean("isuc",InsertStudent.class);
		s1.insetStudent();
		System.out.println("done..");

	}

}
