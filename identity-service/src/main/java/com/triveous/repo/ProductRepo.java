package com.triveous.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triveous.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {
	//List<Product> findByCategoryId(Long categoryId);
}
