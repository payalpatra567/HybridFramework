package com.UrbanLadder.Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.UrbanLadder.PageObject.Landingpage;
import com.UrbanLadder.ReusableComponents.reusablecomponent;
import com.UrbanLadder.ReusableComponents.reusablemethod;


public class LinksInHomePage extends reusablecomponent{
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
	public void CountLinks() {
		System.out.println(driver.findElements(By.tagName("a")).size());
		log.info(driver.findElements(By.tagName("a")).size());
	}
	
	@Test
	public void CustomerStories() throws InterruptedException {
		//System.out.println(driver.findElements(By.tagName("a")).size());
		//log.info(driver.findElements(By.tagName("a")).size());
		
		Landingpage l = new Landingpage(driver);
		l.getPopup().click();
		l.getCustomerStories().click();
	
		String email = prop.getProperty("subscribeEmail");
		Thread.sleep(1000l);
		l.Email().sendKeys(email);
		l.subscribe().click();
		/*String text = lp.verifyText().getText();
		
		Assert.assertEquals(text, "THANKS FOR SUBSCRIBING");*/
		
		log.info("Subscribed Successfully");
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
		log.info("Driver is closed successfully");
	}

}
