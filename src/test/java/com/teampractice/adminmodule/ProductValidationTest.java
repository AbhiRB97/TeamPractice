package com.teampractice.adminmodule;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.teampractice.genericutilities.BaseClass;
import com.teampractice.genericutilities.IConstants;
import com.teampractice.objectrepository.HomeClassPage;
import com.teampractice.objectrepository.ProductDetailsPage;
@Listeners(com.teampractice.genericutilities.ListImpClass.class)
public class ProductValidationTest extends BaseClass {

	@Test
	public void validationTest() throws Throwable 
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(IConstants.implicitlyTimeOut, TimeUnit.SECONDS);
		HomeClassPage hm=new HomeClassPage(driver);
	
		String product = eLib.getExcelData("Sheet1", 1, 1);
		System.out.println(product);
		hm.getSearchTextField().sendKeys(product);
		hm.getSearchBtn().click();
		ProductDetailsPage pp=new ProductDetailsPage(driver);
		pp.getSamsungProduct().click();
		String wID = eLib.getExcelData("Sheet1", 0, 1);
		wLib.swithToWindow(driver, wID);
		pp.getAddCartBtn().click();
		pp.getCartButton().click();
		String expe = pp.getSamsungProduct().getText();
		String actual = pp.getSamsungProduct().getText();
		Assert.assertEquals(expe, actual);




	}

}
