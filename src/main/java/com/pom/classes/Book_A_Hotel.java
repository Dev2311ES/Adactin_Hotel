package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {
	public WebDriver driver;
	//https://adactinhotelapp.com/BookHotel.php
	public Book_A_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "first_name")
	private WebElement firstName;
	
	public WebElement getFirstName() {
		return firstName;
	}
	@FindBy(id = "last_name")
	private WebElement lastName;
	
	public WebElement getLastName() {
		return lastName;
	}
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement billingAddress;
	
	public WebElement getBillingAddress() {
		return billingAddress;
	}
	@FindBy(id = "cc_num")
	private WebElement creditCardNo;
	
	public WebElement getCreditCardNo() {
		return creditCardNo;
	}
	@FindBy(id = "cc_type")
	private WebElement creditCardType;
	
	public WebElement getCreditCardType() {
		return creditCardType;
	}
	@FindBy(id = "cc_exp_month")
	private WebElement expiryMonth;
	
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	@FindBy(id = "cc_exp_year")
	private WebElement expiryYear;
	
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	@FindBy(id = "cc_cvv")
	private WebElement cvvNumber;
	
	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	@FindBy(id = "book_now")
	private WebElement bookNow_Btn;
	public WebElement getBookNow_Btn() {
		return bookNow_Btn;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}