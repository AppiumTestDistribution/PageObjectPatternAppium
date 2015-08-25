package com.appium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.appium.config.Common;

public class PostPage extends Common {
	By POST_TEXT = By.xpath(".//*[@text='Appium']");
	By DELETE = By.id("org.wordpress.android:id/deletePost");
	By DELETE_CONFIRMATION = By.xpath(".//*[@text='Yes']");

	public boolean verifyPostIsSuccessfull(WebDriver driver) throws InterruptedException {
		Thread.sleep(8000);
		return driver.findElement(POST_TEXT).isDisplayed();

	}

	public PostPage deletePost(WebDriver driver) {
		waitForElement(driver, POST_TEXT).click();
		waitForElement(driver, DELETE).click();
		waitForElement(driver, DELETE_CONFIRMATION);
		return new PostPage();
	}

	public boolean verifyPostIsDeleted(WebDriver driver) {
		return driver.findElements(POST_TEXT).size() == 0;
	}

}
