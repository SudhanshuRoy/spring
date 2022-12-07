package com.masai.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Demo demo=ctx.getBean("do",Demo.class);
		demo.showDetails();
		
		((ClassPathXmlApplicationContext)ctx).close();

	}

}
