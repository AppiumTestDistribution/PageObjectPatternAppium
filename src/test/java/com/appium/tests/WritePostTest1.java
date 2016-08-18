package com.appium.tests;

import com.appium.config.UserBaseTest;
import com.appium.config.UserCredentials;
import com.appium.pages.LoginPage;
import com.appium.pages.PostPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WritePostTest1 extends UserBaseTest {

    LoginPage loginPage;
    UserCredentials credentials;

    @Test public void writePost_1() throws InterruptedException {
        loginPage = new LoginPage(driver);
        credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
        PostPage postpage =
            loginPage.enterValidCredentails(credentials.getUserName(), credentials.getPassWord())
                .waitForWelcomePage().writePost().writeContentAndPublish().clickPostPage();

        Assert.assertTrue(postpage.verifyPostIsSuccessfull());
    }

    @Test public void deleteTheCreatedPost_1() {
        loginPage = new LoginPage(driver);
        credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
        PostPage postpage =
            loginPage.enterValidCredentails(credentials.getUserName(), credentials.getPassWord())
                .waitForWelcomePage().clickPostPage().deletePost();
        Assert.assertEquals(postpage.verifyPostIsDeleted(), "Deleting post");
    }
}
