package com.masai.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.model.A;

public class _2MapExample {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        A a=ctx.getBean("aid",A.class);
        a.showA();
	}

}
