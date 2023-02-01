package com.appium.config;

import com.appium.pages.CommentPage;
import com.appium.pages.LoginPage;
import com.appium.pages.PublishPage;
import com.appium.pages.WelcomePage;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public interface DeviceInterface {

    public void login(LoginPage loginPage, String username, String password) throws IOException, InterruptedException;

    public void waitForHomePage(WelcomePage welcomePage);

    public void moveToLogOutScreen(WelcomePage welcomePage);

    public void writeContent(PublishPage publishPage);

    boolean validateComments(CommentPage commentPage);

    WebElement scrollUp(WebElement welcomePage);
}
