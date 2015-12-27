package com.appium.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.appium.config.CommonAppiumTest;
import com.appium.config.UserBaseTest;
import com.appium.page.objects.PostPageObjects;
import com.sun.jna.platform.win32.Netapi32Util.User;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PublishPage extends CommonAppiumTest {
	PostPageObjects postPageObjects = new PostPageObjects();

	public PublishPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), postPageObjects);
		// loadPage();
		// TODO Auto-generated constructor stub
	}

	public PublishPage writeContentAndPublish(AppiumDriver<MobileElement> driver) {
		waitForPageToLoad(postPageObjects.TITLE);
		postPageObjects.TITLE.sendKeys("Appium");
		postPageObjects.POST_CONTENT.sendKeys("Appium Rocks!!!!");
		driver.navigate().back();
		waitForPageToLoad(postPageObjects.PUBLISH);
		postPageObjects.PUBLISH.click();
		return new PublishPage(driver);
	}

	public PostPage clickPostPage(AppiumDriver<MobileElement> driver) {
		driver.findElement(By.xpath(".//*[@text='Blog Posts']")).click();
		waitForPageToLoad(postPageObjects.text_added);
		return new PostPage(driver);
	}
}
