package com.UrbanLadder.Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.UrbanLadder.PageObject.Landingpage;
import com.UrbanLadder.PageObject.Search;
import com.UrbanLadder.ReusableComponents.reusablecomponent;
import com.UrbanLadder.ReusableComponents.reusablemethod;
import com.UrbanLadder.Utility.*;

public class SearchExcelTest extends reusablecomponent {
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
	@Test(dataProvider="getData")
	public void SearchPage(String item) throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		log.info("Url is open");
		Landingpage l = new Landingpage(driver);
		//l.getPopup().click();
		log.info("close the popup window");
		Search s = new Search(driver);
		s.getSearch().click();
		s.getSearch().sendKeys(item);
		s.getSearch().sendKeys(Keys.ENTER);
		//LandingPage2 lp2 = new LandingPage2(driver);
		Thread.sleep(2000L);
		String title = s.getTitle().getText();
		Assert.assertTrue(title.contains(item));
		log.info("Successfully Navigated to "+item+" page");
		System.out.println("print the products available:"+s.getProducts().getText());
	}
	@DataProvider
	public Object[][] getData() {
		Object[][]data = null;
		try {
			data= ExcelReader.readExcel();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		log.info("After complete all process browser is close");
	}
}