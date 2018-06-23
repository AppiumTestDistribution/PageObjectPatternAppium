package com.appium.tests;

import com.appium.config.UserCredentials;
import com.appium.manager.AppiumDriverManager;
import com.appium.pages.LoginPage;
import com.appium.pages.WelcomePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.stream.IntStream;

public class ScrollTest {
    LoginPage loginPage;
    UserCredentials credentials;
    AppiumDriver driver;

    @Test(groups = "Sai")
    public void scrollOverReader() throws IOException, InterruptedException {
        driver = AppiumDriverManager.getDriver();
        loginPage = new LoginPage(driver);
        credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
        loginPage.enterValidCredentails(credentials.getUserName(), credentials.getPassWord())
                .waitForWelcomePage().reader().swipe();
    }

}
