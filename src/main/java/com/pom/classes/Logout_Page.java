package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
	public WebDriver driver;
	
	public Logout_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "logout")
	private WebElement logoutPage;

	public WebElement getLogoutPage() {
		return logoutPage;
	}



}
