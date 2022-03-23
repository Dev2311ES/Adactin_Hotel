package com.Adactin_Hotel;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import Hotel_Book.Adactin.Adactin_Base_Class;
import com.Adactin_Pom_Manager.Adactin_Object_Manager;


public class Adactin_Runner_Class extends Adactin_Base_Class {
	public static WebDriver driver = browser_Configuration("chrome");;
	public static Adactin_Object_Manager aom = new Adactin_Object_Manager(driver);
	public static Logger log = Logger.getLogger(Adactin_Runner_Class.class);
	
	public static void main(String[] args) throws IOException {
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("Launch The URL");
		getUrl("https://adactinhotelapp.com/");

		// Login
		log.info("Login Page Opened");
		inputValueElement(aom.get_Instance_Home_Page_Adactin().getUserName(),
				test_Data("C:\\Users\\Sugadev\\Desktop\\Project\\Adactin\\AdactinTestCases.xlsx", 4, 5));
		inputValueElement(aom.get_Instance_Home_Page_Adactin().getPassword(),
				test_Data("C:\\Users\\Sugadev\\Desktop\\Project\\Adactin\\AdactinTestCases.xlsx", 5, 5));
		clickOnElement(aom.get_Instance_Home_Page_Adactin().getLogin_Btn());
		log.warn("Search Hotel Page Successfully Opened");
		
		// Search Hotel
		dropDown(aom.get_Instance_Search_Hotel().getSearchLocation(), "byValue", "Paris");
		dropDown(aom.get_Instance_Search_Hotel().getSearchHotels(), "byValue", "Hotel Sunshine");
		dropDown(aom.get_Instance_Search_Hotel().getRoomType(), "byValue", "Deluxe");
		dropDown(aom.get_Instance_Search_Hotel().getNoOfRooms(), "byValue", "1");
		clear(aom.get_Instance_Search_Hotel().getCheckInDate());
		inputValueElement(aom.get_Instance_Search_Hotel().getCheckInDate(), "02/02/2022");
		clear(aom.get_Instance_Search_Hotel().getCheckOutDate());
		inputValueElement(aom.get_Instance_Search_Hotel().getCheckOutDate(), "04/02/2022");
		dropDown(aom.get_Instance_Search_Hotel().getAdultsPerRoom(), "byValue", "2");
		dropDown(aom.get_Instance_Search_Hotel().getChildrenPerRoom(), "byValue", "1");
		clickOnElement(aom.get_Instance_Search_Hotel().getSearch_Btn());
		log.info("Search Hotel Page Successful ");
		
		// Search Hotel Confirm
		clickOnElement(aom.get_Instance_Search_Hotel_Confirm().getCheckBox());
		clickOnElement(aom.get_Instance_Search_Hotel_Confirm().getContinue_Btn());
		log.info("Search Hotel Confirm page Successful");

		// Book A Hotel
		log.info("Book a Hotel Page Successfully Opened");
		inputValueElement(aom.get_Instance_Book_A_Hotel().getFirstName(), 
						test_Data("C:\\Users\\Sugadev\\Desktop\\Project\\Adactin\\AdactinTestCases.xlsx", 20, 5));
		inputValueElement(aom.get_Instance_Book_A_Hotel().getLastName(),
						test_Data("C:\\Users\\Sugadev\\Desktop\\Project\\Adactin\\AdactinTestCases.xlsx", 21, 5));
		inputValueElement(aom.get_Instance_Book_A_Hotel().getBillingAddress(), 
						test_Data("C:\\Users\\Sugadev\\Desktop\\Project\\Adactin\\AdactinTestCases.xlsx", 22, 5));
		inputValueElement(aom.get_Instance_Book_A_Hotel().getCreditCardNo(), 
						test_Data("C:\\Users\\Sugadev\\Desktop\\Project\\Adactin\\AdactinTestCases.xlsx", 23, 5));
		dropDown(aom.get_Instance_Book_A_Hotel().getCreditCardType(), "byValue", "VISA");
		dropDown(aom.get_Instance_Book_A_Hotel().getExpiryMonth(), "byValue", "6");
		dropDown(aom.get_Instance_Book_A_Hotel().getExpiryYear(), "byValue", "2022");
		inputValueElement(aom.get_Instance_Book_A_Hotel().getCvvNumber(), 
						test_Data("C:\\Users\\Sugadev\\Desktop\\Project\\Adactin\\AdactinTestCases.xlsx", 27, 5));
		clickOnElement(aom.get_Instance_Book_A_Hotel().getBookNow_Btn());
		log.info("Book a Hotel Successful");
		
		// bookedItinerary
		clickOnElement(aom.get_Instance_My_Itinerary().getBookedItinerary());

		// Screenshot
		takeScreenshot("RoomBooked");
		log.warn("Take a Screenshot Successfully");
		
		// Logout Page
		clickOnElement(aom.get_Instance_Logout_Page().getLogoutPage());
		log.warn("Page Successfully Logout");
		//Quit Browser 
		quit();
	}

}
