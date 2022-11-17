package com.teampractice.adminmodule;

import org.testng.Assert;

import com.teampractice.genericutilities.BaseClass;
import com.teampractice.objectrepository.HomeClassPage;
import com.teampractice.objectrepository.ProductDetailsPage;

public class ProductValidationTest extends BaseClass {
	public void validationTest()
	{
		HomeClassPage hm=new HomeClassPage(driver);
		hm.getSearchTextField().sendKeys("watch");
		hm.getSearchBtn().click();
		ProductDetailsPage pp=new ProductDetailsPage(driver);
		pp.getSamsungProduct().click();
		pp.getAddCartBtn().click();
		pp.getCartButton().click();
		String expe = pp.getSamsungProduct().getText();
		String actual = pp.getSamsungProduct().getText();
		Assert.assertEquals(expe, actual);
		
		
		
	}

}
