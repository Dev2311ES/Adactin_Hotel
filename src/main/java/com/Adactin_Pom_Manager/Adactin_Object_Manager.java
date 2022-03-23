package com.Adactin_Pom_Manager;

import org.openqa.selenium.WebDriver;

import com.pom.classes.Book_A_Hotel;
import com.pom.classes.Home_Page_Adactin;
import com.pom.classes.Logout_Page;
import com.pom.classes.My_Itinerary;
import com.pom.classes.Search_Hotel;
import com.pom.classes.Search_Hotel_Confirm;

public class Adactin_Object_Manager {
	public WebDriver driver;
	
	private Book_A_Hotel bah;
	private Home_Page_Adactin hpa;
	private Logout_Page lp;
	private My_Itinerary mi;
	private Search_Hotel_Confirm sch;
	private Search_Hotel sh;
	
	public Adactin_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Book_A_Hotel get_Instance_Book_A_Hotel() {
		if(bah==null) {
			bah = new Book_A_Hotel(driver); 
		}
		return bah;
	}

	public Home_Page_Adactin get_Instance_Home_Page_Adactin() {
		if(hpa==null) {
			hpa = new Home_Page_Adactin(driver); 
		}
		return hpa;
	}	
	
	public Logout_Page get_Instance_Logout_Page() {
		if(lp==null) {
			lp = new Logout_Page(driver); 
		}
		return lp;
	}
	
	public My_Itinerary get_Instance_My_Itinerary() {
		if(mi==null) {
			mi = new My_Itinerary(driver); 
		}
		return mi;
	}
	
	public Search_Hotel_Confirm get_Instance_Search_Hotel_Confirm() {
		if(sch==null) {
			sch = new Search_Hotel_Confirm(driver); 
		}
		return sch;
	}
	public Search_Hotel get_Instance_Search_Hotel() {
		if(sh==null) {
			sh = new Search_Hotel(driver); 
		}
		return sh;
	}
}
