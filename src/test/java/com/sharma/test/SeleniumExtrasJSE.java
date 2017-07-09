package com.sharma.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumExtrasJSE {

	WebDriver driver;
	
	@Test
	public void jsExecutor() throws AWTException, InterruptedException{
		
		//script to check the page is loaded completely
		((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");

		System.out.println("System.getProperty('user.dir')::"+System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\workspace\\WebDriver\\resources\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
			driver.get("https://www.walmart.com/");

			//driver.findElement(By.id("global-search-input")).sendKeys("laptop");
			
			WebElement element = (WebElement)((JavascriptExecutor)driver).executeScript("return document.getElementById('global-search-input')");
			 	
			element.sendKeys("Laptop");
			Robot robot = new Robot();
			
			robot.keyPress(KeyEvent.VK_ENTER);
			
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			((JavascriptExecutor)driver).executeScript("return document.getElementsByClassName('.footer-GlobalSocialIcons')");

			//System.out.println(element.get(0).getText());
			
			Thread.sleep(2000);
			((JavascriptExecutor)driver).executeScript("alert('hello')");

			Thread.sleep(900);
			driver.switchTo().alert().accept();
			
			//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,900)");

	}
	
	
}
