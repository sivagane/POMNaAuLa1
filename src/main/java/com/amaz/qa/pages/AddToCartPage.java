package com.amaz.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amaz.qa.base.TestBase;

public class AddToCartPage extends TestBase {

	@FindBy(id="add-to-cart-button")
	WebElement AddToCartBtn;
	
	@FindBy(id="buybox-see-all-buying-choices-announce")
	WebElement BuyingOptions;
	
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String addToCartPageTitle() {
		return driver.getTitle();
	}
	
	public void clickOnAddToCart() {
		BuyingOptions.click();
		
	}
}
