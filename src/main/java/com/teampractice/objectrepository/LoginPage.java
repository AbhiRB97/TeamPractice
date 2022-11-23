package com.teampractice.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "userid") private WebElement emailId;
	@FindBy(id = "signin-continue-btn") private WebElement continueBtn;
	@FindBy(id = "pass") private WebElement password;
	@FindBy(id = "sgnBt") private WebElement signInBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}
		
}
