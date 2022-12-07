package com.masai.usecases;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import com.masai.dao.ProductService;
import com.masai.model.Product;
import com.masai.utility.AppConfig;
@Controller("insp")
public class InsertProduct {
	@Autowired
	private ProductService ps;
	
	public void insertProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product name : ");
		String name=sc.next();
		System.out.println("Enter product price : ");
		int price=sc.nextInt();
		System.out.println("Enter product quantity : ");
		int quantity=sc.nextInt();
		Product product=new Product();
		product.setPrice(price);
		product.setProductName(name);
		product.setQuantity(quantity);
		ps.addProduct(product);
		
	}

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		InsertProduct pro=ctx.getBean("insp",InsertProduct.class);
		pro.insertProduct();
		System.out.println("done..");



	}

}
