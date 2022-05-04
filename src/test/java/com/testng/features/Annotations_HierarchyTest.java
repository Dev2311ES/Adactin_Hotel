package com.testng.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Annotations_HierarchyTest {
	
	@BeforeSuite
	private void setProperty() {
		System.out.println("Set Property");
	}
	
	@BeforeTest
	private void browser_Launch() {
		System.out.println("Browser Launch");
	}
	
	@BeforeClass
	private void getUrl() {
		System.out.println("Url");
	}
	
	@BeforeMethod
	private void signin() {
		System.out.println("SignIn Account");
	}
	
	@Test
	private void women() {
		System.out.println("Women Page");
	}
	
	@Test
	private void dresses() {
	System.out.println("Dresses Page");
	}
	
	
	@AfterMethod
	private void signout() {
		System.out.println("Signout Account");
	}
	
	@AfterClass
	private void verify_HomePage() {
		System.out.println("Assert");
	}

	@AfterTest
	private void close() {
		System.out.println("Close Browser");
	}
	
	
	@AfterSuite
	private void deleteAllCookies() {
		System.out.println("Delete all cookies");
	}

}
