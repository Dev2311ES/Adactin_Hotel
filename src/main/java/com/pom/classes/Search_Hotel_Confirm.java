package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Confirm {
	public WebDriver driver;
	
	public Search_Hotel_Confirm(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement checkBox;


	public WebElement getCheckBox() {
		return checkBox;
	}
	
	@FindBy(id = "continue")
	private WebElement continue_Btn;

	public WebElement getContinue_Btn() {
		return continue_Btn;
	}
	
	
	

}
