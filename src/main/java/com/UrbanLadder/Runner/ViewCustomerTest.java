package com.UrbanLadder.Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.UrbanLadder.PageObject.GiftCard;
import com.UrbanLadder.PageObject.Landingpage;
import com.UrbanLadder.PageObject.Viewcustomer;
import com.UrbanLadder.ReusableComponents.reusablecomponent;
import com.UrbanLadder.ReusableComponents.reusablemethod;

public class ViewCustomerTest extends  reusablecomponent{
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
	public void viewcustomerstories() throws IOException {
		Viewcustomer v = new Viewcustomer(driver);
		Landingpage l = new Landingpage(driver);
		l.getPopup().click();
		v.getViewCustomer().click();
		log.info("print the customer review");
		System.out.println("print customer review : "+v.getViewCustomerreview().getText());
		
	}
	@AfterTest
	public void teardown() {
		log.info("close the browser");
		driver.close();
		driver = null;
	}
}