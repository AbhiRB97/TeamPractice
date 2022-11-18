package com.teampractice.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NARZProductPage {
	
	public NARZProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Buy It Now']")
	private WebElement buyNowBtn;
	
	@FindBy(xpath = "//span[text()='Check out as guest']")
	private WebElement checkOutAsGuestBtn;

	public WebElement getBuyNowBtn() {
		return buyNowBtn;
	}

	public WebElement getCheckOutAsGuestBtn() {
		return checkOutAsGuestBtn;
	}

}