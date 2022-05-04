package com.configuration.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public Configuration_Reader() throws IOException {

		File f = new File(
				"C:\\Users\\Sugadev\\eclipse-workspace\\Adactin\\src\\main\\java\\com.testdataproperty\\configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String get_Config_FirstName() {

		String firstname = p.getProperty("firstname");
		return firstname;

	}

	public String get_Config_UserName() {

		String username = p.getProperty("username");
		return username;

	}

	public String get_Config_password() {

		String password = p.getProperty("password");
		return password;

	}

}
