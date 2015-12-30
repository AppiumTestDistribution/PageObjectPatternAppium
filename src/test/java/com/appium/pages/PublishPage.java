package com.appium.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.appium.config.CommonAppiumTest;
import com.appium.page.objects.PostPageObjects;

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

	public WelcomePage writeContentAndPublish() {
		waitForPageToLoad(postPageObjects.TITLE);
		postPageObjects.TITLE.sendKeys("Appium");
		postPageObjects.POST_CONTENT.sendKeys("Appium Rocks!!!!");
		driver.navigate().back();
		waitForPageToLoad(postPageObjects.PUBLISH);
		postPageObjects.PUBLISH.click();
		return new WelcomePage(driver);
	}

}
