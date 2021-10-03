package com.UrbanLadder.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.UrbanLadder.UIStore.FooterUI;

public class Footer {
	FooterUI f = new FooterUI();
	private WebDriver driver;
	public Footer(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement clickPress()
	{
		return driver.findElement(f.press);
	}
	public WebElement getText()
	{
		return driver.findElement(f.cnbc);
	}
	public WebElement getndtv()
	{
		return driver.findElement(f.ndtv);
	}
	public WebElement getcnbc()
	{
		return driver.findElement(f.cnbc1);
	}
	public WebElement getNews()
	{
		return driver.findElement(f.news);
	}
}
