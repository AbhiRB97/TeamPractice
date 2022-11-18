package com.teampractice.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BodyMakeUpProductsPage {
	
	public BodyMakeUpProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h3[text()='NARS Liquid Body Tint LAGUNA 3.8 OZ/100 ML NEW IN BOX!']/parent::a")
	private WebElement productBtn;

	public WebElement getProductBtn() {
		return productBtn;
	}
		
}