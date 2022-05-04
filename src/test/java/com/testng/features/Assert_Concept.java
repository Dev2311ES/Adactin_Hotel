package com.testng.features;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {

	@Test
	private void username() {
	String expected_Username = "Sivan2311";
	String actual_Username = "SivanArul2311";
	
	SoftAssert soft = new SoftAssert();
	
	soft.assertEquals(expected_Username, actual_Username);
	
	System.out.println("Assert verification :");
	
	//in both Equals and NotEquals methods test will be Passsed in Soft Assert
	
	
	//Assert.assertEquals(expected_Username, actual_Username);
	//Assert.assertNotEquals(expected_Username, actual_Username);
	//Assert.assertSame(expected_Username, actual_Username);
	//assertNull(expected_Username);
	//assertNotNull(expected_Username);
	}

}
