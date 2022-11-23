package com.teampractice.adminmodule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.teampractice.genericutilities.BaseClass;
import com.teampractice.objectrepository.HomeClassPage;
import com.teampractice.objectrepository.LoginPage;
import com.teampractice.objectrepository.ProductDetailsPage;

@Listeners(com.teampractice.genericutilities.ListImpClass.class)
public class AddToWishListTest extends BaseClass {

	@Test
	public void addToWishListTest() throws Throwable
	{
		//Login to App
		HomeClassPage homePage = new HomeClassPage(driver);
		homePage.getSignInLink().click();
		String emailId = eLib.getExcelData("Sheet1", 1, 1);
		String password = eLib.getExcelData("Sheet1", 1, 2);

		LoginPage loginPage = new LoginPage(driver);
		loginPage.getEmailId().sendKeys(emailId);
		loginPage.getContinueBtn().click();
		Thread.sleep(3000);
		loginPage.getPassword().sendKeys(password);
		loginPage.getSignInBtn().click();

		//Search for Product
		String productName = eLib.getExcelData("Sheet1", 1, 3);
		homePage.getSearchTextField().sendKeys(productName);
		homePage.getSearchBtn().click();

		//Add to WishList
		String partialTitle = eLib.getExcelData("Sheet1", 1, 4);
		String dropDownOption = eLib.getExcelData("Sheet1", 1, 5);

		homePage.getWatch().click();
		wLib.swithToWindow(driver, partialTitle);
		ProductDetailsPage detailsPage = new ProductDetailsPage(driver);
		detailsPage.selectOptionFromColourDropdown(dropDownOption);
		detailsPage.getWishList().click();
	}
}
