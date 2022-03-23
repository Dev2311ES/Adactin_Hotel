package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Itinerary {
public WebDriver driver;

@FindBy(xpath = "//a[normalize-space()='Booked Itinerary']")
private WebElement bookedItinerary;

public My_Itinerary(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getBookedItinerary() {
	return bookedItinerary;
}

}
