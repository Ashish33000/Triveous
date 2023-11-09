package com.triveous.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triveous.model.Orders;
import com.triveous.repo.OrderRepo;

@Service
public class OrderService {
	@Autowired
    private  OrderRepo repo;


    

    public Orders getOrderById(Long orderId) {
        return repo.findById(orderId).get();
    }

   
}


