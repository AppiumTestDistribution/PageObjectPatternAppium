package com.appium.pages;

import org.openqa.selenium.By;

import com.appium.config.AppiumTestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PublishPage extends AppiumTestBase {

	public PublishPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		loadPage();
		// TODO Auto-generated constructor stub
	}

	@AndroidFindBy(xpath = ".//*[@text='Appium']")
	MobileElement text_added;

	public PostPage clickPostPage(AppiumDriver<MobileElement> driver) {
		driver.findElement(By.xpath(".//*[@text='Blog Posts']")).click();
		waitForPageToLoad(driver, text_added);
		return new PostPage(driver);
	}
}
