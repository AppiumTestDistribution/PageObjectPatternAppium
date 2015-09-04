package com.appium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.appium.config.AppiumTestBase;
import com.appium.config.Common;

public class LoginPage extends Common {
	
	By WELCOME_PAGE=By.id("org.wordpress.android:id/switch_site");

	public static LoginPage enterValidCredentails(WebDriver driver) {
		System.out.println(AppiumTestBase.prop.getProperty("USERNAME"));
		System.out.println(AppiumTestBase.prop.getProperty("PASSWORD"));
		waitForPageToLoad(driver, By.id(AppiumTestBase.prop.getProperty("USERNAME")));
		driver.findElement(By.id(AppiumTestBase.prop.getProperty("USERNAME"))).sendKeys("vodqa@gmail.com");
		driver.findElement(By.id(AppiumTestBase.prop.getProperty("PASSWORD"))).sendKeys("Hello12345678");
		driver.findElement(By.name("Sign in")).click();
		return new LoginPage();
	}
	
	public WelcomePage waitForWelcomePage(WebDriver driver) {
		waitForPageToLoad(driver,WELCOME_PAGE);
		return new WelcomePage();

	}

}
