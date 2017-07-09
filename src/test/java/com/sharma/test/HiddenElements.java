package com.sharma.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HiddenElements {

	protected WebDriver driver;

	@Test
	public void hiddenSample() {
		
		System.out.println("System.getProperty('user.dir')::"+System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\workspace\\WebDriver\\resources\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
			driver.get("file:///C:/Users/manju/Desktop/WBLInnovapath/hiddenSample.html");
			
			WebElement element = driver.findElement(By.id("myInputHidden"));
			System.out.println("is hidden or not: "+element.isDisplayed());
			Assert.assertFalse(element.isDisplayed());
			Point point =  element.getLocation();
			Assert.assertTrue(point.x==0);
			System.out.println("Location for hidden: "+point.x);
			
			element = driver.findElement(By.id("myInput"));
			System.out.println("is hidden or not: "+element.isDisplayed());
			Assert.assertTrue(element.isDisplayed());
			point = element.getLocation();
			Assert.assertTrue(point.x!=0);
			System.out.println("Location for non-hidden: "+point.x);
			

	
	
	}
}
