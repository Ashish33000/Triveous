package com.triveous.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triveous.model.Orders;

public interface OrderRepo extends JpaRepository<Orders, Long> {
	
}
