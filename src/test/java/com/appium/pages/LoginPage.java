package com.appium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.appium.config.Common;

public class LoginPage extends Common {
	By WELCOME_PAGE=By.id("org.wordpress.android:id/switch_site");
	
	public static LoginPage enterValidCredentails(WebDriver driver,String USERNAME,String PASSWORD) {
		waitForPageToLoad(driver, By.id(USERNAME));
		driver.findElement(By.id(USERNAME)).sendKeys("vodqa@gmail.com");
		driver.findElement(By.id(PASSWORD)).sendKeys("Hello12345678");
		driver.findElement(By.name("Sign in")).click();
		return new LoginPage();
	}
	
	public WelcomePage waitForWelcomePage(WebDriver driver) {
		waitForPageToLoad(driver,WELCOME_PAGE);
		return new WelcomePage();

	}

}
