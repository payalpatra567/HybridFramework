package com.UrbanLadder.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.UrbanLadder.UIStore.GiftcardUI;
import com.UrbanLadder.UIStore.ViewCustomerStoriesUI;

public class Viewcustomer {
	private  WebDriver driver;
	ViewCustomerStoriesUI v = new ViewCustomerStoriesUI();
	public Viewcustomer(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getViewCustomer()
	{
		return driver.findElement(v.View);
	}
	public WebElement getViewCustomerreview()
	{
		return driver.findElement(v.review);
	}

}
