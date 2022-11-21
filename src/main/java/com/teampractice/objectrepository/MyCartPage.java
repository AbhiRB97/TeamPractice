package com.teampractice.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyCartPage {
	
	public MyCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
