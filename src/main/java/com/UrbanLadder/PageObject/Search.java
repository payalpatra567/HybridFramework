package com.UrbanLadder.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.UrbanLadder.UIStore.LoginpageUI;
import com.UrbanLadder.UIStore.SearchUI;

public class Search {
	private  WebDriver driver;
	SearchUI s = new SearchUI();
	public Search(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getSearch()
	{
		return driver.findElement(s.Search);
	}
	public WebElement clickChair()
	{
		return driver.findElement(s.chairs);
		
	}
	public WebElement getchairs()
	{
		return driver.findElement(s.Selectchairs);
	}
	public WebElement getPrice() 
	{
		return driver.findElement(s.Search);
	}
	public WebElement getAddtocart()
	{
		return driver.findElement(s.Addtocart);
	}
	public WebElement getTitle()
	{
		return driver.findElement(s.Titel);
	}
	public WebElement getProducts()
	{
		return driver.findElement(s.product);
	}

}
