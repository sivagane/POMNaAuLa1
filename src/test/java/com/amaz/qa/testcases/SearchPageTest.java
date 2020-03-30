package com.amaz.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaz.qa.base.TestBase;
import com.amaz.qa.pages.HomePage;
import com.amaz.qa.pages.LoginPage;
import com.amaz.qa.pages.SearchPage;

public class SearchPageTest extends TestBase {

	HomePage homepage;
	LoginPage loginpage;
    SearchPage searchpage;
    TestBase testbase;
    public SearchPageTest() {
    	super();
    }
	
    @BeforeMethod
    public void setUp() {
    	initialization();
    	homepage=new HomePage();
    	loginpage=new LoginPage();
    	searchpage=new SearchPage();
    	testbase=new TestBase();
    	loginpage=homepage.clickOnSingIn();
    	searchpage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
    	
    }
	//@Test(priority=2)
	//public void searchPageGetTitleTest() {
		//String title = searchpage.SearchPageGetTitle();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Assert.assertEquals(title,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Title is not matching");
	//}
	@Test(priority=1)
	public void searchTest() {
		searchpage.search(prop.getProperty("item"));
	}
	
}
