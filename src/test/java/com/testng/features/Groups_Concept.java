package com.testng.features;

import org.testng.annotations.Test;

public class Groups_Concept {
	
	@Test(groups = "EducationBooks")
	private void schoolBooks() {
		System.out.println("schoolBooks");
	}
	
	@Test(groups = "EducationBooks")
	private void collegeBooks() {
		System.out.println("collegeBooks");
	}
	
	@Test(groups = "EntertainmentBooks")
	private void fantasyBooks() {
		System.out.println("fantasyBooks");
	}
	
	@Test(groups = "EntertainmentBooks")
	private void comicBooks() {
		System.out.println("comicBooks");
	}

	@Test(groups = "EntertainmentBooks")
	private void storyBooks() {
		System.out.println("StoryBooks");
	}
	
	@Test(groups = "MusicList")
	private void music() {
		System.out.println("music");
	}
	
	
	
}
