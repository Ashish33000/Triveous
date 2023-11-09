package com.triveous.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triveous.model.Product;
import com.triveous.repo.ProductRepo;

@Service
public class ProductService {
	@Autowired
    private  ProductRepo repo;

   
	 public Product addProduct(Product p) {
	        return repo.save(p);
	    };


    public Product getProductById(Long productId) {
        return repo.findById(productId)
                .orElseThrow(() -> new NoSuchElementException("Product not found"));
    }
    }
