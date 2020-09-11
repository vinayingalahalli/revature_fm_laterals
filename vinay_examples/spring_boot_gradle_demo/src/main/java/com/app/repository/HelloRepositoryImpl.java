package com.app.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepositoryImpl implements HelloRepository {

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Hello from MOCKITO-JUNIT......";
	}

}
