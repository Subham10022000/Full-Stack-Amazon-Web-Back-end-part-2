package com.amazon.AddToCart.service;

import java.util.UUID;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.amazon.AddToCart.entity.Product;


@Component
@FeignClient(name="productDetails", url="localhost:8082")
public interface ProductDetailsProxy {
	
	@GetMapping("/amazon/products/search/{productId}")
	public Product getProductById(@PathVariable UUID productId);

}
