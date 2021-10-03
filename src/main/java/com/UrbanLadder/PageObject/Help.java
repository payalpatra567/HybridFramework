package com.UrbanLadder.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.UrbanLadder.UIStore.GiftcardUI;
import com.UrbanLadder.UIStore.HelpUI;

public class Help {
	private  WebDriver driver;
	HelpUI h = new HelpUI();
	public Help(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getHelp()
	{
		return driver.findElement(h.help);
	}
	public WebElement getIssue()
	{
		return driver.findElement(h.issue);
	}

}
