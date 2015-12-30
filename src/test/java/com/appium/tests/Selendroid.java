package com.appium.tests;

import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
 
public class Selendroid {
	AppiumDriver<WebElement> driver;
	WebDriverWait wait;

	@Before
	public void setUp() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "10.4.21.140:5555");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0.1");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Selendroid");
		capabilities.setCapability(MobileCapabilityType.APP,
				"/Users/saikrisv/Documents/workspace/PagePatternAppium/build/wordpress.apk");
		capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, "org.wordpress.android.ui.WPLaunchActivity");
		capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "org.wordpress.android");
		capabilities.setCapability(MobileCapabilityType.APP_WAIT_ACTIVITY, "org.wordpress.android.ui.accounts.SignInActivity");
	 driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:6002/wd/hub"),
				capabilities);
		WebDriverWait wait = new WebDriverWait(driver, 30);
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void runWebTest() throws Exception {
         driver.findElement(By.id("nux_username")).sendKeys("Calabash");
         driver.findElement(By.id("nux_password")).sendKeys("Calabash");
		
	}

}
