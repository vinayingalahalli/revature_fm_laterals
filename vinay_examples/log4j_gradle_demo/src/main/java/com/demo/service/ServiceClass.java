package com.demo.service;

import org.apache.log4j.Logger;



public class ServiceClass {
	private static Logger log=Logger.getLogger(ServiceClass.class);

	public boolean isPrime(int n) {
		log.info("isPrime() was called with value of n = "+n); 
		int c=0;
		boolean b=false;
		for (int i = 1; i <=n; i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			b=true;
		}
		log.info("isPrime() executed successfully with results of prime for value ="+n+" to "+b); 
		return b;
	}
}
