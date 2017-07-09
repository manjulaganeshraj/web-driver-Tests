package com.sharma.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {
	
	WebDriver driver;
	
	public SearchPage(WebDriver driver){
		this.driver=driver;
	}
	
	public SearchResultsPage search(){
		WebElement selectDropDown = driver.findElement(By.id("site-search-category-select"));
		Select select = new Select(selectDropDown); 
		System.out.println("default selected option: "+select.getFirstSelectedOption().getText()); 
		select.selectByVisibleText("Doctors");
		List<WebElement> options = select.getOptions();
		for(WebElement elm:options){
			System.out.println("option: "+elm.getText());
		}
		
		WebElement element = driver.findElement(By.id("kp-site-search-input"));
		element.sendKeys("Doctors");
		driver.findElement(By.id("kp-site-search-button")).click();
		return new SearchResultsPage(driver);
		
	}

	public String searchPageTitle() {

		return driver.getTitle();
	}
}
