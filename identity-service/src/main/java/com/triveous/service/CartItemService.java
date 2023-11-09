package com.triveous.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triveous.model.CartItem;
import com.triveous.repo.CartItemRepo;

@Service
public class CartItemService {
	@Autowired
    private  CartItemRepo cartItemRepository;

   


    public CartItem createCartItem(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }


    public Optional<CartItem> getCartItemById(Long id) {
        return cartItemRepository.findById(id);
    }

    public CartItem updateCartItem(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }


    public void deleteCartItem(Long id) {
        cartItemRepository.deleteById(id);
    }
}



