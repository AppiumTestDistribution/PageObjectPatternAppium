package com.appium.tests;

import com.annotation.values.Author;
import com.appium.config.UserCredentials;
import com.appium.manager.AppiumDriverManager;
import com.appium.pages.AccountsPage;
import com.appium.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest {

    LoginPage loginPage;
    AccountsPage accountsPage;
    UserCredentials credentials;

    @BeforeMethod
    public void setUp() {
        loginPage = new LoginPage(AppiumDriverManager.getDriver());
        accountsPage = new AccountsPage(AppiumDriverManager.getDriver());
        credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
    }

    @Test
    public void loginWithValidUser() throws InterruptedException, IOException {
        boolean userNameLoggedIn =
            loginPage.login(credentials)
                .waitForWelcomePage().verifyUserIsLoggedIn();
        Assert.assertTrue(userNameLoggedIn);
    }


    @Test public void logOutTest() throws InterruptedException, IOException {
        Boolean validateUserIsLoggedOut =
            loginPage.login(credentials)
                .waitForWelcomePage().moveToDisconnect().logOut()
                .validateUserNameFieldIsDisplayed();
        Assert.assertTrue(validateUserIsLoggedOut, "Failed to log out users");
    }

}
