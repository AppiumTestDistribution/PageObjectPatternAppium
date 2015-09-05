package com.appium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.appium.config.AppiumTestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class WelcomePage extends AppiumTestBase {

	public WelcomePage(AppiumDriver<MobileElement> driver) {
		super(driver);
		loadPage();
	}

	@AndroidFindBy(id="org.wordpress.android:id/fab_button")
	MobileElement WRITE_POST;
	@AndroidFindBy(id="org.wordpress.android:id/post_title")
	MobileElement TITLE;
	
	@AndroidFindBy(id="org.wordpress.android:id/post_title")
	MobileElement POST_CONTENT;
	
	@AndroidFindBy(id="org.wordpress.android:id/menu_save_post")
	MobileElement PUBLISH;

	public WelcomePage writePost(AppiumDriver<MobileElement> driver) {
		WRITE_POST.click();
		return new WelcomePage(driver);
	}

	public PublishPage writeContentAndPublish(AppiumDriver<MobileElement> driver) {
		waitForPageToLoad(driver, TITLE);
		TITLE.sendKeys("Appium");
		POST_CONTENT.sendKeys("Appium Rocks!!!!");
		driver.navigate().back();
		waitForPageToLoad(driver, PUBLISH);
		PUBLISH.click();
		return new PublishPage(driver);
	}

	public PostPage clickPostPage(AppiumDriver<MobileElement> driver) {
		driver.findElement(By.xpath(".//*[@text='Blog Posts']")).click();
		return new PostPage(driver);
	}
}
