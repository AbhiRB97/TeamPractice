package com.teampractice.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LipMakeUpProductsPage {
	
	public LipMakeUpProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h3[text()='Merrezca Dranatic Lip Color #SM03 3.5 g']/parent::a")
	private WebElement productBtn;

	public WebElement getProductBtn() {
		return productBtn;
	}
		
}