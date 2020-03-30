package com.amaz.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amaz.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(id="ap_email")
	WebElement UserName;
	
	@FindBy(id="continue")
	WebElement CtnBtn;
	
	@FindBy(id="ap_password")
	WebElement PassWord;
	
	@FindBy(id="signInSubmit")
	WebElement LogInBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String loginPageGetTitle() {
		return driver.getTitle();
	}
	
	public SearchPage login(String un, String pwd) {
		UserName.sendKeys(un);
		CtnBtn.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		PassWord.sendKeys(pwd);
		LogInBtn.click();
		
		return new SearchPage();
	}
}
