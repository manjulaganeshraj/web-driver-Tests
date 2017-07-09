package com.sharma.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sharma.base.BaseTest;
import com.sharma.pages.HomePage;
import com.sharma.pages.SearchPage;
import com.sharma.pages.SearchResultsPage;


public class SearchPageTest extends BaseTest {

	HomePage hm;
	
	@Test
	public void searchTest() throws InterruptedException{
		hm = new HomePage(driver);
		SearchPage sp = hm.clickSearchButton();
		SearchResultsPage spr = sp.search();
		Assert.assertEquals("Search results - Kaiser Permanente", spr.searchResultsTitle());
		
		
	}
}
