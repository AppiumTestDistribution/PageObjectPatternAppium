package com.appium.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {

	public static void waitForPageToLoad(WebDriver driver, By id) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(id));
	}
	
	public static WebElement waitForElement(WebDriver driver,By arg){
		waitForPageToLoad(driver, arg);
		WebElement el = driver.findElement(arg);
		return el;
	}

}
