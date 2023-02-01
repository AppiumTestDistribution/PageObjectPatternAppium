package com.appium.pages;

import com.appium.config.CommonAppiumTest;
import com.appium.config.DeviceInterface;
import com.appium.config.ViewFactory;
import com.appium.manager.ScreenShotManager;
import com.appium.page.objects.CommentPageObjects;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class CommentPage extends CommonAppiumTest {

    CommentPageObjects commentPageObjects = new CommentPageObjects();
    private ViewFactory viewFactory = new ViewFactory(driver);
    private DeviceInterface runnerInfo;
    public CommentPage(AppiumDriver driver) {
        super(driver);
        // loadPage();
        PageFactory.initElements(new AppiumFieldDecorator(driver), commentPageObjects);
        runnerInfo = viewFactory.getMobilePlatform(driver.getCapabilities().getPlatformName().toString());
    }

    public CommentPage selectTopic() {
        commentPageObjects.SELECT_TOPIC.get(0).click();
        return new CommentPage(driver);
    }


    public CommentPage enterComments() {
        waitForElement(commentPageObjects.ENTER_COMMENTS).click();
        commentPageObjects.ENTER_COMMENTS.sendKeys("Testing Comments");
        commentPageObjects.SUBMIT_COMMENTS.click();
        commentPageObjects.BACK.click();
        return new CommentPage(driver);
    }

    public boolean verifyCommentIsAdded() throws IOException, InterruptedException {
        //scrollDirection(commentPageObjects.SELECT_TOPIC.get(0), SwipeElementDirection.DOWN);
        //new ScreenShotManager().captureScreenShot("Comments Added");
        return runnerInfo.validateComments(this);
    }

    public boolean isCommentMessagePresent() {
        return commentPageObjects.SELECT_TOPIC.get(0).getAttribute("text")
                .contains("Testing Comments");
    }


}
