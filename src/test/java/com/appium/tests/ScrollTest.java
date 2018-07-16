package com.appium.tests;

import com.appium.config.UserCredentials;
import com.appium.manager.AppiumDriverManager;
import com.appium.pages.LoginPage;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class ScrollTest {
    LoginPage loginPage;
    UserCredentials credentials;
    AppiumDriver driver;

    @Test(groups = "Sai")
    public void scrollOverReader() throws IOException, InterruptedException {
        driver = AppiumDriverManager.getDriver();
        loginPage = new LoginPage(driver);
        credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
        loginPage.login(credentials)
                .waitForWelcomePage().reader().swipe();
    }

}
