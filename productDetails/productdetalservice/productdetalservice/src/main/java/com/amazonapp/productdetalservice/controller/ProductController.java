package com.amazonapp.productdetalservice.controller;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonapp.productdetalservice.Service.ProductService;
import com.amazonapp.productdetalservice.entity.Product;

@RestController
@RequestMapping("/amazon/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/save")
	public Product saveData(@RequestBody Product product) {
		return productService.saveDataToDB(product);
	}
	
	@GetMapping("/getAllProducts")
	public ArrayList<Product> getAllProducts() {
		return productService.findAllProducts();
	}
	
	@GetMapping("/search/{productId}")
	public Product getProductById(@PathVariable UUID productId) {
		return productService.getProductDetails(productId);
	}

}