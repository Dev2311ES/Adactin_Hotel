package com.rest_api_demo;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Data_Validation {

	@Test	
	public void data_Validation() {
		RestAssured.baseURI = "https://reqres.in/";
		
		RequestSpecification requset = RestAssured.given();
		
		Response response = requset.get("api/users/2");
		
		String string = response.asString();
		
		System.out.println(string);
		
		int act_Code = response.getStatusCode();
		
		Assert.assertEquals(200, act_Code);
		
		System.out.println("Data Validation Success");
		
	}
}
