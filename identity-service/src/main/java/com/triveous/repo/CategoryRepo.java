package com.triveous.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triveous.model.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {

}
