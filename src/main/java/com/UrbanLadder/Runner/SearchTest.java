package com.UrbanLadder.Runner;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.UrbanLadder.PageObject.Landingpage;
import com.UrbanLadder.PageObject.Search;
import com.UrbanLadder.ReusableComponents.reusablecomponent;
import com.UrbanLadder.ReusableComponents.reusablemethod;

public class SearchTest extends reusablecomponent {
	public static Logger log = LogManager.getLogger(reusablecomponent.class.getName());
	//private Header h;
	//private dataDriven d
	private reusablemethod r;
	@BeforeTest
	public void openBrowser() throws IOException
	{
		 driver = initializeDriver();
		 log.info("driver is intialized");
		 log.info("Driver is setup");
		
	}
	@Test
	public void SearchPage() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		log.info("Url is open");
		Landingpage l = new Landingpage(driver);
		l.getPopup().click();
		log.info("close the popup window");
		Search s = new Search(driver);
		s.getSearch().click();
		s.getSearch().sendKeys("chairs");
		s.getSearch().sendKeys(Keys.DOWN);
		s.getSearch().sendKeys(Keys.ENTER);
		log.info("enter the send keys and it show the in search box");
		Thread.sleep(1000l);
		Actions A = new Actions(driver);
		A.moveToElement(s.clickChair());
		A.moveToElement(s.getchairs()).click().build().perform();
		

		System.out.println("Show the all link available in the page : "+driver.findElements(By.tagName("a")).size());
		log.info("here show the available link present in the page");
		System.out.println("Print the price of Mike study chair : "+s.getPrice().getText());
		//s.getAddtocart().click();
		//Assert.assertEquals(s.getTitle().getText(), "Mike study chair");
	}
	/*@AfterTest
	public void closeBrowser()
	{
		driver.close();
		log.info("After complete all process browser is close");
	}*/
}
