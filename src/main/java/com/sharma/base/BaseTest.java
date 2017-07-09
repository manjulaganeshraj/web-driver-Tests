package com.sharma.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("System.getProperty('user.dir')::"+System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\workspace\\WebDriver\\resources\\chromedriver.exe");
		 driver = new ChromeDriver();
		// driver.get("https://healthy.kaiserpermanente.org/");
		 //driver.get("https://www.amazon.com/");
		
	/*	*/
		 
	}

	@AfterClass
	public void afterClass(){
		driver.close();
	}
}
