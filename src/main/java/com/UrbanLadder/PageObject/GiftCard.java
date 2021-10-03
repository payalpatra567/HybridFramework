package com.UrbanLadder.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.UrbanLadder.UIStore.GiftcardUI;
import com.UrbanLadder.UIStore.LandingpageUIStore;

public class GiftCard {
	private  WebDriver driver;
	GiftcardUI g = new GiftcardUI();
	public GiftCard(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getGiftcard() {
		return driver.findElement(g.Giftcard);
	}
	public WebElement getweddingcard()
	{
		return driver.findElement(g.wedding);
	}
	public WebElement Selectwedingcard()
	{
		return driver.findElement(g.selectweddingcard);
	}
	public WebElement getPrice()
	{
		return driver.findElement(g.price);
	}
	public WebElement clickNext()
	{
		return driver.findElement(g.next);
	}
	public WebElement getRecipientname()
	{
		return driver.findElement(g.recipient_name);
	}
	public WebElement getRecipientEmail()
	{
		return driver.findElement(g.recipient_email);
	}
	public WebElement getYourname()
	{
		return driver.findElement(g.Your_name);
	}
	public WebElement getYouremail()
	{
		return driver.findElement(g.your_email);
	}
	public WebElement getYournumber()
	{
		return driver.findElement(g.Your_number);
	}
	public WebElement getYourmessage()
	{
		return driver.findElement(g.message);
	}
	public WebElement getconfirm()
	{
		return driver.findElement(g.confirm);
	}
}
