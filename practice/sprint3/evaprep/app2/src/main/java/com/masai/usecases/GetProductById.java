package com.masai.usecases;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import com.masai.dao.ProductService;
import com.masai.exception.ProductException;
import com.masai.model.Product;
import com.masai.utility.AppConfig;

@Controller("gpbi")
public class GetProductById {
	@Autowired
	private ProductService ps;
	public void getProductById() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ProductId");
		int pid=sc.nextInt();
		try {
			Product product=ps.getProductById(pid);
			System.out.println(product);
		} catch (ProductException e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		GetProductById  obj=ctx.getBean("gpbi",GetProductById .class);
		obj.getProductById();
		

	}

}
