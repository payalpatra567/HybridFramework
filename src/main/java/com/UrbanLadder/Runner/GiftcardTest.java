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
import com.UrbanLadder.PageObject.TrackOrder;
import com.UrbanLadder.ReusableComponents.reusablecomponent;
import com.UrbanLadder.ReusableComponents.reusablemethod;

public class GiftcardTest extends  reusablecomponent{
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
	public void GiftCardValidate() throws IOException {
		GiftCard gc = new GiftCard(driver);
		Landingpage l = new Landingpage(driver);
		l.getPopup().click();
		log.info("close the pop up window");
		gc.getGiftcard().click();
		log.info("shows the giftcard page");
		Actions A = new Actions(driver);
		A.moveToElement(gc.getweddingcard());
		A.moveToElement(gc.Selectwedingcard()).click().build().perform();
		log.info("it is  automatically click the wedding button  ");
		gc.getPrice().click();
		gc.clickNext().click();
		gc.getRecipientname().sendKeys("pranjal");
		gc.getRecipientEmail().sendKeys("Pranjal123@gmail.com");
		log.info("enter the recipient name and email");
		gc.getYourname().sendKeys("payal");
		gc.getYouremail().sendKeys("ppatra9437@gmail.com");
		gc.getYournumber().sendKeys("9437784420");
		gc.getYourmessage().sendKeys("welcome");
		log.info("enter the your name,email,number and message");
		gc.getconfirm().click();
		
	}
	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}
	
}
