package com.appium.tests;

import com.appium.config.UserBaseTest;
import com.appium.config.UserCredentials;
import com.appium.pages.CommentPage;
import com.appium.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCommentTest extends UserBaseTest {

    LoginPage loginPage;
    UserCredentials credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");

    @Test public void addComment() throws InterruptedException {
        loginPage = new LoginPage(driver);
        CommentPage commentsPage =
            loginPage.enterValidCredentails(credentials.getUserName(), credentials.getPassWord())
                .waitForWelcomePage().clickComments().enterComments();
        Assert.assertTrue(commentsPage.verifyCommentIsAdded());

    }

}
