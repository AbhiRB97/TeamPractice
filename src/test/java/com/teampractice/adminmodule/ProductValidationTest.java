package com.teampractice.adminmodule;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.teampractice.genericutilities.BaseClass;
import com.teampractice.objectrepository.HomeClassPage;
import com.teampractice.objectrepository.ProductDetailsPage;
@Listeners(com.teampractice.genericutilities.ListImpClass.class)
public class ProductValidationTest extends BaseClass {
	@Test
	public void validationTest()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HomeClassPage hm=new HomeClassPage(driver);
		hm.getSearchTextField().sendKeys("samsung watch");
		hm.getSearchBtn().click();
		ProductDetailsPage pp=new ProductDetailsPage(driver);
		pp.getSamsungProduct().click();
		wLib.swithToWindow(driver, "195247859798?epid=4033752973&hash");
		pp.getAddCartBtn().click();
		pp.getCartButton().click();
		String expe = pp.getSamsungProduct().getText();
		String actual = pp.getSamsungProduct().getText();
		Assert.assertEquals(expe, actual);
		
		
		
	}

}
