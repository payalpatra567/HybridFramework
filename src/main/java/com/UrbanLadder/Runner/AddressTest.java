package com.UrbanLadder.Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.UrbanLadder.PageObject.Address;
import com.UrbanLadder.PageObject.Footer;
import com.UrbanLadder.PageObject.Landingpage;
import com.UrbanLadder.ReusableComponents.reusablecomponent;
import com.UrbanLadder.ReusableComponents.reusablemethod;

public class AddressTest extends  reusablecomponent{
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
	public void AdressTest() throws IOException {
		Landingpage l = new Landingpage(driver);
		l.getPopup().click();
		log.info("close the pop up window");
		Address a = new Address(driver);
		System.out.println("Print address of the urbanladder: "+a.getaddress().getText());
		
	}
	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}
}