package com.UrbanLadder.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.UrbanLadder.UIStore.StoreUI;
import com.UrbanLadder.UIStore.TrackorderUI;

public class TrackOrder {
	private  WebDriver driver;
	TrackorderUI t = new TrackorderUI();
	public TrackOrder(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getTrackorder()
	{
		return driver.findElement(t.trackorder);
	}
	public WebElement getOrderNo( ) {
		return driver.findElement(t.orderNo);
	}
	
	public WebElement getPhoneNo() {
		return driver.findElement(t.phoneNo);
	}
	public WebElement getSubmit()
	{
		return driver.findElement(t.submit);
	}
}
