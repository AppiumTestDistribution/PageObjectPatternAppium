package com.appium.tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appium.manager.AppiumParallelTest;
import com.appium.pages.LoginPage;
import com.appium.pages.PostPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class WritePostTest extends AppiumParallelTest {
	public AppiumDriver<MobileElement> driver;
	LoginPage loginPage;

	@BeforeMethod(alwaysRun = true)
	public void startDriver(Method method) throws Exception {
		driver = startAppiumServerInParallel(method.getName());
	}

	@Test
	public void writePost() throws InterruptedException {
		loginPage = new LoginPage(driver);
		PostPage postpage = loginPage.enterValidCredentails(driver).waitForWelcomePage(driver).writePost(driver)
				.writeContentAndPublish(driver).clickPostPage(driver);

		Assert.assertTrue(postpage.verifyPostIsSuccessfull(driver));

	}

	@Test
	public void deleteTheCreatedPost() {
		loginPage = new LoginPage(driver);
		PostPage postpage = loginPage.enterValidCredentails(driver).waitForWelcomePage(driver).clickPostPage(driver)
				.deletePost(driver);
		Assert.assertTrue(postpage.verifyPostIsDeleted(driver));

	}

	@AfterMethod(alwaysRun = true)
	public void afterClass(ITestResult result) {
		killAppiumServer(result);
	}

}
