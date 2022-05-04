package com.testng.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Test {

	@Test(dataProvider = "test_Data")
	private void runner_Class(String username, String password) {
		System.out.println("Enter username :" + username);
		System.out.println("Enter password :" + password);
	}

	@DataProvider
	private Object[][] test_Data() {

		return new Object[][] {

				{ "city", "str235" }, 
				{ "town", "wow235" }, 
				{ "street", "sele78" } 
				};

	}

}
