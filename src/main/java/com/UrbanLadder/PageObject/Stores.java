package com.UrbanLadder.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.UrbanLadder.UIStore.SearchUI;
import com.UrbanLadder.UIStore.StoreUI;

public class Stores {
	private  WebDriver driver;
	StoreUI s = new StoreUI();
	public Stores(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getStoreDetails() {
		return driver.findElement(s.viewDetails);
	}
	
	public WebElement getTitle() {
		return driver.findElement(s.text);
	}
	public WebElement getStores() {
		// TODO Auto-generated method stub
		return driver.findElement(s.stores);
	}
}
