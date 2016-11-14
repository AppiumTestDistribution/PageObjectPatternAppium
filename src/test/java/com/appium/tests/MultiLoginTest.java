package com.appium.tests;

import com.appium.config.JSonParser;
import com.appium.config.UserBaseTest;
import com.appium.config.UserCredentials;
import com.appium.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by saikrisv on 26/06/16.
 */
public class MultiLoginTest extends UserBaseTest {

    LoginPage loginPage;
    UserCredentials credentials;

    @Test public void loginWithValidUser() throws InterruptedException {
        loginPage = new LoginPage(driver);
        credentials = new UserCredentials(getUserName(), getPassword());
        String userNameLoggedIn =
            loginPage.enterValidCredentails(credentials.getUserName(), credentials.getPassWord())
                .waitForWelcomePage().verifyUserIsLoggedIn();
        Assert.assertEquals(userNameLoggedIn, JSonParser.getUserData(
            Integer.parseInt(Thread.currentThread().getName().toString().split("_")[1]))
            .get("welcomeName"));
    }
}
