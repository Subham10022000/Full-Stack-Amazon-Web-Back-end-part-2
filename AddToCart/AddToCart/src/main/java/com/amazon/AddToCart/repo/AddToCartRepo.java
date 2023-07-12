package com.amazon.AddToCart.repo;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.amazon.AddToCart.entity.Cart;

public interface AddToCartRepo extends CrudRepository<Cart, Long> {

	Cart save(Cart cart);
	void deleteById(Long id);
	ArrayList<Cart> findByuserId(UUID userId);
}
