package com.app.service.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.app.model.Product;
import com.app.repository.ProductRepository;
import com.app.service.impl.ProductServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceMockitoTest {

	@Mock
	private ProductRepository repository;
	
	@InjectMocks
	private ProductServiceImpl service;
	
	
	@Test
	public void testAddProductMockito() {
		Product p=new Product("testName", 1.1, 2.2f, "testManufacturerName");
		Product pMock=new Product("testName", 1.1, 2.2f, "testManufacturerName");
		pMock.setId(1);
		when(repository.save(p)).thenReturn(pMock);
		assertEquals(pMock, service.addProduct(p));
	}
}
