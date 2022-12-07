package com.masai.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.masai.model.Product;
import com.masai.utility.EMUtil;



@Repository
public class ProductRepoImpl implements ProductRepo{

	@Override
	public boolean insertProductDetails(Product product) {
		boolean flag=false;
		EntityManager em=EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(product);
		flag=true;
		em.getTransaction().commit();
		em.close();
		return flag;
	}

	@Override
	public List<Product> getAllProductDetails() {
		List<Product> products=new ArrayList<>();
		EntityManager em=EMUtil.provideEntityManager();
		String jpql="From Product";
		TypedQuery<Product> q=em.createQuery(jpql, Product.class);
		products=q.getResultList();
		em.close();
		return products;
	}

	@Override
	public Product findProduct(int productId) {
		EntityManager em=EMUtil.provideEntityManager();
		Product product=em.find(Product.class, productId);
		em.close();
		return product;
	}

	@Override
	public List<Product> getProductInPriceRange(int fromPrice, int toPrice) {
		List<Product> products=new ArrayList<>();
		EntityManager em=EMUtil.provideEntityManager();
		String jpql="from Product where price>=:p1 AND price<=:p2 ";
		TypedQuery<Product> q=em.createQuery(jpql, Product.class);
		q.setParameter("p1", fromPrice);
		q.setParameter("p2", toPrice);
		products = q.getResultList();
		em.close();
		
		return products;
	}

}
