package com.appium.tests;

import com.appium.config.UserCredentials;
import com.appium.manager.AppiumDriverManager;
import com.appium.pages.AccountsPage;
import com.appium.pages.LoginPage;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class ScrollTest {
    LoginPage loginPage;
    UserCredentials credentials;
    AppiumDriver driver;


    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        System.out.println("In Scroll Test");
        loginPage = new LoginPage(AppiumDriverManager.getDriver());
        credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
    }

    @Test(groups = "Parallel")
    public void scrollOverReader() throws IOException, InterruptedException {
        credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
        loginPage.login(credentials)
                .waitForWelcomePage().reader().swipe();
    }

}
