package com.sharma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sharma.base.BaseTest;

public class SearchResultsPage  {

WebDriver driver;
	
	public SearchResultsPage(WebDriver driver){
		this.driver=driver;
	}
	
	public String searchResultsTitle(){
		return driver.getTitle();
	}
	
	public String searchResultsMessage(){
		WebElement element = driver.findElement(By.className("searchResultTotalMessage"));
		return element.getText();
		
	}
}
