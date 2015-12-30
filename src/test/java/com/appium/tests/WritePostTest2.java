package com.appium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.config.UserBaseTest;
import com.appium.pages.LoginPage;
import com.appium.pages.PostPage;

public class WritePostTest2 extends UserBaseTest {

	LoginPage loginPage;

	@Test
	public void writePost_1() throws InterruptedException {
		loginPage = new LoginPage(driver);
		PostPage postpage = loginPage.enterValidCredentails().waitForWelcomePage().writePost()
				.writeContentAndPublish().clickPostPage();

		Assert.assertTrue(postpage.verifyPostIsSuccessfull());

	}

	@Test
	public void deleteTheCreatedPost_1() {
		loginPage = new LoginPage(driver);
		PostPage postpage = loginPage.enterValidCredentails().waitForWelcomePage().clickPostPage()
				.deletePost();
		Assert.assertTrue(postpage.verifyPostIsDeleted());

	}

}
