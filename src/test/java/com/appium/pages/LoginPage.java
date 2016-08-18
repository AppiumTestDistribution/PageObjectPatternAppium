package com.appium.pages;

import com.annotation.values.PageName;
import com.appium.config.CommonAppiumTest;
import com.appium.config.DeviceInterface;
import com.appium.config.ViewFactory;
import com.appium.page.objects.LoginPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

@PageName("Login Page")
public class LoginPage extends CommonAppiumTest {
    public ViewFactory viewFactory = new ViewFactory(driver);
    public DeviceInterface runnerInfo;
    public LoginPageObjects loginPageObjects = new LoginPageObjects();

    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), loginPageObjects);
        runnerInfo = viewFactory.getMobilePlatform(driver.toString().split(":")[0].toString());
    }

    public WelcomePage enterValidCredentails(String username, String password) {
        runnerInfo.login(this, username, password);
        return new WelcomePage(driver);
    }

    public String validateErrorMessage() {
        return driver.getPageSource();
    }

    public boolean validateUserNameFieldIsDisplayed() {
        return loginPageObjects.username.isDisplayed();
    }

    public void enterUserAndPassword(String user, String pass) {
        // TODO Auto-generated method stub
        waitForPageToLoad(loginPageObjects.username);
        logStepIntoExtentReport(getPageObjectElemetDescription(loginPageObjects,"username"),"SendKeys",user);
        loginPageObjects.username.sendKeys(user);
        logStepIntoExtentReport(getPageObjectElemetDescription(loginPageObjects,"password"),"SendKeys",pass);
        loginPageObjects.password.sendKeys(pass);
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
