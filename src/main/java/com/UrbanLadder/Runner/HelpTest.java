package com.UrbanLadder.Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.UrbanLadder.PageObject.GiftCard;
import com.UrbanLadder.PageObject.Help;
import com.UrbanLadder.PageObject.Landingpage;
import com.UrbanLadder.ReusableComponents.reusablecomponent;
import com.UrbanLadder.ReusableComponents.reusablemethod;

public class HelpTest extends reusablecomponent{
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
		Help hc = new Help(driver);
		Landingpage l = new Landingpage(driver);
		l.getPopup().click();
		log.info("Close the popup window");
		hc.getHelp().click();
		hc.getIssue().sendKeys("why");
		log.info("enter the send keys value");
		hc.getIssue().sendKeys(Keys.DOWN);
		hc.getIssue().sendKeys(Keys.ENTER);
		log.info("next it shows the which is customer enter");
		
		
	}
	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}
	
}
