package com.appium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.appium.config.Common;

public class WelcomePage extends Common {
	By WRITE_POST = By.id("org.wordpress.android:id/fab_button");
	By TITLE = By.id("org.wordpress.android:id/post_title");
	By POST_CONTENT = By.id("org.wordpress.android:id/post_content");
	By PUBLISH = By.id("org.wordpress.android:id/menu_save_post");

	public WelcomePage writePost(WebDriver driver) {
		driver.findElement(WRITE_POST).click();
		return new WelcomePage();
	}

	public PublishPage writeContentAndPublish(WebDriver driver) {
		waitForPageToLoad(driver, TITLE);
		driver.findElement(TITLE).sendKeys("Appium");
		driver.findElement(POST_CONTENT).sendKeys("Appium Rocks!!!!");
		driver.navigate().back();
		waitForPageToLoad(driver, PUBLISH);
		driver.findElement(PUBLISH).click();
		return new PublishPage();
	}
	
	public PostPage clickPostPage(WebDriver driver){
		driver.findElement(By.xpath(".//*[@text='Blog Posts']")).click();
		return new PostPage();		
	}
}
