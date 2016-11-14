package com.appium.pages;

import com.appium.config.CommonAppiumTest;
import com.appium.config.DeviceInterface;
import com.appium.config.ViewFactory;
import com.appium.page.objects.ViewSitePageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by saikrisv on 28/03/16.
 */
public class ViewSitePage extends CommonAppiumTest {

    public ViewFactory viewFactory = new ViewFactory(driver);
    public DeviceInterface runnerInfo;
    ViewSitePageObject viewSitePageObjects = new ViewSitePageObject();

    public ViewSitePage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), viewSitePageObjects);
        runnerInfo = viewFactory.getMobilePlatform(driver.toString().split(":")[0].toString());
    }

    public ViewSitePage switchToWebView() {
        setContext("WEBVIEW_");
        return new ViewSitePage(driver);
    }

    public ViewSitePage clickShow() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        viewSitePageObjects.CLICK_SHOW.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ViewSitePage(driver);
    }

}
