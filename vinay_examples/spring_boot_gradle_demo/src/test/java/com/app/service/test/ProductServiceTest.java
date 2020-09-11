package com.app.service.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.model.Product;
import com.app.repository.ProductRepository;
import com.app.service.ProductService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {

	@Autowired
	private ProductService service;
	
	@MockBean
	private ProductRepository repository;
	
	@Test
	public void testAddProduct() {
		Product product=new Product();
		product.setManufacturerName("testManName");
		product.setCost(12.33);
		product.setName("testName");
		product.setRatings(3.33f);
		Product pMock=new Product();
		pMock.setManufacturerName("testManName");
		pMock.setCost(12.33);
		pMock.setName("testName");
		pMock.setRatings(3.33f);
		pMock.setId(2);
		when(repository.save(product)).thenReturn(pMock);
		Product test=service.addProduct(product);
		System.out.println(test);
		assertEquals(pMock, test);
	}
}
