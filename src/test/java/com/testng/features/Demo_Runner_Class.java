package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_Runner_Class {

	@Test(priority = -1 ,retryAnalyzer = Retry_Class.class)
	private void username() {
		String expected_Username = "Sivan2311";
		String actual_Username = "Sivaa2311";

		Assert.assertEquals(expected_Username, actual_Username);

	}

	@Test(priority = 0)
	private void password() {
		String expected_Password = "Arul2207";
		String actual_Password = "Arul2207";
		
		Assert.assertEquals(expected_Password, actual_Password);

	}

}
//If both expected and actual values are not same than test Failed