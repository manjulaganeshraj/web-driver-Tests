package com.sharma.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class BrowserNotification_Alerts {

	WebDriver driver;

	@Test
	public void browserAlert() throws InterruptedException {
		
		/*System.out.println("System.getProperty('user.dir')::"+System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\workspace\\WebDriver\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(options);
				
		driver.get("https://www.myntra.com/");
		*/
		System.setProperty("webdriver.gecko.driver","C:\\Users\\manju\\workspace\\WebDriver\\resources\\geckodriver.exe");
		 
		 FirefoxProfile profile = new FirefoxProfile();
		 
		 profile.setPreference("dom.disable_beforeunload", true);
		 
		 driver = new FirefoxDriver(profile);
		 
			driver.get("https://www.myntra.com/");

	}
}
