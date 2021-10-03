package com.UrbanLadder.Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.UrbanLadder.PageObject.Footer;
import com.UrbanLadder.PageObject.GiftCard;
import com.UrbanLadder.PageObject.Landingpage;
import com.UrbanLadder.ReusableComponents.reusablecomponent;
import com.UrbanLadder.ReusableComponents.reusablemethod;

public class FooterTest extends  reusablecomponent{
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
	public void Footer() throws IOException {
		Footer f = new Footer(driver);
		Landingpage l = new Landingpage(driver);
		l.getPopup().click();
		log.info("close the pop up window");
		f.clickPress().click();
		System.out.println(f.getText().getText());
		log.info("it is check the assert is correct or not");
		Assert.assertEquals(f.getText().getText(), "CNBC Awaaz - Entrepreneur");
		System.out.println(f.getndtv().getText());
		log.info("it is check the assert is correct or not");
		Assert.assertEquals(f.getndtv().getText(), "NDTV Good Times");
		System.out.println(f.getcnbc().getText());
		log.info("it is check the assert is correct or not");
		Assert.assertEquals(f.getcnbc().getText(), "CNBC TV 18 - Young turks");
		f.getNews().click();
	}
	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}
}
