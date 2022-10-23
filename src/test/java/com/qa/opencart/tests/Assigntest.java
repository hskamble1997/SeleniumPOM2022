package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstants;

public class Assigntest extends BaseTest{

	@BeforeClass
	public void accPageSetup() {
		accPage = loginPage.doLogin("harshal@yopmail.com", "1234567a");
	}
	
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {
			{"nikon", "Nikon D300","Rohit Testnine","computerised lens repairing nikon sales and repairs"},
						
		};
		
	}
	
	@Test(dataProvider="getData")
	public void giveReviewTest(String searchKey, String mainProduct, String name, String reviewMsg) {
		
		searchResultsPage = accPage.performSearch(searchKey);
		productInfoPage = searchResultsPage.selectProduct(mainProduct);
		String actMsg = productInfoPage.sendReview(name, reviewMsg);
		Assert.assertEquals(actMsg, AppConstants.REVIEW_SUCCESS_MSG);
	}

}
