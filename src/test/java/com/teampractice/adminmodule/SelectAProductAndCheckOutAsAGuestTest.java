package com.teampractice.adminmodule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.teampractice.genericutilities.BaseClass;
import com.teampractice.objectrepository.BeautyPage;
import com.teampractice.objectrepository.HomeClassPage;
import com.teampractice.objectrepository.LipMakeUpProductsPage;
import com.teampractice.objectrepository.MakeUpProductsPage;
import com.teampractice.objectrepository.MerrezcaProductPage;

@Listeners(com.teampractice.genericutilities.ListImpClass.class)
public class SelectAProductAndCheckOutAsAGuestTest extends BaseClass{

	@Test
	public void checkOutAsGuestTest() {

		HomeClassPage hp = new HomeClassPage(driver);
		hp.getBeautyBtn().click();

		BeautyPage bp = new BeautyPage(driver);
		bp.getMakeupBtn().click();

		MakeUpProductsPage mp = new MakeUpProductsPage(driver);
		mp.getLipBtn().click();

		LipMakeUpProductsPage lp = new LipMakeUpProductsPage(driver);
		lp.getProductBtn().click();

		wLib.switchToWindow(driver);

		MerrezcaProductPage np = new MerrezcaProductPage(driver);
		np.getBuyNowBtn().click();
		np.getCheckOutAsGuestBtn().click();

	}

}