package com.teampractice.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeautyPage {
	
	public BeautyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div/a[contains(@href,'/Makeup-Products/')]")
	private WebElement makeupBtn;

	public WebElement getMakeupBtn() {
		return makeupBtn;
	}

}