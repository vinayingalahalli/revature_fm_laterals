package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Product;
import com.app.service.ProductService;

@RestController
public class ProductSearchController {

	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		
		return service.getAllProducts();
	}

	@GetMapping("/products/name/{name}")
	public List<Product> getProductsByName(@PathVariable String name) {
		// TODO Auto-generated method stub
		return service.getProductsByName(name);
	}

	@GetMapping("/products/cost/{cost}")
	public List<Product> getProductsByCost(@PathVariable double cost) {
		// TODO Auto-generated method stub
		return service.getProductsByCost(cost);
	}

	
	public List<Product> getProductsByRating(float rating) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Product> getProductsByManufacturerName(String manufactureName) {
		// TODO Auto-generated method stub
		return null;
	}

}
