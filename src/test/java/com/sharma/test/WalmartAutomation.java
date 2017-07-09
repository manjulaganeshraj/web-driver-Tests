package com.sharma.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WalmartAutomation {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\workspace\\WebDriver-April-Medha\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//open the browser with sp url
	driver.get("https://www.walmart.com/");
	System.out.println("MainPage::"+driver.getTitle());
	//find the element.inspect search box
	By by = By.id("global-search-input");     // will take string parameter .identify the element 
	WebElement element = driver.findElement(by);
	
	//perform the action. sendkeys allows you to input the text into text box or text area(not for link click)
	element.sendKeys("Laptop");
	//assert for the results
	driver.findElement(By.cssSelector(".header-GlobalSearch-submit.btn"));
	element.click();                         //click on the search button
	System.out.println("Result::"+driver.getTitle());
	driver.close();
}
}
