package com.UrbanLadder.ReusableComponents;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.TestException;

import com.UrbanLadder.Utility.propertyFileReader;



public class reusablemethod {
	
	public static void getURL(WebDriver driver) {
		try {
			driver.get(propertyFileReader.loadFile().getProperty("url"));
		}
		catch(Exception e){
			System.out.println("URL not Found in data.properties");
		}
	}
	
	public static String getBrowser(WebDriver driver) {
		try {
			return propertyFileReader.loadFile().getProperty("browser");
		}
		catch(Exception e){
			System.out.println("Browser not Found in data.properties");
			return null;
		}
	}
	
	public static void impWait(WebDriver driver) throws NumberFormatException, IOException {
		
		int time = Integer.parseInt(propertyFileReader.loadFile().getProperty("wait1"));
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		
	}
	
	public WebElement getElement(By locator, WebDriver driver) {
		try {
			return driver.findElement(locator);
		}
		catch(Exception e) {
			throw new TestException(String.format("Could not locate element at"+locator, null));

		}
		
	}
	


}
