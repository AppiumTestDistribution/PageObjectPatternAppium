package com.appium.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public abstract class CommonAppiumTest{
	protected AppiumDriver<MobileElement> driver;
	public CommonAppiumTest(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}

	public  void waitForPageToLoad(MobileElement id) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(id));
	}
	
	public  void waitForElementToDisAppear(String id){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
	}

	public  WebElement waitForElement(MobileElement arg) {
		waitForPageToLoad(arg);
		WebElement el = arg;
		return el;
	}
}
