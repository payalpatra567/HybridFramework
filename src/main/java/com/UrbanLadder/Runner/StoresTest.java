package com.UrbanLadder.Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.UrbanLadder.PageObject.Landingpage;
import com.UrbanLadder.PageObject.Stores;
import com.UrbanLadder.ReusableComponents.reusablecomponent;
import com.UrbanLadder.ReusableComponents.reusablemethod;


public class StoresTest extends reusablecomponent{
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
	public void validateStores() {
		Stores st = new Stores(driver);
		Landingpage l = new Landingpage(driver);
		l.getPopup().click();
		st.getStores().click();
		log.info("click the store it show all available furniture");
		st.getStoreDetails().click();
		System.out.println(st.getTitle().getText());
		log.info("it is check the assert is correct or not");
		Assert.assertEquals(st.getTitle().getText(), "Urban Ladder Furniture Store - Hadapsar");
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}
}
