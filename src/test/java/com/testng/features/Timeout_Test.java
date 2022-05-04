package com.testng.features;

import org.testng.annotations.Test;

public class Timeout_Test {
	
	@Test(timeOut = 8000)
	private void browser_Execution() throws InterruptedException {
		
		Thread.sleep(1000);	//Browser Launch	
		System.out.println("Browser Launch");
		
		Thread.sleep(2000);//Url Launch
		System.out.println("Url Launch");
		
		Thread.sleep(1000);//Data entered 
		System.out.println("Credentials Entered");
	
		Thread.sleep(1000);//Next Page
		System.out.println("Next Page");
		
		Thread.sleep(2000);//Real static page

}
}
//timeOut is incldue implicit , expilicit and Thread all the waits 
//timeout must less than total wait below and not equal