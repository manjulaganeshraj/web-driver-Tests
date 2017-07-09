package com.sharma.test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sharma.base.BaseTest;
public class DragAndDrop extends BaseTest {

	@Test(enabled=false)
	public void dragAndDropActions() throws InterruptedException {
		driver.get("http://code.makery.ch/library/dart-drag-and-drop/");
		Actions action = new Actions(driver);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(1);
		
		List<WebElement> elements = driver.findElements(By.cssSelector(".document"));
		System .out.println("Size before drag and drop:"+elements.size());
		
		WebElement element =  driver.findElement(By.cssSelector(".document:nth-of-type(1)"));
		
		WebElement to = driver.findElement(By.cssSelector(".trash"));
		
		//action.dragAndDrop(element, to).perform();
		
		action.clickAndHold(element).moveToElement(to).release().build().perform();
		
		 elements = driver.findElements(By.cssSelector(".document"));
		
		 System.out.println("Size after drag and drop:"+elements.size());
		 
		 Thread.sleep(2000);

		 driver.switchTo().parentFrame();

		 action.contextClick(driver.findElement(By.cssSelector(".main-link")));
		 
		 Thread.sleep(2000);
		 
	}

	@Test(enabled=false)
	public void navigate() throws InterruptedException{
		
		driver.get("http://whiteboxqa.com/");
		
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);

		driver.navigate().to("https://talentscreen.io/#website-pages/home");
		
		
	}
	
	@Test(enabled=false)
	public void webElementMethods() throws InterruptedException{
		
		driver.get("https://www.walmart.com/");
		
		WebElement element = driver.findElement(By.id("global-search-input"));

		Assert.assertEquals("Search", element.getAttribute("placeholder"));
		Assert.assertEquals("query", element.getAttribute("name"));
		
		System.out.println("radius: "+element.getCssValue("border-radius"));
		System.out.println("Font size: "+element.getCssValue("font-size"));
		
		Assert.assertTrue(element.isDisplayed());
		System.out.println("enabled:"+element.isEnabled());
		
		//check boxes, radio buttons, drop downs
		//element.isEnabled();
		
		Dimension dim = element.getSize();
		System.out.println("Height: "+dim.height);
		System.out.println("Width: "+dim.width);
		
		Point point = element.getLocation();
		System.out.println("x:"+point.x);
		System.out.println("y:"+point.y);
		
	}
	
	@Test
	public void handleCookies(){
		
		driver.get("https://www.walmart.com/");

		Set<Cookie> cookies = driver.manage().getCookies();
		for(Cookie cookie: cookies){
			System.out.println(cookie.getName());
		}
		Cookie cookie = new Cookie("NewOne","somevalue");
		System.out.println("*****************");
		
		driver.manage().addCookie(cookie);
		
		cookies = driver.manage().getCookies();
		for(Cookie cooki: cookies){
			System.out.println(cooki.getName());
		}
		System.out.println("Before Size "+cookies.size());
		driver.manage().deleteCookieNamed("NewOne");
		cookies = driver.manage().getCookies();

		System.out.println("After size "+cookies.size());
	}
}