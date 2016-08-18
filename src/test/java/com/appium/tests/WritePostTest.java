package com.appium.tests;

import com.annotation.values.Description;
import com.appium.config.UserBaseTest;
import com.appium.config.UserCredentials;
import com.appium.pages.LoginPage;
import com.appium.pages.PostPage;
import org.testng.Assert;
import org.testng.annotations.Test;

@Description("Test to check if user can write post and also delete the post")
public class WritePostTest extends UserBaseTest {

    LoginPage loginPage;
    UserCredentials credentials;

    @Test public void writePost() throws InterruptedException {

        loginPage = new LoginPage(driver);
        credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
        PostPage postpage =
            loginPage.enterValidCredentails(credentials.getUserName(), credentials.getPassWord())
                .waitForWelcomePage().writePost().writeContentAndPublish().clickPostPage();
        Assert.assertTrue(postpage.verifyPostIsSuccessfull());
    }

    @Test public void deleteTheCreatedPost() {
        loginPage = new LoginPage(driver);
        credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
        PostPage postpage =
            loginPage.enterValidCredentails(credentials.getUserName(), credentials.getPassWord())
                .waitForWelcomePage().clickPostPage().deletePost();
        Assert.assertEquals(postpage.verifyPostIsDeleted(), "Deleting post");
    }
}
