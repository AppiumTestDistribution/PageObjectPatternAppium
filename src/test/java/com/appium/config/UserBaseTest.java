package com.appium.config;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.appium.manager.AppiumParallelTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class UserBaseTest extends AppiumParallelTest{
	
    public  AppiumDriver<MobileElement> driver;
    
	@BeforeMethod
	public void startDriver(Method method) throws Exception {
		driver= startAppiumServerInParallel(method.getName());
	}
	
	
	@AfterMethod
	public void afterClass(ITestResult result) {
		killAppiumServer(result);	
	}

}
