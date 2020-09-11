package com.app.service.test;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.repository.HelloRepository;
import com.app.service.HelloService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloServiceTest {
/*
 *  <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
            <exclusions>
                <exclusion>
                    <groupId>junit</groupId>
                    <artifactId>junit</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
 */
	
	@Autowired
	private HelloService service;
	
	
	 
	 @MockBean
	 private HelloRepository repository;
	 
	
//	 
//	 @Before
//	public void setUpMockObject() {
//		 System.out.println("Before Each");
//		 when(repository.sayHello()).thenReturn("Hello from Mockito Response");
//	 }
//	
	@Test
	public void testSayHello() {
		//System.out.println(helloService.sayHello());
		when(repository.sayHello()).thenReturn("Hello from JUNIT......");
		assertEquals("Hello from JUNIT......", service.sayHello());
	}
}
