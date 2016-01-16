package com.appium.config;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.appium.page.objects.LoginPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;

public class CommonAppiumTest{
	public  AppiumDriver<MobileElement> driver;
	
	
	public CommonAppiumTest(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}

	public void waitForPageToLoad(MobileElement id) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(id));
	}

	public void waitForElementToDisAppear(String id) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
	}

	public WebElement waitForElement(MobileElement arg) {
		waitForPageToLoad(arg);
		WebElement el = arg;
		return el;
	}

	public void swipeRightUntilTextExists(String expected) {
		do {
			 swipeRight();
		} while (!driver.getPageSource().contains(expected));
	}

	public void swipeLeftUntilTextExists(String expected) {
		do {
			 swipeLeft();
		} while (!driver.getPageSource().contains(expected));
	}
	
	public void swipeRight() {
		Dimension size = driver.manage().window().getSize();
		int startx = (int) (size.width * 0.9);
		int endx = (int) (size.width * 0.20);
		int starty = size.height / 2;
		driver.swipe(startx, starty, endx, starty, 1000);
	}
	
	public void swipeLeft(){
		Dimension size = driver.manage().window().getSize(); 
		int startx = (int) (size.width * 0.8); 
		int endx = (int) (size.width * 0.20); 
		int starty = size.height / 2; 
		driver.swipe(startx, starty, endx, starty, 1000);
	}
	
	
	public void scrollDirection(String Id, SwipeElementDirection arg) {
		MobileElement e = (MobileElement) driver.findElementById(Id);
		e.swipe(arg, 1000);
	}
	

	
}
