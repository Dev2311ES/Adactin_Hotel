package com.testng.features;

import org.testng.annotations.Test;

public class Multi_Threading {
	
	@Test(priority = -1)
	private void flipkart() {
		System.out.println("Purchase in flipkat Page");
	}
	
	@Test
	private void amazon() {
		System.out.println("Purchase in amazon Page");
		

	}

}
