package com.appium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.config.UserBaseTest;
import com.appium.config.UserCredentials;
import com.appium.pages.AccountsPage;
import com.appium.pages.LoginPage;
import com.appium.pages.WelcomePage;

public class LoginTest extends UserBaseTest {

	LoginPage loginPage;
	AccountsPage accountsPage;
	UserCredentials credentials;

	@Test
	public void loginWithValidUser() throws InterruptedException {
		loginPage = new LoginPage(driver);
		credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
		String userNameLoggedIn = loginPage.enterValidCredentails(credentials.getUserName(), credentials.getPassWord())
				.waitForWelcomePage().verifyUserIsLoggedIn();
		Assert.assertEquals(userNameLoggedIn, "vodqademo");

	}

	@Test
	public void loginWithInValidUser() throws InterruptedException {
		loginPage = new LoginPage(driver);
		credentials = new UserCredentials("vodqa123@gmail.com", "Hello12342225678");
		String userNameLoggedIn = loginPage.enterValidCredentails(credentials.getUserName(), credentials.getPassWord())
				.validateErrorMessage();
		Assert.assertEquals(userNameLoggedIn, "The username or password you entered is incorrect");
	}

	@Test
	public void logOutTest() throws InterruptedException {
		loginPage = new LoginPage(driver);
		accountsPage = new AccountsPage(driver);
		credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
		loginPage.enterValidCredentails(credentials.getUserName(), credentials.getPassWord())
				.waitForWelcomePage().swipeRightUntilTextExists("Disconnect from WordPress.com");
		Assert.assertTrue(accountsPage.logOut().validateUserNameFieldIsDisplayed());
	}

}
