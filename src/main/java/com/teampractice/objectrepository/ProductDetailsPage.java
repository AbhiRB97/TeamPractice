package com.teampractice.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {

	@FindBy(xpath = "//select[@class='x-msku__select-box']") private WebElement colourDropDown;
	@FindBy(xpath = "//span[@class='add-to-watch-list']") private WebElement addToWishList;
	@FindBy(xpath = "//span[text()='Samsung Galaxy Watch Active 2 R835 40MM Stainless Brown Leather. Excellent']") private WebElement samsungProduct;
	
	
	
	public WebElement getSamsungProduct() {
		return samsungProduct;
	}

	public WebElement getAddCartBtn() {
		return addCartBtn;
	}

	public WebElement getCartButton() {
		return cartButton;
	}

	@FindBy(xpath = "//span[text()='Add to cart']") private WebElement addCartBtn;
	@FindBy(xpath = "//*[name()='svg' and @class='gh-cart-icon']") private WebElement cartButton;
	
	public ProductDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getColourDropDown() {
		return colourDropDown;
	}

	public WebElement getAddToWishList() {
		return addToWishList;
	}
	
	
}
