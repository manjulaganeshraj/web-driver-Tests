package com.sharma.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PopUps {

	protected WebDriver driver;

	@Test
	public void popUpSample() throws InterruptedException {
		
		System.out.println("System.getProperty('user.dir')::"+System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\workspace\\WebDriver\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.softwaretestinghelp.com/"); 


		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#om-lightbox-coupon-optin-email")));
		element.sendKeys("sdfkn@jds.com");
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title='Close']")));
		element.click();
		
		
		driver.close();
		
	}

}
