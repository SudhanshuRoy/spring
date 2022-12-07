package com.masai.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.service.AppConfig;
import com.masai.service.PersonService;

public class Demo {

	public static void main(String[] args) {
		
       ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
       PersonService ps=ctx.getBean("personService",PersonService.class);
       ps.printMap();
       System.out.println("*************************");
       
       ps.printList();
       
       System.out.println("*************************");
       ps.printAppName();
	}

}
