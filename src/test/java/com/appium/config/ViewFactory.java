package com.appium.config;

import com.appium.screen.flows.AndroidFlow;
import com.appium.screen.flows.iOSFlow;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class ViewFactory extends CommonAppiumTest {

    private AndroidFlow androidFlow;
    private iOSFlow iosFlow;

    public ViewFactory(AppiumDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    public DeviceInterface getMobilePlatform(String platform) {
        if (platform == null) {
            return null;
        }
        if (platform.equalsIgnoreCase("Android")) {
            if (androidFlow == null) {
                return androidFlow = new AndroidFlow(driver);
            }
            return androidFlow;
        }

        if (platform.equalsIgnoreCase("iOS")) {
            if (iosFlow == null) {
                return iosFlow = new iOSFlow(driver);
            }
            return iosFlow;

        }
        return null;

    }

}
