package com.appium.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.appium.config.AppiumTestBase;
import com.appium.page.objects.LoginPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends AppiumTestBase {
	LoginPageObjects loginPageObjects = new LoginPageObjects();

	public LoginPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), loginPageObjects);

	}

	public LoginPage enterValidCredentails(AppiumDriver<MobileElement> driver) {
		waitForPageToLoad(driver, loginPageObjects.username);
		loginPageObjects.username.sendKeys("calabash");
		loginPageObjects.password.sendKeys("password");
		driver.hideKeyboard();
		loginPageObjects.add_self_site.click();		
		loginPageObjects.server_url.sendKeys("ec2-54-82-18-238.compute-1.amazonaws.com/wordpress");
		loginPageObjects.sign_in.click();
		return new LoginPage(driver);
	}

	public WelcomePage waitForWelcomePage(AppiumDriver<MobileElement> driver) {
		waitForPageToLoad(driver, loginPageObjects.WELCOME_PAGE);
		return new WelcomePage(driver);

	}

}
