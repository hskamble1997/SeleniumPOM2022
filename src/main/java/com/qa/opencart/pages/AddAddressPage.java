package com.qa.opencart.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtil;

import io.qameta.allure.Step;

public class AddAddressPage {


	private WebDriver driver;
	private ElementUtil eleUtil;
	
	
	private By firstName = By.id("input-firstname");
	private By lastName = By.id("input-lastname");
	private By add1 = By.id("input-address-1");
	private By city = By.id("input-city");
	private By postCode = By.id("input-postcode");
	private By countryDropDown = By.id("input-country");
	private By regionStateDropDown = By.id("input-zone");
	private By radioBtnYes = By.xpath("//input[@type= 'radio' and @value =1]");
	private By contiBtn = By.xpath("//input[@type= 'submit' and @value ='Continue']");
	private By successMsg = By.cssSelector("div.alert-success");
	
	private static final Logger LOG = Logger.getLogger(AddAddressPage.class);
	
	public AddAddressPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	@Step("add address on add address page firstname : {0} and lastname : {1} and address : {2} and City : {3} and postalCode : {4} and Nation : {5} and State : {6}......")
	public String addAddress(String fname, String lname, String addr1, String citi,String postalCode,String nation,String state) {
		eleUtil.doSendKeysWithVisibleElement(firstName, 5, fname);
		eleUtil.doSendKeys(lastName, lname);
		eleUtil.doSendKeys(add1, addr1);
		eleUtil.doSendKeys(city, citi);
		eleUtil.doSendKeys(postCode, postalCode);
		eleUtil.doSelectDropDownByVisibleText(countryDropDown, nation);
		eleUtil.doSelectDropDownByVisibleText(regionStateDropDown, state);
		eleUtil.doClick(radioBtnYes);
		eleUtil.doClick(contiBtn);
		String SuccessMsg = eleUtil.getElementTextWithVisibleElement(successMsg, 5);
		return SuccessMsg;
	}
	
	
}
