package com.UrbanLadder.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class propertyFileReader {
	//public WebDriver driver;
	//public Properties prop;
	public static Properties loadFile()  {
		Properties prop = new Properties();
		try {
		FileInputStream fs = new FileInputStream(".\\data.properties");
		prop.load(fs);}
		catch(Exception e){
			System.out.println("Properties file could not be loaded");
		}
		return prop;
	
	}
	

	
	

	

}
