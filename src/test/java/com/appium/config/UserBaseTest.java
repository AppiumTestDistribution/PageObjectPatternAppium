package com.appium.config;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.appium.manager.AppiumParallelTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class UserBaseTest extends AppiumParallelTest{

    public WebDriverWait wait;
  

    @BeforeMethod()
    public void startApp(Method name) throws Exception {
    	startLogResults(name.getName());
    	
    }

    @AfterMethod()
    public void killServer(ITestResult result) {
    	endLogTestResults(result);  
        getDriver().resetApp();
    	
    }

    public AppiumDriver<MobileElement> getDriver() {
        return driver;
    }

    @BeforeClass()
    public void beforeClass() throws Exception {
      driver = startAppiumServerInParallel(getClass().getSimpleName());
    	//iosSetup();
    	//androidSetup();
    }

    @AfterClass()
    public void afterClass() throws InterruptedException, IOException {;
       killAppiumServer();
       //getDriver().quit();
    }
}
