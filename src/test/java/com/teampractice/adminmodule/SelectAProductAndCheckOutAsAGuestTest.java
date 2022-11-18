package com.teampractice.adminmodule;

import org.testng.annotations.Test;

import com.teampractice.genericutilities.BaseClass;
import com.teampractice.objectrepository.BeautyPage;
import com.teampractice.objectrepository.BodyMakeUpProductsPage;
import com.teampractice.objectrepository.HomeClassPage;
import com.teampractice.objectrepository.MakeUpProductsPage;
import com.teampractice.objectrepository.NARZProductPage;

public class SelectAProductAndCheckOutAsAGuestTest extends BaseClass{

	@Test
	public void checkOutAsGuestTest() {

		HomeClassPage hp = new HomeClassPage(driver);
		hp.getBeautyBtn().click();

		BeautyPage bp = new BeautyPage(driver);
		bp.getMakeupBtn().click();

		MakeUpProductsPage mp = new MakeUpProductsPage(driver);
		mp.getNextSldeBtn().click();;
		mp.getBodyBtn().click();

		BodyMakeUpProductsPage bop = new BodyMakeUpProductsPage(driver);
		bop.getProductBtn().click();

		NARZProductPage np = new NARZProductPage(driver);
		np.getBuyNowBtn().click();
		np.getCheckOutAsGuestBtn().click();

	}

}