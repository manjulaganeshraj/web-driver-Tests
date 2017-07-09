package com.sharma.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.phantomjs.PhantomJSDriver;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.sharma.base.BaseTest;
import com.sharma.pages.HomePage;
import com.sharma.pages.SearchPage;

public class HomePageTest2 extends BaseTest {
	
	HomePage hm;
	
	@Test(enabled=false)
	public void clickSearchButtonTest() throws InterruptedException{
		hm = new HomePage(driver);
		SearchPage sp = hm.clickSearchButton();
		
		Assert.assertEquals("Custom care & coverage just for you - Kaiser Permanente", sp.searchPageTitle());
	}
	
	@Test(enabled=false)
	public void HtmlUnitDriver() throws InterruptedException{
		WebDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
		
		hm = new HomePage(driver);
		driver.get("https://www.google.com");
		System.out.println("title"+driver.getTitle());
		
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);

		System.out.println("title"+driver.getTitle());
		
	
	}

	@Test
	public void PhantomJSDriver() throws InterruptedException{
		
		System.setProperty("phantomjs.binary.path", "C:\\Users\\manju\\workspace\\WebDriver-MayJune\\resources\\phantomjs.exe");

		WebDriver driver = new PhantomJSDriver();
		hm = new HomePage(driver);
		driver.get("https://www.google.com");
		System.out.println("title"+driver.getTitle());
		
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);

		System.out.println("title"+driver.getTitle());
		
	
	}
}
