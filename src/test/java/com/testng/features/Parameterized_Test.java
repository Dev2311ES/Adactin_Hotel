package com.testng.features;


import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	
	
	@Test
	@Parameters({"userName" , "password"})
	private void loginFunctionality(@Optional("arul")String username,
			String password) {
		System.out.println("Enter username :" + username);
		System.out.println("Enter password :" + password);
	}

}
// Using @Optional annotaions we can over come case sensitive values both in java
//and xml file also
//Run in xml file
