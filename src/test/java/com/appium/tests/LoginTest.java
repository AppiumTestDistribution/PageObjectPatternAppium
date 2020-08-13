package com.appium.tests;

import com.appium.config.CustomListener;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;

public class LoginTest {

    @Test(groups = "Parallel")
    public void loginWithValidUser() throws InterruptedException, IOException {
        HashMap<String, ?> pageObjects = CustomListener.getPageObjectsInitialized();
        Object loginPage = pageObjects.get("LoginPage");
/*        boolean userNameLoggedIn =
            loginPage.login(credentials)
                .waitForWelcomePage().verifyUserIsLoggedIn();
        Assert.assertTrue(userNameLoggedIn);*/
    }


    @Test public void logOutTest() throws InterruptedException, IOException {
/*        Boolean validateUserIsLoggedOut =
            loginPage.login(credentials)
                .waitForWelcomePage().moveToDisconnect().logOut()
                .validateUserNameFieldIsDisplayed();
        Assert.assertTrue(validateUserIsLoggedOut, "Failed to log out users");
        HashMap<String, Object> something = CustomListener.getPageObjectsInitialized();
        Object loginPage = something.get("LoginPage");
        System.out.println(loginPage);*/
    }

}
