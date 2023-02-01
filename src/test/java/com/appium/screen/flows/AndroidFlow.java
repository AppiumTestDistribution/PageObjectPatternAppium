package com.appium.screen.flows;

import com.appium.config.CommonAppiumTest;
import com.appium.config.DeviceInterface;
import com.appium.pages.CommentPage;
import com.appium.pages.LoginPage;
import com.appium.pages.PublishPage;
import com.appium.pages.WelcomePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.Dimension;

import java.io.IOException;
import java.time.Duration;
import java.util.stream.IntStream;

public class AndroidFlow extends CommonAppiumTest implements DeviceInterface {

    public AndroidFlow(AppiumDriver driver) {
        super(driver);
    }

    public void login(LoginPage loginPage, String username, String password) throws IOException, InterruptedException {
        loginPage.enterUserAndPassword(username, password);
        loginPage.signIn();
    }

    public void waitForHomePage(WelcomePage welcomePage) {
        welcomePage.acceptToolTip();
    }

    public void moveToLogOutScreen() {
        swipeRightUntilLogOutScreen();
    }

    public void moveToLogOutScreen(WelcomePage welcomePage) {
        // TODO Auto-generated method stub
        moveToLogOutScreen();
    }

    public void writeContent(PublishPage publishPage) {
        publishPage.writeContentAndPost();
        publishPage.clickBackButton();
        publishPage.clickPublish();

    }

    @Override
    public boolean validateComments(CommentPage commentPage) {
        return commentPage.isCommentMessagePresent();
    }

    @Override
    public WebElement scrollUp(WebElement element) {
        verticalSwipe(element);
        return element;
    }

    private void verticalSwipe(WebElement locator) {
        Dimension size = locator.getSize();
        IntStream.range(0, 3).forEach(value -> {
            int height = size.height / 2;
            new TouchAction((PerformsTouchActions) driver)
                    .press(ElementOption.element(locator, size.width / 2, height))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
                    .moveTo(ElementOption.element(locator, size.width / 2, height / 2 - height))
                    .release().perform();


        });

    }

}
