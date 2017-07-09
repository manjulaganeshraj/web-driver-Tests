package com.sharma.test;

import java.io.IOException;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FileUpload  {

	protected WebDriver driver;
	
	@Test
	public void fileUploadWithAutoIT() throws InterruptedException, IOException{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\manju\\workspace\\WebDriver\\resources\\geckodriver.exe");
		 driver =new FirefoxDriver();
		 
		driver.get("http://monsterindia.com/");

		WebDriverWait wait = new WebDriverWait(driver, 30);

		//wait.until(function);
		
		Thread.sleep(2000);
		
		String currWin = driver.getWindowHandle();
		Set<String> allWins = driver.getWindowHandles();
		
		for(String win : allWins){
			if(!currWin.equals(win)){
				driver.switchTo().window(win).close();
				break;
				
			}
		}
		//Thread.sleep(3000);
		driver.switchTo().window(currWin);
		//Thread.sleep(4000);

		currWin = driver.getWindowHandle();
		allWins = driver.getWindowHandles();
		
		for(String win : allWins){
			if(!currWin.equals(win)){
				driver.switchTo().window(win);
				break;
				
			}
		}
		
		Thread.sleep(20000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fileUpload.btn>span:nth-of-type(1)"))).click();

		//Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wordresume"))).click();

		//Thread.sleep(4000);
		
		Runtime.getRuntime().exec("C:\\Users\\manju\\Desktop\\WBLInnovapath\\AutoIT\\FileUploadAutoIt.exe");
		Thread.sleep(4000);
		
		driver.quit();
	}
	
	/*Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>(){
		
		public Boolean apply(WebDriver arg0){

			String currWin = driver.getWindowHandle();
			Set<String> allWins = driver.getWindowHandles();
			
			for(String win : allWins){
				if(!currWin.equals(win)){
					driver.switchTo().window(win);
					break;
					
				}
		}
			return true;
		}
	};*/
}
