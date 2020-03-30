package com.amaz.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaz.qa.base.TestBase;
import com.amaz.qa.pages.HomePage;

public class HomePageTest extends TestBase {

	HomePage homepage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homepage=new HomePage();
		}
	
	@Test
	public void HomePageTitleTest() {
	String title = homepage.HomePageTitle();
	Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Title not matcching");
	}
	
	@Test
	public void clickOnSignInTest() {
		homepage.clickOnSingIn();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
