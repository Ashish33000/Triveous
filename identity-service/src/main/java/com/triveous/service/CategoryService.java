package com.triveous.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triveous.model.Category;
import com.triveous.repo.CategoryRepo;

@Service
public class CategoryService {
	
	@Autowired
    private  CategoryRepo repo;

   
    

    public List<Category> getAllCategories() {
        return repo.findAll();
    }

    public Category getCategoryById(Long categoryId) {
        return repo.findById(categoryId)
                .orElseThrow(() -> new NoSuchElementException("Category not found"));
    }
}
