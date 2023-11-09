package com.triveous.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triveous.model.CartItem;

public interface CartItemRepo extends JpaRepository<CartItem, Long> {

}
