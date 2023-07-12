package com.amazon.AddToCart.service;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.AddToCart.entity.Cart;
import com.amazon.AddToCart.entity.CartDetails;
import com.amazon.AddToCart.entity.Product;
import com.amazon.AddToCart.repo.AddToCartRepo;

@Service
public class AddToCartService {
	
	@Autowired
	AddToCartRepo addToCartRepo;
	
	@Autowired
	ProductDetailsProxy productDetailsProxy;
	
	public void addItemToCartService(Cart cart) {
		
		 addToCartRepo.save(cart);
	}
	
	public void removeItemFromCartService(Long id) {
		addToCartRepo.deleteById(id);
	}
	public CartDetails displayAllProductsInCart(UUID userId) {
		CartDetails cartDetails=new CartDetails();
		cartDetails.setUserId(userId);
		
		ArrayList<Cart> cartList = addToCartRepo.findByuserId(userId);
		ArrayList<Product> productList=new ArrayList<Product>();
		
		for(int i=0;i<cartList.size();i++) {
			Product product=productDetailsProxy.getProductById(cartList.get(i).getProductId());
			productList.add(product);
		}
		
		cartDetails.setList(productList);	
		return cartDetails;
		
	}

}
