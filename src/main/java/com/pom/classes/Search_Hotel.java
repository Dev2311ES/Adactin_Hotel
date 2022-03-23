package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
public WebDriver driver;

public Search_Hotel(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//select[@id='location']")
	private WebElement searchLocation;

public WebElement getSearchLocation() {
	return searchLocation;
}
@FindBy(xpath = "//select[@id='hotels']")
private WebElement searchHotels;

public WebElement getSearchHotels() {
	return searchHotels;
}
@FindBy(xpath = "//select[@id='room_type']")
private WebElement roomType;

public WebElement getRoomType() {
	return roomType;
}

@FindBy(xpath = "//select[@id='room_nos']")
private WebElement noOfRooms;

public WebElement getNoOfRooms() {
	return noOfRooms;
}
@FindBy(xpath = "//input[@id='datepick_in']")
private WebElement checkInDate;

public WebElement getCheckInDate() {
	return checkInDate;
}
@FindBy(xpath = "//input[@id='datepick_out']")
private WebElement checkOutDate;

public WebElement getCheckOutDate() {
	return checkOutDate;
}
@FindBy(xpath = "//select[@id='adult_room']")
private WebElement adultsPerRoom;

public WebElement getAdultsPerRoom() {
	return adultsPerRoom;
}
@FindBy(xpath = "//select[@id='child_room']")
private WebElement childrenPerRoom;

public WebElement getChildrenPerRoom() {
	return childrenPerRoom;
}

@FindBy(id = "Submit")
private WebElement search_Btn;

public WebElement getSearch_Btn() {
	return search_Btn;
}

}