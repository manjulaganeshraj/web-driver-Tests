package com.sharma.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstWebDriverTest {

	@Test
	public void loginTest(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\workspace\\WebDriver\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	/*	System.setProperty("webdriver.gecko.driver", "C:\\Users\\manju\\workspace\\WebDriver\\resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		driver.get("http://www.whiteboxqa.com");
		WebElement element = driver.findElement(By.id("loginButton"));
		element.click();
		driver.getTitle();
		
		//get actual
		String actual = driver.getTitle();
		//Assert.assertEquals(actual, "QA/QE/SDET Training");
		
		List<WebElement> elements = driver.findElements(By.cssSelector("li[class*='nav-item']"));
		Assert.assertEquals(elements.size(), 8);
		
		driver.close();
	}
}
