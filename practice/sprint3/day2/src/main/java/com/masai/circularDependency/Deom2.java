package com.masai.circularDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Deom2 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		A a=ctx.getBean("aobj",A.class);
		a.showA();
		B b=ctx.getBean("bobj",B.class);
		b.showB();

	}

}
