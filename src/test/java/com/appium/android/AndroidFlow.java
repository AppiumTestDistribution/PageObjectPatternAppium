package com.appium.android;

import com.appium.config.CommonAppiumTest;
import com.appium.config.DeviceInterface;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AndroidFlow extends CommonAppiumTest implements DeviceInterface {

	public AndroidFlow(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void login(String username, String password) {
		enterUserAndPassword(username, password);
		signIn();
	}

}
