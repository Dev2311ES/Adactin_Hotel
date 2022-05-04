package com.configuration.properties;

import java.io.IOException;

public class File_Reader_Manager {
	
	//1.Private constructor
	private File_Reader_Manager() {

	}

	// 2.Static Method
	public static File_Reader_Manager get_Instance_FRM() {

		File_Reader_Manager helper = new File_Reader_Manager();
		return helper;
	}

	// 3.Non Static Method
	public Configuration_Reader get_Instance_CR() throws IOException {

		Configuration_Reader reader = new Configuration_Reader();
		return reader;
	}

}
