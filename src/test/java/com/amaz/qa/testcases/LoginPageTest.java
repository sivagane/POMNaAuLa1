package com.amaz.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaz.qa.base.TestBase;
import com.amaz.qa.pages.HomePage;
import com.amaz.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	HomePage homepage;
	LoginPage loginpage;
	
	public LoginPageTest() {
			super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homepage=new HomePage();
		loginpage=new LoginPage();
		loginpage=homepage.clickOnSingIn();
	}
	@Test
	public void loginPageGetTitleTest() {
		String title = loginpage.loginPageGetTitle();
		Assert.assertEquals(title, "Amazon Sign In", "Title is not matching");
	}
	@Test
	public void loginTest() {
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
