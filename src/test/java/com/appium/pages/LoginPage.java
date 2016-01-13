package com.appium.pages;

import org.openqa.selenium.support.PageFactory;

import com.appium.config.CommonAppiumTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends CommonAppiumTest{
	
	
	public LoginPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), loginPageObjects);

	}

	public LoginPage enterValidCredentails(String username,String password) {

		return new LoginPage(driver);
	}

	public WelcomePage waitForWelcomePage() {
		waitForPageToLoad(loginPageObjects.WELCOME_PAGE);
		return new WelcomePage(driver);

	}
	
	public String validateErrorMessage(){
		return driver.getPageSource();
	}
	
	public boolean validateUserNameFieldIsDisplayed(){
		return loginPageObjects.username.isDisplayed();
	}


}
