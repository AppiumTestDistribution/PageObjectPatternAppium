package com.appium.tests;

import com.appium.config.UserCredentials;
import com.appium.manager.AppiumDriverManager;
import com.appium.pages.LoginPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class WebTest {

    LoginPage loginPage;
    UserCredentials credentials;

    @Test(groups = "smoke") public void webTest() throws InterruptedException, IOException {

        loginPage = new LoginPage(AppiumDriverManager.getDriver());
        credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
        loginPage.login(credentials)
            .waitForWelcomePage().clickViewSite().switchToWebView().clickShow();
    }
}
