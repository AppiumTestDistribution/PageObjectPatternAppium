package com.appium.pages;

import com.appium.config.CommonAppiumTest;
import com.appium.config.DeviceInterface;
import com.appium.config.UserCredentials;
import com.appium.config.ViewFactory;
import com.appium.page.objects.LoginPageObjects;
import com.appium.utils.ScreenShotManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class LoginPage extends CommonAppiumTest {
    public ViewFactory viewFactory = new ViewFactory(driver);
    public DeviceInterface runnerInfo;
    public LoginPageObjects loginPageObjects = new LoginPageObjects();

    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), loginPageObjects);
        runnerInfo = viewFactory.getMobilePlatform(driver.getPlatformName());
    }

    public WelcomePage login(UserCredentials userCredentials) throws IOException, InterruptedException {
        runnerInfo.login(this, userCredentials.getUserName(), userCredentials.getPassWord());
        return new WelcomePage(driver);
    }

    public String validateErrorMessage() {
        return driver.getPageSource();
    }

    public boolean validateUserNameFieldIsDisplayed() {
        return loginPageObjects.logInButton.isDisplayed();
    }

    public void enterUserAndPassword(String user, String pass) {
        // TODO Auto-generated method stub
        loginPageObjects.username.sendKeys(user);
        new ScreenShotManager().captureScreenShot("UserName");
        loginPageObjects.nextButton.click();
        waitForElement(loginPageObjects.enterPasswordLink).click();
        loginPageObjects.password.sendKeys(pass);
        new ScreenShotManager().captureScreenShot("Password");
    }

    public void signIn() {
        loginPageObjects.sign_in.click();
    }

    public void enterSiteURL() {
        // TODO Auto-generated method stub
        loginPageObjects.add_self_site.click();
        loginPageObjects.server_url.sendKeys("https://vodqademo.wordpress.com");
    }

}
