package com.UrbanLadder.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.UrbanLadder.UIStore.LandingpageUIStore;
import com.UrbanLadder.UIStore.LoginpageUI;

public class LoginPage {
	private  WebDriver driver;
	LoginpageUI l = new LoginpageUI();
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getEmail() {
		return driver.findElement(l.email);
	}

	public WebElement getPassword() {
		return driver.findElement(l.password);
	}

	public WebElement getLogin() {
		return driver.findElement(l.login);
	}
	public WebElement getText()
	{
		return driver.findElement(l.text);
	}
}
