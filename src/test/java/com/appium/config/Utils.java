package com.appium.config;

import com.appium.pages.AccountsPage;
import com.appium.pages.LoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/*
//------------- READ ME --------------
//1. This is place to run single test case on single device for debug purpose only.
//2. Before you debug a test case , you need to start appium server externally.
//3. Cut and paste any particular test case here with its dependancies e.g. loginWithValidUser test case method
//
*/


public class Utils {
    DesiredCapabilities caps = new DesiredCapabilities();
    public AppiumDriver<MobileElement> driver;
    public static Properties prop = new Properties();
    static InputStream input = null;

    LoginPage loginPage;
    AccountsPage accountsPage;
    UserCredentials credentials;

    @BeforeClass public AppiumDriver<MobileElement> getDriver() throws IOException {
        input = new FileInputStream("property/android.properties");
        prop.load(input);
        if (prop.getProperty("platform").equals("android")) {
            androidSetup();
        } else {
            if (prop.getProperty("platform").equals("ios")) {
                iosSetup();
            }
        }
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return driver;
    }

    public void androidSetup() throws MalformedURLException {
        caps.setCapability("deviceName", "9111833b");
        caps.setCapability("app", System.getProperty("user.dir") + "/build/wordpress.apk");
        caps.setCapability("package", "org.wordpress.android");
        caps.setCapability("appActivity", "org.wordpress.android.ui.WPLaunchActivity");
        caps.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY,
            "org.wordpress.android.ui.accounts.SignInActivity");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

    public void iosSetup() throws MalformedURLException {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "/build/");
        File app = new File(appDir, "WordPress.app");
        caps.setCapability("platformVersion", "9.2");
        caps.setCapability("deviceName", "iPhone 6");
        caps.setCapability("app", app.getAbsolutePath());
        driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

    @AfterClass public void tearDown() {
        driver.quit();
    }

    //test case to be debugged individually
    @Test public void loginWithValidUser() throws InterruptedException {
        loginPage = new LoginPage(driver);
        credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
        String userNameLoggedIn =
            loginPage.enterValidCredentails(credentials.getUserName(), credentials.getPassWord())
                .waitForWelcomePage().verifyUserIsLoggedIn();
        Assert.assertEquals(userNameLoggedIn, "vodqademo");

    }
}
