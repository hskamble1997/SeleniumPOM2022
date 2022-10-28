package com.qa.opencart.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtil;

import io.qameta.allure.Step;

public class AddressBookPage {

	private WebDriver driver;
	private ElementUtil eleUtil;
	
	private By newAddressBtn = By.linkText("New Address");
	
	private static final Logger LOG = Logger.getLogger(AddressBookPage.class);
	
	public AddressBookPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	@Step("Click on new address button on address book page......")
	public AddAddressPage clickNewAddressBtn() {
		eleUtil.doClickWithVisibleElement(newAddressBtn, 5);
		return new AddAddressPage(driver);
	}
	
	
}
