package com.sharma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver){
	this.driver=driver;	
	}

	public SearchPage clickSearchButton() throws InterruptedException{
		WebElement element = driver.findElement(By.id("site-search-button"));
		Thread.sleep(2000);
		element.click();
		
		return new SearchPage(driver);
	}
	
}
