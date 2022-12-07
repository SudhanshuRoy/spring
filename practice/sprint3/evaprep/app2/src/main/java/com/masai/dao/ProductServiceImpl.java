package com.masai.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.ProductException;
import com.masai.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepo pRepo;

	@Override
	public boolean addProduct(Product product) {
		
		return pRepo.insertProductDetails(product);
	}

	@Override
	public List<Product> getAllProducts() {
		
		return pRepo.getAllProductDetails();
	}

	@Override
	public Product getProductById(int productId) throws ProductException {
		Product product=null;
		product=pRepo.findProduct(productId);
		
		if(product==null)  throw new ProductException("Invalid productId");
		
		return product;
	}

	@Override
	public List<Product> getProductsBetweenPrice(int fromPrice, int toPrice) throws ProductException {
		List<Product> products=new ArrayList<>();
		products=pRepo.getProductInPriceRange(fromPrice, toPrice);
		if(products==null) throw new ProductException("No product exist between given price range");
		
		return products;
	}

}
