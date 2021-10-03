package com.UrbanLadder.Runner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.UrbanLadder.PageObject.Landingpage;
import com.UrbanLadder.PageObject.Stores;
import com.UrbanLadder.PageObject.TrackOrder;
import com.UrbanLadder.ReusableComponents.reusablecomponent;
import com.UrbanLadder.ReusableComponents.reusablemethod;

public class TrackOrderTest extends  reusablecomponent{
	public static Logger log = LogManager.getLogger(reusablecomponent.class.getName());
	//private Header h;
	//private dataDriven d
	private reusablemethod r;
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("driver is setup");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void Trackorders() throws IOException {
		TrackOrder to = new TrackOrder(driver);
		Landingpage l = new Landingpage(driver);
		l.getPopup().click();
		to.getTrackorder().click();
		prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\data.properties");
		prop.load(fis);
		log.info("click the track order it is showing enter the orer number and phone number");
		String orderNo = prop.getProperty("orderNo");
		String phNo = prop.getProperty("phoneNum");
		to.getOrderNo().sendKeys(orderNo);
		to.getPhoneNo().sendKeys(phNo);
		log.info("click the submit buttom");
		to.getSubmit().click();
	}
	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}

}
