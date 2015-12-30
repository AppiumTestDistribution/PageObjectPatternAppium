package com.appium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.config.UserBaseTest;
import com.appium.pages.CommentPage;
import com.appium.pages.LoginPage;

public class AddCommentTest extends UserBaseTest {
	
	LoginPage loginPage;

	@Test
	public void writePost() throws InterruptedException {
		loginPage = new LoginPage(driver);
		CommentPage commentsPage = loginPage.enterValidCredentails().waitForWelcomePage()
				.clickComments().enterComments();

		Assert.assertTrue(commentsPage.verifyCommentIsAdded());

	}
}
