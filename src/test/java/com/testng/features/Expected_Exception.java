package com.testng.features;

import org.testng.annotations.Test;

public class Expected_Exception {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void calculator() {
		int a = 10 ; 
		int b = 2 ;
		
		int c = (a/b);
		
		System.out.println("Value is :" + c);
		
		
	}
}
