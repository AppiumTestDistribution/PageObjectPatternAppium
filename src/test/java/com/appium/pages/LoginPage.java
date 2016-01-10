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
		PageFactory.initElements(new AppiumFieldDecorator(driver), loginPageObjects);

	}

	public LoginPage enterValidCredentails(String username,String password) {
		waitForPageToLoad(loginPageObjects.username);
		loginPageObjects.username.sendKeys(username);
		loginPageObjects.password.sendKeys(password);
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
	
	public String validateErrorMessage(){
		return driver.getPageSource();
	}
	
	public boolean validateUserNameFieldIsDisplayed(){
		return loginPageObjects.username.isDisplayed();
	}

}
