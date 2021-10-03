package com.UrbanLadder.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.UrbanLadder.UIStore.GiftcardUI;
import com.UrbanLadder.UIStore.NavigationUI;

public class Navigationbar {
	private  WebDriver driver;
	NavigationUI n = new NavigationUI();
	public Navigationbar(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getBedroom()
	{
		return driver.findElement(n.BedRoom);
	}
	public WebElement getBed()
	{
		return driver.findElement(n.Beds);
	}
	/*public WebElement	getDoublebed()
	{
		return driver.findElement(n.DoubleBed);
	}*/
}
