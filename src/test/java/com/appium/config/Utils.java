package com.appium.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class Utils {
	private static DesiredCapabilities caps = new DesiredCapabilities();
	private static AppiumDriver<MobileElement> driver;
	public static Properties prop = new Properties();
	static InputStream input = null;
	
	public static AppiumDriver<MobileElement> getDriver() throws IOException {
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
	
	public static void androidSetup() throws MalformedURLException {
		caps.setCapability("deviceName", "9111833b");
		caps.setCapability("platformVersion", "5.0.2");
		caps.setCapability("app", System.getProperty("user.dir") + "/build/wordpress.apk");
		caps.setCapability("package", "org.wordpress.android");
		caps.setCapability("appActivity", "org.wordpress.android.ui.WPLaunchActivity");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	}

	public static void iosSetup() throws MalformedURLException {
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/build/");
		File app = new File(appDir, "ios.app");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformVersion", "8.4");
		capabilities.setCapability("deviceName", "iPhone 6");
		capabilities.setCapability("app", app.getAbsolutePath());
		driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
}
