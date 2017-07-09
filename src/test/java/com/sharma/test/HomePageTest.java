package com.sharma.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sharma.base.BaseTest;
import com.sharma.pages.HomePage;
import com.sharma.pages.SearchPage;

public class HomePageTest extends BaseTest {
	
	HomePage hm;
	
	@Test
	public void clickSearchButtonTest() throws InterruptedException{
		hm = new HomePage(driver);
		SearchPage sp = hm.clickSearchButton();
		
		Assert.assertEquals("Custom care & coverage just for you - Kaiser Permanente", sp.searchPageTitle());
	}

}
