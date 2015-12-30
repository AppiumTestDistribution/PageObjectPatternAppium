package com.appium.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.appium.config.CommonAppiumTest;
import com.appium.page.objects.CommentPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CommentPage extends CommonAppiumTest {

	CommentPageObjects commentPageObjects = new CommentPageObjects();

	public CommentPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// loadPage();
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), commentPageObjects);
	}

	public CommentPage selectTopic(){
		commentPageObjects.SELECT_TOPIC.get(0).click();
		return new CommentPage(driver);
	}
	
	
	public CommentPage enterComments(){
		commentPageObjects.ENTER_COMMENTS.sendKeys("Testing Comments");
		commentPageObjects.SUBMIT_COMMENTS.click();
		waitForElementToDisAppear(commentPageObjects.PROGRESS_SUBMIT);
		driver.navigate().back();
		return new CommentPage(driver);
	}
	
	public boolean verifyCommentIsAdded(){
	
		return commentPageObjects.SELECT_TOPIC.get(0).getText().equals("Testing Comments");
	}
	
	
}
