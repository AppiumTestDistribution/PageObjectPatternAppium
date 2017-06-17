package com.appium.tests;

import com.appium.config.UserCredentials;
import com.appium.manager.AppiumDriverManager;
import com.appium.pages.LoginPage;
import com.appium.pages.PostPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class WritePostTest1 {

    LoginPage loginPage;
    UserCredentials credentials;

    @Test public void writePost_1() throws InterruptedException, IOException {
        loginPage = new LoginPage(AppiumDriverManager.getDriver());
        credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
        PostPage postpage =
            loginPage.enterValidCredentails(credentials.getUserName(), credentials.getPassWord())
                .waitForWelcomePage().writePost().writeContentAndPublish().clickPostPage();

        Assert.assertTrue(postpage.verifyPostIsSuccessfull());
    }

    @Test public void deleteTheCreatedPost_1() throws IOException, InterruptedException {
        loginPage = new LoginPage(AppiumDriverManager.getDriver());
        credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
        PostPage postpage =
            loginPage.enterValidCredentails(credentials.getUserName(), credentials.getPassWord())
                .waitForWelcomePage().clickPostPage().deletePost();
        Assert.assertEquals(postpage.verifyPostIsDeleted(), "Deleting post");
    }
}
