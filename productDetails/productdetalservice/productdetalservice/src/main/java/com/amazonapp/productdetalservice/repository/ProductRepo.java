package com.amazonapp.productdetalservice.repository;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.amazonapp.productdetalservice.entity.Product;

@Repository
public interface ProductRepo extends MongoRepository<Product, BigInteger> {

	Product save(Product product);
	ArrayList<Product> findAll();
	Product findByproductID(UUID productId);
}