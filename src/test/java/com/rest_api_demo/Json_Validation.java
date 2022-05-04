package com.rest_api_demo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_Validation {
	public static void main(String[] args) throws IOException, ParseException {
		
		File f = new File 
				("C:\\Users\\Sugadev\\eclipse-workspace\\Adactin\\src\\test\\java\\com\\payload\\api\\payload.json");
		
		FileReader reader = new FileReader(f); //FileReader Import in java.io
		
		JSONParser parser = new JSONParser();
		
		Object object = parser.parse(reader);
		
		JSONObject jsonObj = (JSONObject) object;
		
		Object url = jsonObj.get("avatar");
		Object email = jsonObj.get("email");
		Object first_Name = jsonObj.get("first_name");

		System.out.println("URL is :" + url);
		System.out.println("Email id:" + email);
		System.out.println("First name:" + first_Name);
		
		
		
	}
	

}
