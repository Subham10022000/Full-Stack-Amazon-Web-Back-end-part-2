package com.amazonapp.productdetalservice.Service;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonapp.productdetalservice.entity.Product;
import com.amazonapp.productdetalservice.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo productRepo;

	public Product saveDataToDB(Product product) {
		product.setProductID(UUID.randomUUID());
		return productRepo.save(product);
	}
	
	public ArrayList<Product> findAllProducts() {
		return productRepo.findAll();
	}
	
	public Product getProductDetails(UUID productId) {
		return productRepo.findByproductID(productId);
	}
}
	