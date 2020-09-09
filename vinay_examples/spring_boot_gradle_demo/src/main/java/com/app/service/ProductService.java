package com.app.service;

import java.util.List;

import com.app.model.Product;

public interface ProductService {

	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public Product getProductById(int id);
	public void deleteProductById(int id);
	
	public List<Product> getAllProducts();
	public List<Product> getProductsByName(String name);
	public List<Product> getProductsByCost(double cost);
	public List<Product> getProductsByRating(float rating);
	public List<Product> getProductsByManufacturerName(String manufactureName);
}
