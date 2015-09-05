package com.appium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.appium.config.AppiumTestBase;
import com.appium.page.objects.PostPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PostPage extends AppiumTestBase {
	PostPageObjects postPageObjects = new PostPageObjects();

	public PostPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// loadPage();
		PageFactory.initElements(new AppiumFieldDecorator(driver), postPageObjects);
		// TODO Auto-generated constructor stub
	}

	public boolean verifyPostIsSuccessfull(AppiumDriver<MobileElement> driver) throws InterruptedException {
		Thread.sleep(8000);
		return postPageObjects.POST_TEXT.isDisplayed();

	}

	public PostPage deletePost(AppiumDriver<MobileElement> driver) {
		waitForElement(driver, postPageObjects.POST_TEXT).click();
		waitForElement(driver, postPageObjects.DELETE).click();
		waitForElement(driver, postPageObjects.DELETE_CONFIRMATION);
		return new PostPage(driver);
	}

	public boolean verifyPostIsDeleted(WebDriver driver) {
		return driver.findElements(By.xpath(".//*[@text='Appium']")).size() == 0;
	}

}
