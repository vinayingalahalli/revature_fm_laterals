package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.repository.HelloRepository;
import com.app.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	@Autowired
	private HelloRepository helloRepository;
	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return helloRepository.sayHello();
	}

}
