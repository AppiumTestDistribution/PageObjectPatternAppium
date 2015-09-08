package com.appium.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.appium.config.AppiumTestBase;
import com.appium.page.objects.PostPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PublishPage extends AppiumTestBase {
	PostPageObjects postPageObjects = new PostPageObjects();
	
	public PublishPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), postPageObjects);
		//loadPage();
		// TODO Auto-generated constructor stub
	}

	public PublishPage writeContentAndPublish(AppiumDriver<MobileElement> driver) {
		waitForPageToLoad(driver, postPageObjects.TITLE);
		postPageObjects.TITLE.sendKeys("Appium");
		postPageObjects.POST_CONTENT.sendKeys("Appium Rocks!!!!");
		driver.navigate().back();
		waitForPageToLoad(driver, postPageObjects.PUBLISH);
		postPageObjects.PUBLISH.click();
		return new PublishPage(driver);
	}


	public PostPage clickPostPage(AppiumDriver<MobileElement> driver) {
		driver.findElement(By.xpath(".//*[@text='Blog Posts']")).click();
		waitForPageToLoad(driver, postPageObjects.text_added);
		return new PostPage(driver);
	}
}
