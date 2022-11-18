package com.teampractice.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeUpProductsPage {
	
	public MakeUpProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h2[text()='Shop by Category']/ancestor::div[@class='b-carousel__header ']/following-sibling::div//button[@aria-label='Next Slide']")
	private WebElement nextSldeBtn;
	
	@FindBy(xpath = "//a[contains(@href,'/Body-Makeup-Products/')]/div")
	private WebElement bodyBtn;

	public WebElement getNextSldeBtn() {
		return nextSldeBtn;
	}

	public WebElement getBodyBtn() {
		return bodyBtn;
	}

}