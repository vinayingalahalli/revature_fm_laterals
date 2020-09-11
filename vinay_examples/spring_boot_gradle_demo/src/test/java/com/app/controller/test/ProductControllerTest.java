package com.app.controller.test;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.model.Product;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class ProductControllerTest {
	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void testAddProduct() throws MalformedURLException {
	URL url=new URL("http://localhost:"+port+"/product");
	Product product=new Product("testName", 12.22, 3.33f, "testManName");
	ResponseEntity<Product> res=restTemplate.postForEntity(url.toString(), product, Product.class);
	assertEquals(1, res.getBody().getId());
	
	}
	
	
}
