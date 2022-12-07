package com.masai.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.model.A;
import com.masai.model.AppConfig;

public class Demo {

	public static void main(String[] args) {

		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		A obj = ctx.getBean("a",A.class);
		obj.funA();
		
		((AnnotationConfigApplicationContext)ctx).close();

	}

}
