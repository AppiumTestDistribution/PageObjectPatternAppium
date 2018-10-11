package com.appium.tests;

import com.appium.config.UserCredentials;
import com.appium.manager.AppiumDriverManager;
import com.appium.pages.LoginPage;
import com.appium.pages.PostPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class WritePostTest {

    LoginPage loginPage;
    UserCredentials credentials;

    @Test(groups = "Parallel1") public void writePost() throws InterruptedException, IOException {

        loginPage = new LoginPage(AppiumDriverManager.getDriver());
        credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
        PostPage postpage =
            loginPage.login(credentials)
                .waitForWelcomePage().writePost().writeContentAndPublish().clickPostPage();
        //Assert.assertTrue(postpage.verifyPostIsSuccessfull());
    }

    @Test(groups = "Parallel1") public void deleteTheCreatedPost() throws IOException, InterruptedException {
        loginPage = new LoginPage(AppiumDriverManager.getDriver());
        credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
        PostPage postpage =
            loginPage.login(credentials)
                .waitForWelcomePage().clickPostPage().deletePost();
        Assert.assertEquals(postpage.verifyPostIsDeleted(), "Post sent to trash");
    }
}
