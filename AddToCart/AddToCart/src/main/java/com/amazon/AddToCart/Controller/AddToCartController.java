package com.amazon.AddToCart.Controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.AddToCart.entity.Cart;
import com.amazon.AddToCart.entity.CartDetails;
import com.amazon.AddToCart.service.AddToCartService;

@RestController
@RequestMapping("/amazon/addToCart")
public class AddToCartController {
	
	@Autowired
	AddToCartService addToCartService;
	@PostMapping("/add")
	public void addToCart(@RequestBody Cart cart) {
		 addToCartService.addItemToCartService(cart);
	}
	
	@DeleteMapping("/remove/{id}")
	public void removeFromCart(@PathVariable Long id) {
		addToCartService.removeItemFromCartService(id);
	}
	@GetMapping("/show/{userId}")
	public CartDetails showItems(@PathVariable UUID userId) {
		return addToCartService.displayAllProductsInCart(userId);
		
	}
}
