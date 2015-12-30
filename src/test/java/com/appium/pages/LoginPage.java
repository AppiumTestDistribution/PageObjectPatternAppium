package com.appium.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.appium.config.CommonAppiumTest;
import com.appium.page.objects.LoginPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends CommonAppiumTest {
	LoginPageObjects loginPageObjects = new LoginPageObjects();
	
	public LoginPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), loginPageObjects);

	}

	public LoginPage enterValidCredentails() {
		waitForPageToLoad(loginPageObjects.username);
		loginPageObjects.username.sendKeys("vodqa@gmail.com");
		loginPageObjects.password.sendKeys("Hello12345678");
		driver.hideKeyboard();
		loginPageObjects.add_self_site.click();		
		loginPageObjects.server_url.sendKeys("https://vodqademo.wordpress.com");
		loginPageObjects.sign_in.click();
		return new LoginPage(driver);
	}

	public WelcomePage waitForWelcomePage() {
		waitForPageToLoad(loginPageObjects.WELCOME_PAGE);
		return new WelcomePage(driver);

	}

}
