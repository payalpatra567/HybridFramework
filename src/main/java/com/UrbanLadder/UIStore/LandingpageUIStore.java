package com.UrbanLadder.UIStore;

import org.openqa.selenium.By;

public class LandingpageUIStore {
	public By Pop_up = By.xpath("//a[@data-gaaction=\"popup.auth.close\"]");
	public By login = By.cssSelector("#header > div.header__topBar > div > section.header__topBar_sectionRight > ul > li.header__topBarIconList_profile-icon > span > svg");
	public By selectLogin = By.cssSelector("#header > div.header__topBar > div > section.header__topBar_sectionRight > ul > li.header__topBarIconList_profile-icon > span > ul > li:nth-child(1) > a");
	public By stories = By.cssSelector("#home > div.container > div.footer_wrapper.row.clearfix > div.center.testimonial-module > div.text-center.view-all > a");
	public By email = By.xpath("//input[@id='email_id']");
	public By subscribe = By.xpath("//input[@value='SUBSCRIBE']");
}

