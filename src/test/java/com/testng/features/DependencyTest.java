package com.testng.features;

import org.testng.annotations.Test;

public class DependencyTest {
	
	@Test
	private void schoolBooks() {
		System.out.println("schoolBooks");
	}
	
	@Test
	private void collegeBooks() {
		System.out.println("collegeBooks");
	}
	
	@Test
	private void fantasyBooks() {
		System.out.println("fantasyBooks");
	}
	
	@Test
	private void comicBooks() {
		System.out.println("comicBooks");
	}
	
	@Test(dependsOnMethods = "fantasyBooks")
	private void booksOffer() {
		System.out.println("booksoffer");
	}

}
