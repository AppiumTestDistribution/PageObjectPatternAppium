package com.appium.config;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public abstract class CommonAppiumTest {
	public static AppiumDriver<MobileElement> driver;

	public CommonAppiumTest(AppiumDriver<MobileElement> driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void loadPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public static void waitForPageToLoad(MobileElement id) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(id));
	}

	public static WebElement waitForElement(MobileElement arg) {
		waitForPageToLoad(arg);
		WebElement el = arg;
		return el;
	}
}
