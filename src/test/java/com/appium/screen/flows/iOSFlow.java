package com.appium.screen.flows;

import com.appium.config.CommonAppiumTest;
import com.appium.config.DeviceInterface;
import com.appium.pages.LoginPage;
import com.appium.pages.PublishPage;
import com.appium.pages.WelcomePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class iOSFlow extends CommonAppiumTest implements DeviceInterface {

    public iOSFlow(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void login(LoginPage loginPage, String username, String password) {
        loginPage.enterUserAndPassword(username, password);
        loginPage.signIn();
    }

    public void waitForHomePage(WelcomePage welcomePage) {
        // TODO Auto-generated method stub
        welcomePage.acceptEditorToolTip();
        welcomePage.selectBlog();

    }

    public void moveToLogOutScreen(WelcomePage welcomePage) {
        // TODO Auto-generated method stub
        welcomePage.clickOnMe();

    }

    public void writeContent(PublishPage publishPage) {
        // TODO Auto-generated method stub
        publishPage.writeContentAndPost();
        publishPage.clickPublish();
    }

}
