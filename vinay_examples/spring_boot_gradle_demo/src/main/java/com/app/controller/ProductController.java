package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Product;
import com.app.service.ProductService;

import io.swagger.annotations.Api;

@RestController
@Api(value = "This is Product CRUD Controller")
public class ProductController  {

	@Autowired
	private ProductService service;
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		// TODO Auto-generated method stub
		return service.addProduct(product);
	}

	@PutMapping("/product")
	public Product updateProduct(@RequestBody Product product) {
		// TODO Auto-generated method stub
		return service.updateProduct(product);
	}

	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return service.getProductById(id);
	}

	@DeleteMapping("/product/{id}")
	public void deleteProductById(@PathVariable int id) {
		
		service.deleteProductById(id);
	}

	
	
}
