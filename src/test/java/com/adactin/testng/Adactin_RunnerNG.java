package com.adactin.testng;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Adactin_Hotel.Adactin_Runner_Class;
import com.Adactin_Pom_Manager.Adactin_Object_Manager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.configuration.properties.File_Reader_Manager;

import Hotel_Book.Adactin.Adactin_Base_Class;

public class Adactin_RunnerNG extends Adactin_Base_Class {

	public static WebDriver driver = browser_Configuration("chrome");;
	public static Adactin_Object_Manager aom = new Adactin_Object_Manager(driver);
	public static Logger log = Logger.getLogger(Adactin_Runner_Class.class);
	public static ExtentReports reports;
	public static ExtentTest test;
	public static ExtentSparkReporter spark_Reporter;

	@BeforeSuite
	private void report_Generation() {

		spark_Reporter = new ExtentSparkReporter(
				"C:\\Users\\Sugadev\\eclipse-workspace\\Adactin\\ExtentFile\\AdactinExeReport.html");
		reports = new ExtentReports();
		reports.attachReporter(spark_Reporter);
	}

	@AfterSuite
	private void browerClose() {
		close();
	}

	@BeforeTest
	private void launch_Url() {
		PropertyConfigurator.configure("log4j.properties");

		log.info("Launch The URL");
		getUrl("https://adactinhotelapp.com/");

	}

	@BeforeClass
	private void loginCredentials() throws IOException {
		log.info("Login Page Opened");
		String username = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_UserName();
		inputValueElement(aom.get_Instance_Home_Page_Adactin().getUserName(), username);

		String password = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_password();
		inputValueElement(aom.get_Instance_Home_Page_Adactin().getPassword(), password);

		clickOnElement(aom.get_Instance_Home_Page_Adactin().getLogin_Btn());
		log.warn("Search Hotel Page Successfully Opened");

	}

	@Test(priority = 0)
	private void search_Hotel() {
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

	}

	@Test(priority = 1)
	private void confirm_Hotel() {
		clickOnElement(aom.get_Instance_Search_Hotel_Confirm().getCheckBox());
		clickOnElement(aom.get_Instance_Search_Hotel_Confirm().getContinue_Btn());
		log.info("Search Hotel Confirm page Successful");

	}

	@Test(priority = 2)
	private void book_Hotel() throws IOException {
		log.info("Book a Hotel Page Successfully Opened");

		String firstname = File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_FirstName();
		inputValueElement(aom.get_Instance_Book_A_Hotel().getFirstName(), firstname);
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
	}

	@Test(priority = 3)
	private void bookedItinerary() {
		clickOnElement(aom.get_Instance_My_Itinerary().getBookedItinerary());

	}

	@Test(priority = 4)
	private void screenshot_Hotel() throws IOException {
		takeScreenshot("RoomBooked");
		log.warn("Take a Screenshot Successfully");

	}

	@AfterClass
	private void logoutPage() {
		clickOnElement(aom.get_Instance_Logout_Page().getLogoutPage());
		log.warn("Page Successfully Logout");

	}

	@AfterTest
	private void flush() {
		reports.flush();
	}

}
