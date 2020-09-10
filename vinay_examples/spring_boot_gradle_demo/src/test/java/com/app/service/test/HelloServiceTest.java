package com.app.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.repository.HelloRepository;
import com.app.service.HelloService;
import com.app.service.impl.HelloServiceImpl;

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
	
	//@Autowired
	
	
	 
	 @Mock
	 private HelloRepository repository;
	 
	 @InjectMocks
	 private HelloService helloService=new HelloServiceImpl();
	 
	 @Before
	public void setUpMockObject() {
		 System.out.println("Before Each");
		 when(repository.sayHello()).thenReturn("Hello from Mockito Response");
	 }
	
	@Test
	public void testSayHello() {
		System.out.println(helloService.sayHello());
		assertEquals("Hello from JUNIT......", helloService.sayHello());
	}
}
