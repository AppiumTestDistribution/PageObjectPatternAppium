package com.appium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.appium.config.Common;

public class PublishPage extends Common{
	
	public PostPage clickPostPage(WebDriver driver){
		driver.findElement(By.xpath(".//*[@text='Blog Posts']")).click();
		waitForPageToLoad(driver, By.xpath(".//*[@text='Appium']"));
		return new PostPage();		
	}
}
