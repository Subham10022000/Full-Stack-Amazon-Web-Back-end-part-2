package com.amazon.AddToCart.entity;

import java.math.BigInteger;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

public BigInteger id;
	
	public UUID productID;
	public String name;
	public double price;
	public double rating;
	public String imageURL;
}
