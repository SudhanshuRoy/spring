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

import java.util.*;

@Controller("gpbp")
public class GetProductsBetweenPrice {
	@Autowired
	private ProductService ps;
	public void getProductsBetweenPrice() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting price ");
		int p1=sc.nextInt();
		System.out.println("Enter ending price ");
		int p2=sc.nextInt();
		try {
			List<Product> products=ps.getProductsBetweenPrice(p1, p2);
			products.forEach(p->System.out.println(p));
		} catch (ProductException e) {
			
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		GetProductsBetweenPrice obj=ctx.getBean("gpbp",GetProductsBetweenPrice.class);
		obj.getProductsBetweenPrice();

	}

}
