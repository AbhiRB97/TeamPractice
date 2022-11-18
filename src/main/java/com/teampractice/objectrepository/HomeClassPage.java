package com.teampractice.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeClassPage {
	public HomeClassPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//input[@class='gh-tb ui-autocomplete-input']") 
	private WebElement searchTextField;
	
	@FindBy(xpath = "//input[@class='btn btn-prim gh-spr']") 
	private WebElement searchBtn;
	
	@FindBy(xpath = "//a[contains(@href,'/Beauty/')]/div[@class='hl-popular-destinations-image-spacer']")
	private WebElement beautyBtn;

	public WebElement getBeautyBtn() {
		return beautyBtn;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

}
