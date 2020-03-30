package com.amaz.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaz.qa.base.TestBase;
import com.amaz.qa.pages.AddToCartPage;
import com.amaz.qa.pages.HomePage;
import com.amaz.qa.pages.LoginPage;
import com.amaz.qa.pages.SearchPage;
import com.amaz.qa.util.TestUtil;

public class AddToCartPageTest extends TestBase {
      
	HomePage homepage;
	LoginPage loginpage;
	SearchPage searchpage;
	AddToCartPage addtocartpage;
	TestUtil testutil;
	
	public AddToCartPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		homepage=new HomePage();
		loginpage=new LoginPage();
		searchpage=new SearchPage();
		addtocartpage=new AddToCartPage();
		testutil=new TestUtil();
		loginpage=homepage.clickOnSingIn();
		searchpage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		addtocartpage=searchpage.search(prop.getProperty("item"));
		testutil.SwitchingWindow();
	}
//	@Test
//	public void addToCartPageTitleTest() {
//		String title = addtocartpage.addToCartPageTitle();
//	    Assert.assertEquals(title,"Amazon.in: Mobiles","Title is not matched");
//	}
	@Test(priority=1)
	public void clickOnAddToCartTest() {
		addtocartpage.clickOnAddToCart();
		
	}
}
