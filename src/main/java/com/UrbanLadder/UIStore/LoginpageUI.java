package com.UrbanLadder.UIStore;

import org.openqa.selenium.By;

public class LoginpageUI {
	public By email = By.xpath("//input[@placeholder='Email Address'][1]");
	public By password = By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/div/div/div/input");
	public By login = By.xpath("//*[@value='Log In']");
	public By text = By.xpath("//*[@id=\"existing-customer\"]/div/div");


}
