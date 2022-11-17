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
	@FindBy(xpath = "//input[@class='gh-tb ui-autocomplete-input']") private WebElement searchTextField;
	
	@FindBy(xpath = "//input[@class='btn btn-prim gh-spr']") private WebElement searchBtn;
	


}
