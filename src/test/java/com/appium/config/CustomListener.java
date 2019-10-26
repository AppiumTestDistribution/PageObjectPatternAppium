package com.appium.config;

import com.appium.manager.AppiumDeviceManager;
import com.appium.manager.AppiumDriverManager;
import com.appium.pages.AccountsPage;
import com.appium.pages.LoginPage;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import java.util.HashMap;

public class CustomListener implements IInvokedMethodListener {

    private static LoginPage loginPage;
    private static AccountsPage accountsPage;
    private static UserCredentials credentials;

    private HashMap<String, Object> pageObjects = new HashMap<>();

    public static HashMap<String, ?> getPageObjectsInitialized() {
        return pageObjectsInitialized.get();
    }

    private static ThreadLocal<HashMap<String, Object>> pageObjectsInitialized = new ThreadLocal<>();

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
        System.out.println("Before DeviceId"
            + AppiumDeviceManager.getAppiumDevice().getDevice().getUdid());
        System.err.println(msg);
        loginPage = new LoginPage(AppiumDriverManager.getDriver());
        accountsPage = new AccountsPage(AppiumDriverManager.getDriver());
        credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
        pageObjects.put("LoginPage", loginPage);
        pageObjects.put("AccountPage", accountsPage);
        pageObjects.put("Credentials", credentials);
        pageObjectsInitialized.set(pageObjects);
    }
}
