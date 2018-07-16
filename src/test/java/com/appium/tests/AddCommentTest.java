package com.appium.tests;

import com.annotation.values.Author;
import com.appium.config.UserCredentials;
import com.appium.manager.AppiumDriverManager;
import com.appium.pages.CommentPage;
import com.appium.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddCommentTest {

    LoginPage loginPage;
    UserCredentials credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");

    @Test
    @Author(name="Sai")public void addComment() throws InterruptedException, IOException {
        loginPage = new LoginPage(AppiumDriverManager.getDriver());
        CommentPage commentsPage =
            loginPage.login(credentials)
                .waitForWelcomePage().clickComments().enterComments();
        Assert.assertTrue(commentsPage.verifyCommentIsAdded());
    }
}
