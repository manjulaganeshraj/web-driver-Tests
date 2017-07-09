package com.sharma.test;

import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.sharma.base.BaseTest;

@Test
public class AmazonHomePageTest extends BaseTest {

	public void signInTest (){
		
		System.out.println("Home page Title "+driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.cssSelector("#nav-link-accountList>span:nth-of-type(2)"));
		
				element.click();
		
		System.out.println("sign in page title "+driver.getTitle() );
		
	}
	
	//mouse actions
	
	public void tryPrimeTest(){
		
		System.out.println("Home page title "+driver.getTitle());
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.cssSelector("#nav-link-prime .nav-line-2"));
		Actions action = new Actions(driver);
		
		action.moveToElement(element).perform();  //do your mouse hover action
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".prime-button-try>a")));
		
		element.click();
		
		System.out.println("Prime page title "+driver.getTitle());
	}
	
	public void searchBoxTest(){
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
		
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(5, TimeUnit.SECONDS).withTimeout(30, TimeUnit.SECONDS);
		//wait.ignoring(NoSuchElementException.class);
		
		/* sent to function interface below
		List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#suggestions div")));
		//List<WebElement> elements = driver.findElements(By.cssSelector("#suggestions div"));
		
		System.out.println("list size: "+elements.size());
		for(WebElement elm: elements){
			System.out.println(elm.getText());
		}*/		
		
		WebElement elm = wait.until(function);
		System.out.println("element selected "+elm.getText());
		
		elm.click();
		System.out.println("Search results page "+driver.getTitle());
		
	}
	
	Function<WebDriver, WebElement> function = new Function<WebDriver,WebElement>(){
	
	//@Override
	public WebElement apply(WebDriver arg0){
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#suggestions div")));
		System.out.println("list size: "+elements.size());
		
		WebElement elm1 = null;
		for(WebElement elm: elements){
			elm1 = elm;
			System.out.println(elm.getText());
			if(elm.getText().equals("watch box")){
				elm1=elm;
				break;
			}
		}
		return elm1;
		
	}
	};

}
