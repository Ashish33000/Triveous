package com.triveous.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triveous.model.Product;
import com.triveous.repo.ProductRepo;

@Service
public class ProductService {
	@Autowired
    private  ProductRepo repo;

   

//    public List<Product> getProductsByCategoryId(Long categoryId) {
//        return repo.findByCategoryId(categoryId);
//    }

    public Product getProductById(Long productId) {
        return repo.findById(productId)
                .orElseThrow(() -> new NoSuchElementException("Product not found"));
    }}
