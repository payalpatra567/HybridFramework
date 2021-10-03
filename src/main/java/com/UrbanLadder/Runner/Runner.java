package com.UrbanLadder.Runner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.UrbanLadder.PageObject.Landingpage;
import com.UrbanLadder.PageObject.LoginPage;
import com.UrbanLadder.ReusableComponents.reusablecomponent;
import com.UrbanLadder.ReusableComponents.reusablemethod;




public class Runner extends reusablecomponent {
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
	public void HomePage() throws IOException, InterruptedException {
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		log.info("Url is open");
		Landingpage l = new Landingpage(driver);
		l.getPopup().click();
		Thread.sleep(9000l);
		l.getLogin1().click();
		log.info(" user click the login icone in that time sign in and sign up");
		l.selectLogin1().click();
		log.info("user click the login buttom");
		Thread.sleep(9000L);
		LoginPage lp = new LoginPage(driver);
		FileInputStream fis = new FileInputStream(".\\data.properties");
		prop.load(fis);
		log.info("enter the email adress and password");
		Thread.sleep(9000L);
		String email = prop.getProperty("emailAddress");
		String password = prop.getProperty("password");
		lp.getEmail().sendKeys(email);
		lp.getPassword().sendKeys(password);
		lp.getLogin().click();
		System.out.println("it is print the in valid text : "+lp.getText().getText());
	}
	
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		log.info("After complete all process browser is close");
	}
	
}
