package com.UrbanLadder.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.UrbanLadder.UIStore.AddressUI;
import com.UrbanLadder.UIStore.WindowUI;

public class Window {
	WindowUI a = new WindowUI();
	private WebDriver driver;
	public Window(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getAnnounce()
	{
		return driver.findElement(a.knowmore);
	}
	
	public WebElement getPageText() {
		return driver.findElement(a.jioText);
	}

}
