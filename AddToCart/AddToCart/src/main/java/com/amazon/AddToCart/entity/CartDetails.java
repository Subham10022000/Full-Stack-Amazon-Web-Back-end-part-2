package com.amazon.AddToCart.entity;

import java.util.ArrayList;
import java.util.UUID;

import lombok.Data;

@Data
public class CartDetails {
	
	private UUID userId;
	private ArrayList<Product> list;

}
