package com.testng.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Test {
	//1.enabled method
	
	@Test(priority = -2, enabled = false)
	private void browser_Launch() {
		System.out.println("Browser Launch");
	}
	
	@Test(priority = -1)
	private void url_Launch() {
		System.out.println("Url Launch");
	}
	
	//2.Using @Ignore annotations
	@Ignore
	@Test(priority = 0 , invocationCount = 3)
	private void refresh() {
		System.out.println("refresh HomePage");
	}
	
	@Test(priority = 1)
	private void signBtn() {
		System.out.println("Signin Button");
	}
	
	@Test(priority = 2)
	private void username() {
		System.out.println("username");
	}
	
	@Test(priority = 3)
	private void password() {
		System.out.println("password");
	}
	
	@Test(priority = 4)
	private void summitBtn() {
		System.out.println("Summit Button");
	}

}
