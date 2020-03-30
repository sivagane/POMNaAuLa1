package com.amaz.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amaz.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(id="nav-link-accountList")
	WebElement AboveSignin;
	
    public HomePage() {
    	PageFactory.initElements(driver, this);
    }
   
    public String HomePageTitle() {
    	return driver.getTitle();
    	}
    
    public LoginPage clickOnSingIn() {
    	AboveSignin.click();
    	return new LoginPage();
    }
    }
    
