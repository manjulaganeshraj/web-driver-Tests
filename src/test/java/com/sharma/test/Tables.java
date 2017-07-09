package com.sharma.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tables {

	protected WebDriver driver;

	@Test
	public void hiddenSample() {
		
		System.out.println("System.getProperty('user.dir')::"+System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\workspace\\WebDriver\\resources\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
			driver.get("file:///C:/Users/manju/Desktop/WBLInnovapath/tables.html");
			
			List<WebElement> elements = driver.findElements(By.cssSelector("#mytable>tbody>tr>th"));
			Assert.assertEquals("Company", elements.get(0).getText());
			Assert.assertEquals("Contact", elements.get(1).getText());
			Assert.assertEquals("Country", elements.get(2).getText());
			for(WebElement elm : elements){
				System.out.println(elm.getText());
				Assert.assertNotNull(elm.getText() );
				
			}
			elements = driver.findElements(By.cssSelector("#mytable>tbody>tr>td:nth-of-type(2)"));
			for(WebElement elm : elements){
				System.out.println(elm.getText());
				Assert.assertNotNull(elm.getText() );
				
			}
			
	}
	}
