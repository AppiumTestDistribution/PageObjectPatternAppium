package com.appium.config;

import com.appium.android.AndroidFlow;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ViewFactory {
	AppiumDriver<MobileElement> driver;

	public DeviceInterface getMobilePlatform(String platform) {
		if (platform == null) {
			return null;
		}
		if (platform.equalsIgnoreCase("android")) {
			return new AndroidFlow(driver);

		}
		return null;
	}

}
