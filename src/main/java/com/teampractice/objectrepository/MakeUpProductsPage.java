package com.teampractice.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeUpProductsPage {
	
	public MakeUpProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(@href,'/Lip-Makeup/')]/div")
	private WebElement lipBtn;

	public WebElement getLipBtn() {
		return lipBtn;
	}

}