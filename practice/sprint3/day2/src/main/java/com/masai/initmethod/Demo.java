package com.masai.initmethod;
import java.util.List;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(10);
		list.remove(0);
		System.out.println(list);
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		ctx.getBean("aid2",A.class);
	}

}
