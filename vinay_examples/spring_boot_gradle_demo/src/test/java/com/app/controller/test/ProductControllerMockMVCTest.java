package com.app.controller.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.app.controller.ProductController;
import com.app.model.Product;
import com.app.repository.ProductRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

//@ExtendWith(MockitoExtension.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class ProductControllerMockMVCTest {

	private MockMvc mvc;
	
	@Mock
	private ProductRepository repository;
	
	@InjectMocks
	private ProductController controller;
	
	@Autowired
    private WebApplicationContext appCtx;
	
	private JacksonTester<Product> jsonProduct;
	
	@Before
	public void setUp() {
		
		JacksonTester.initFields(this, new ObjectMapper());
//		mvc=MockMvcBuilders.standaloneSetup(controller).build();
		mvc= MockMvcBuilders.webAppContextSetup(appCtx).build();
				
	}
	
	@Test
	public void testAddProductMock() throws Exception{
		
		MockHttpServletResponse res=mvc.perform(
				post("/product/").contentType(MediaType.APPLICATION_JSON)
				.content(jsonProduct.write(new Product("testName", 12.2, 2.2f, "testMName")).getJson())
				).andReturn().getResponse();
		
		assertThat(res.getStatus()).isEqualTo(HttpStatus.CREATED.value());
	}
}
