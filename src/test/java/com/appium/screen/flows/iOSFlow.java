package com.appium.screen.flows;

import com.appium.config.CommonAppiumTest;
import com.appium.config.DeviceInterface;
import com.appium.pages.CommentPage;
import com.appium.pages.LoginPage;
import com.appium.pages.PublishPage;
import com.appium.pages.WelcomePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.io.IOException;
import java.time.Duration;
import java.util.stream.IntStream;

public class iOSFlow extends CommonAppiumTest implements DeviceInterface {

    public iOSFlow(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void login(LoginPage loginPage, String username, String password) throws IOException, InterruptedException {
        waitForElement(loginPage.loginPageObjects.logInButton).click();
        loginPage.enterUserAndPassword(username, password);
        loginPage.signIn();
    }

    public void waitForHomePage(WelcomePage welcomePage) {
        // TODO Auto-generated method stub
        welcomePage.acceptEditorToolTip();
       // welcomePage.selectBlog();

    }

    public void moveToLogOutScreen(WelcomePage welcomePage) {
        // TODO Auto-generated method stub
        welcomePage.clickOnMe();

    }

    public void writeContent(PublishPage publishPage) {
        // TODO Auto-generated method stub
        publishPage.writeContentAndPost();
        publishPage.clickPublish();
    }

    @Override
    public boolean validateComments(CommentPage commentPage) {
        return true;
    }

    @Override
    public MobileElement scrollUp(MobileElement welcomePage) {
        return verticalSwipe(welcomePage);
    }

    private MobileElement verticalSwipe(MobileElement locator) {
        Dimension size = locator.getSize();

        IntStream.range(0, 3).forEach(value -> {
            int height = size.height / 2;
            TouchAction swipe = new TouchAction(driver).press(PointOption.point(size.width / 2, height))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
                    .moveTo(PointOption.point(size.width / 2, height / 2 - height))
                    .release();
            swipe.perform();
        });

        return locator;
    }

}
