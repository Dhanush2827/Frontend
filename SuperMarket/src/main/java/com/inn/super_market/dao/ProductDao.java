package com.inn.super_market.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

import com.inn.super_market.POJO.Product;
import com.inn.super_market.wrapper.ProductWrapper;

public interface ProductDao extends JpaRepository<Product,Integer> {
	
	List<ProductWrapper> getAllProduct();
	@Modifying
	@Transactional
	Integer updateProductStatus(@Param("status")String status,@Param("id")Integer id);
	
	List<ProductWrapper> getProductByCategory(@Param("id")Integer id);
	
	List<ProductWrapper> getProductById(@Param("id")Integer id);




}
