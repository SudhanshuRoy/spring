package com.masai.usecases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import com.masai.dao.ProductService;
import com.masai.model.Product;
import com.masai.utility.AppConfig;

@Controller("gap")
public class GetAllProducts {
	@Autowired
	private ProductService ps;
	public void getAllProducts() {	
	List<Product> products=ps.getAllProducts();
	products.forEach(p->System.out.println(products));
	}
	

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		GetAllProducts obj=ctx.getBean("gap",GetAllProducts.class);
		obj.getAllProducts();

	}

}
