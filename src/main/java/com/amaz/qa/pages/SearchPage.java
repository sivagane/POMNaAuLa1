package com.amaz.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amaz.qa.base.TestBase;

public class SearchPage extends TestBase {

	@FindBy(id="twotabsearchtextbox")
	WebElement SearchField;
	
	@FindBy(xpath="//input[@class='nav-input'and @value='Go']")
	WebElement SearchBtn;
	
	@FindBy(xpath="//img[@src='https://m.media-amazon.com/images/I/5100qjJtveL._AC_UY218_ML3_.jpg']")
	WebElement Mobile;
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String SearchPageGetTitle() {
		return driver.getTitle();
	}
	
	public AddToCartPage search(String item) {
		SearchField.sendKeys(item);
		SearchBtn.click();
		
		Mobile.click();
		
		return new AddToCartPage();
	}
}
