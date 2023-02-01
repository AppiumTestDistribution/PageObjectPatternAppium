package com.appium.pages;

import com.appium.config.CommonAppiumTest;
import com.appium.config.DeviceInterface;
import com.appium.config.ViewFactory;
import com.appium.page.objects.PostPageObjects;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class PublishPage extends CommonAppiumTest {
    PostPageObjects postPageObjects = new PostPageObjects();
    public ViewFactory viewFactory = new ViewFactory(driver);
    public DeviceInterface runnerInfo;

    public PublishPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), postPageObjects);
        runnerInfo = viewFactory.getMobilePlatform(driver.getCapabilities().getPlatformName().toString());
    }

    public WelcomePage writeContentAndPublish() throws InterruptedException {
        runnerInfo.writeContent(this);
        return new WelcomePage(driver);

    }

    public void writeContentAndPost() {
        waitForPageToLoad(postPageObjects.TITLE);
        postPageObjects.TITLE.click();
        postPageObjects.TITLE.sendKeys("Appium");
        postPageObjects.POST_CONTENT.sendKeys("Appium Rocks!!!!");
    }


    public void clickPublish() {
        waitForPageToLoad(postPageObjects.PUBLISH);
        postPageObjects.PUBLISH.click();
    }
}
