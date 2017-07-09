package com.sharma.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignInTest {

	protected WebDriver driver;

	@Test
	public void fileUploadWithAutoIT() throws InterruptedException, IOException, AWTException{
		
		System.out.println("System.getProperty('user.dir')::"+System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\workspace\\WebDriver\\resources\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
			driver.get("https://www.walmart.com/");

			driver.findElement(By.id("global-search-input")).sendKeys("laptop");
			
			Robot robot = new Robot();
			
			robot.keyPress(KeyEvent.VK_ENTER);
			
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			//driver.close();
			
	}
}
