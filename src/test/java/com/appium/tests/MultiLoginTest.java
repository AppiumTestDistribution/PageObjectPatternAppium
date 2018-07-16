package com.appium.tests;

import com.appium.config.JSonParser;
import com.appium.config.UserCredentials;
import com.appium.manager.AppiumDriverManager;
import com.appium.pages.LoginPage;
import org.json.simple.JSONObject;
import org.testng.Assert;

import java.io.IOException;

/**
 * Created by saikrisv on 26/06/16.
 */
public class MultiLoginTest {

    LoginPage loginPage;
    UserCredentials credentials;

     public void loginWithValidUser() throws InterruptedException, IOException {
        loginPage = new LoginPage(AppiumDriverManager.getDriver());
        credentials = new UserCredentials(getUserName(), getPassword());
        boolean userNameLoggedIn =
            loginPage.login(credentials)
                .waitForWelcomePage().verifyUserIsLoggedIn();
        Assert.assertEquals(userNameLoggedIn, JSonParser.getUserData(
            Integer.parseInt(Thread.currentThread().getName().toString().split("_")[1]))
            .get("welcomeName"));
    }

    public String getUserName() {
        String[] crds = Thread.currentThread().getName().toString().split("_");
        System.out.println(crds[1]);
        JSONObject user = new JSonParser().getUserData(Integer.parseInt(crds[1]));
        return user.get("userName").toString();
    }

    public String getPassword() {
        String[] crds = Thread.currentThread().getName().toString().split("_");
        JSONObject user = new JSonParser().getUserData(Integer.parseInt(crds[1]));
        return user.get("password").toString();
    }
}
