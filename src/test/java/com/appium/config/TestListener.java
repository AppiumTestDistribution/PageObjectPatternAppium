package com.appium.config;


import com.appium.manager.AppiumDeviceManager;
import com.appium.manager.AppiumDriverManager;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import com.appium.pages.LoginPage;
import com.appium.pages.AccountsPage;

import java.util.HashMap;

public class TestListener implements IInvokedMethodListener {

    static LoginPage loginPage;
    static AccountsPage accountsPage;
    static UserCredentials credentials;
    static HashMap<String, Object> pageObjects = new HashMap<>();

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        String msg = String.format("%s.afterInvocation() was invoked", getClass().getName());
        System.out.println("After DeviceId"
            + AppiumDeviceManager.getAppiumDevice().getDevice().getUdid());
        System.err.println(msg);
    }

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        String msg = String.format("%s.beforeInvocation() was invoked", getClass().getName());
        loginPage = new LoginPage(AppiumDriverManager.getDriver());
        accountsPage = new AccountsPage(AppiumDriverManager.getDriver());
        credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
    }

    public static HashMap<String, Object> getPageObjectsInitialized() {
        pageObjects.put("loginPage", loginPage);
        pageObjects.put("accountsPage", accountsPage);
        pageObjects.put("credentials", credentials);
        return pageObjects;
    }
}