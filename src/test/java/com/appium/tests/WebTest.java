package com.appium.tests;

import com.appium.config.UserBaseTest;
import com.appium.config.UserCredentials;
import com.appium.pages.LoginPage;
import org.testng.annotations.Test;

public class WebTest extends UserBaseTest {

	LoginPage loginPage;
	UserCredentials credentials;

	// https://github.com/appium/appium/issues/6627
	// https://github.com/appium/appium/issues/6634
	@Test
	public void webTest() throws InterruptedException {

		loginPage = new LoginPage(driver);
		credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
		loginPage.enterValidCredentails(credentials.getUserName(), credentials.getPassWord()).waitForWelcomePage()
				.clickViewSite().switchToWebView().clickShow();
	}

}
