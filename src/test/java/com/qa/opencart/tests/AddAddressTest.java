package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstants;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Epic - 301: Open cart application Add address page design")
@Story("US - 302: Create Add address page features")
public class AddAddressTest extends BaseTest {
	
	@BeforeClass
	public void accSetup() {
		accPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {
			{"Romania","Reigns","JCB Palace","Reno","89501","India","Bihar",}
		};
	}
	
	@Description("add address page Test -- Dev Name: @hsk")
	@Severity(SeverityLevel.CRITICAL)
	@Test(dataProvider = "getData", priority = 1)
	public void changeAddressTest(String fname, String lname, String addr1,String city,String zip,String country,String state) {
		addressBookPage = accPage.clickAddressBook();
		addAddressPage = addressBookPage.clickNewAddressBtn();
		String actText = addAddressPage.addAddress(fname,lname,addr1,city,zip,country,state);
		Assert.assertEquals(actText, AppConstants.ADDRESS_UPDATE_SUCCESS_MSG);
	}
	
	
	
	
	
	
	
}
