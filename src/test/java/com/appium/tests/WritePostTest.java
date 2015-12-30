package com.appium.tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appium.config.UserBaseTest;
import com.appium.manager.AppiumParallelTest;
import com.appium.pages.LoginPage;
import com.appium.pages.PostPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class WritePostTest extends UserBaseTest {

	LoginPage loginPage;

	@Test
	public void writePost() throws InterruptedException {
		loginPage = new LoginPage(driver);
		PostPage postpage = loginPage.enterValidCredentails().waitForWelcomePage().writePost().writeContentAndPublish()
				.clickPostPage();

		Assert.assertTrue(postpage.verifyPostIsSuccessfull());

	}

	@Test
	public void deleteTheCreatedPost() {
		loginPage = new LoginPage(driver);
		PostPage postpage = loginPage.enterValidCredentails().waitForWelcomePage().clickPostPage().deletePost();
		Assert.assertTrue(postpage.verifyPostIsDeleted());

	}

}
