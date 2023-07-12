package com.amazon.AddToCart.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity(name="Cart")
public class Cart {
	
	@javax.persistence.Id
	@GeneratedValue
	public long  id;
	
	public UUID userId;
	public UUID productId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public UUID getUserId() {
		return userId;
	}
	public void setUserId(UUID userId) {
		this.userId = userId;
	}
	public UUID getProductId() {
		return productId;
	}
	public void setProductId(UUID productId) {
		this.productId = productId;
	}
	public Cart(long id, UUID userId, UUID productId) {
		super();
		this.id = id;
		this.userId = userId;
		this.productId = productId;
	}
	public Cart() {
		
	}
	
	
	
}
