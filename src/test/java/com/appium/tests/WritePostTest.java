package com.appium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.config.AppiumTestBase;
import com.appium.pages.LoginPage;
import com.appium.pages.PostPage;

public class WritePostTest extends AppiumTestBase {
	public static final String USERNAME = "org.wordpress.android:id/nux_username";
	public static final String PASSWORD = "org.wordpress.android:id/nux_password";

	@Test(priority = 1)
	public void writePost() throws InterruptedException {
		PostPage postpage = LoginPage.enterValidCredentails(driver, USERNAME, PASSWORD)
									.waitForWelcomePage(driver)
											.writePost(driver).writeContentAndPublish(driver)
													.clickPostPage(driver);

		Assert.assertTrue(postpage.verifyPostIsSuccessfull(driver));

	}

	@Test(priority = 2)
	public void deleteTheCreatedPost() {
		PostPage postpage = LoginPage.enterValidCredentails(driver, USERNAME, PASSWORD)
						.waitForWelcomePage(driver)
								.clickPostPage(driver).deletePost(driver);
	   Assert.assertTrue(postpage.verifyPostIsDeleted(driver));
		
	}

}
