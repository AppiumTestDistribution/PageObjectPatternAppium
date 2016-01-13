package com.appium.pages;

import org.openqa.selenium.support.PageFactory;

import com.appium.config.CommonAppiumTest;
import com.appium.config.DeviceInterface;
import com.appium.config.ViewFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends CommonAppiumTest {
	public ViewFactory viewFactory = new ViewFactory();
	public DeviceInterface runnerInfo;

	public LoginPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), loginPageObjects);
		runnerInfo = viewFactory.getMobilePlatform("android");
	}

	public LoginPage enterValidCredentails(String username, String password) {
        runnerInfo.login(username, password);
		return new LoginPage(driver);
	}

	public WelcomePage waitForWelcomePage() {
		waitForPageToLoad(loginPageObjects.WELCOME_PAGE);
		return new WelcomePage(driver);

	}

	public String validateErrorMessage() {
		return driver.getPageSource();
	}

	public boolean validateUserNameFieldIsDisplayed() {
		return loginPageObjects.username.isDisplayed();
	}

}
