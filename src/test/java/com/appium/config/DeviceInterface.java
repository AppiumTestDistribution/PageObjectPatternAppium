package com.appium.config;

import com.appium.pages.LoginPage;
import com.appium.pages.PublishPage;
import com.appium.pages.WelcomePage;

public interface DeviceInterface {

    public void login(LoginPage loginPage, String username, String password);

    public void waitForHomePage(WelcomePage welcomePage);

    public void moveToLogOutScreen(WelcomePage welcomePage);

    public void writeContent(PublishPage publishPage);
}
