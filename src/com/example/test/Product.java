package com.example.test;

public class Product {
	private int id;
	private String name;
	private float price;
	
	public static void main(String[] args) {
		Product product = new Product();
		product.id = 1;
		product.name = "iPhone";
		product.price = 100.50f;
		
		System.out.println("Product id: "+product.id+"\nProduct name: "+product.name+"\nProduct price: "+product.price);
		
	}
}
