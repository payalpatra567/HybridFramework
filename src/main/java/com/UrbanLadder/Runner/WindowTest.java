package com.UrbanLadder.Runner;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.UrbanLadder.PageObject.Window;
import com.UrbanLadder.PageObject.Landingpage;
import com.UrbanLadder.ReusableComponents.reusablecomponent;
import com.UrbanLadder.ReusableComponents.reusablemethod;

public class WindowTest extends  reusablecomponent{
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
	public void Window() throws IOException, InterruptedException {
		Landingpage l = new Landingpage(driver);
		l.getPopup().click();
		log.info("close the pop up window");
		Window a = new Window(driver);
		a.getAnnounce().click();
		Set<String> ids = driver.getWindowHandles();
		Iterator <String> it = ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		//cashBackPage cb = new cashBackPage(driver);
		System.out.println("Moved to child window successfully");
		log.info("Moved to child window successfully");
		driver.switchTo().window(parentId);
		System.out.println("Switched back to parent window");
		log.info("Switched back to parent window");
			}
	@AfterTest
	public void teardown() {
		log.info("close the browser");
		driver.quit();;
		driver = null;
	}
	}


