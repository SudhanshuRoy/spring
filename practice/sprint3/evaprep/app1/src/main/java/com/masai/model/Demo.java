package com.masai.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		StudentService ss=ctx.getBean("studentService",StudentService.class);
		ss.printMap();
		System.out.println("****************************");
		
		ss.printList();
		System.out.println("****************************");
		ss.printAppName();

	}

}
