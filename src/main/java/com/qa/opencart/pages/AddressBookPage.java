package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtil;

public class AddressBookPage {

	private WebDriver driver;
	private ElementUtil eleUtil;
	
	private By newAddressBtn = By.linkText("New Address");
	
	
	public AddressBookPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	public AddAddressPage clickNewAddressBtn() {
		eleUtil.doClickWithVisibleElement(newAddressBtn, 5);
		return new AddAddressPage(driver);
	}
	
	
}
