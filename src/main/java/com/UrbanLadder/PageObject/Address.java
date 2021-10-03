package com.UrbanLadder.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.UrbanLadder.UIStore.AddressUI;

public class Address {
	AddressUI a = new AddressUI();
	private WebDriver driver;
	public Address(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getaddress()
	{
		return driver.findElement(a.address);
	}
}
