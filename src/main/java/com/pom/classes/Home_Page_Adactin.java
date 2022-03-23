package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page_Adactin {
public WebDriver driver;

public Home_Page_Adactin(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//input[@id='username']")
private WebElement userName;

public WebElement getUserName() {
	return userName;
}

@FindBy(xpath = "//input[@id='password']")
private WebElement password;

public WebElement getPassword() {
	return password;
}

@FindBy(xpath = "//input[@id='login']")
private WebElement login_Btn;

public WebElement getLogin_Btn() {
	return login_Btn;
}



















}
