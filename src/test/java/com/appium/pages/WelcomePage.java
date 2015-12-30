package com.appium.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.appium.config.CommonAppiumTest;
import com.appium.page.objects.WelcomePageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WelcomePage extends CommonAppiumTest {

	WelcomePageObjects welcomePageObjects = new WelcomePageObjects();

	public WelcomePage(AppiumDriver<MobileElement> driver) {
		super(driver);
		//loadPage();
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), welcomePageObjects);
	}

	public PublishPage writePost() {
		welcomePageObjects.WRITE_POST.click();
		return new PublishPage(driver);
	}

	
	public PostPage clickPostPage() {
		welcomePageObjects.BLOG_POST.click();
		return new PostPage(driver);
	}
	
	public CommentPage clickComments(){
		welcomePageObjects.COMMENT.click();
		return new CommentPage(driver);
		
	}
}
