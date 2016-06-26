package com.appium.config;

import com.appium.screen.flows.AndroidFlow;
import com.appium.screen.flows.iOSFlow;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ViewFactory extends CommonAppiumTest {

    private AndroidFlow androidFlow;
    private iOSFlow iosFlow;

    public ViewFactory(AppiumDriver<MobileElement> driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    public DeviceInterface getMobilePlatform(String platform) {
        if (platform == null) {
            return null;
        }
        if (platform.equalsIgnoreCase("AndroidDriver")) {
            if (androidFlow == null) {
                return androidFlow = new AndroidFlow(driver);
            }
            return androidFlow;
        }

        if (platform.equalsIgnoreCase("IOSDriver")) {
            if (iosFlow == null) {
                return iosFlow = new iOSFlow(driver);
            }
            return iosFlow;

        }
        return null;

    }

}
