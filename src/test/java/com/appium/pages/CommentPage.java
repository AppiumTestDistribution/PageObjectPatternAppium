package com.appium.pages;

import com.appium.config.CommonAppiumTest;
import com.appium.page.objects.CommentPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CommentPage extends CommonAppiumTest {

    CommentPageObjects commentPageObjects = new CommentPageObjects();

    public CommentPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        // loadPage();
        PageFactory.initElements(new AppiumFieldDecorator(driver), commentPageObjects);
    }

    public CommentPage selectTopic() {
        commentPageObjects.SELECT_TOPIC.get(0).click();
        return new CommentPage(driver);
    }


    public CommentPage enterComments() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        commentPageObjects.ENTER_COMMENTS.click();
        commentPageObjects.ENTER_COMMENTS.sendKeys("Testing Comments");
        commentPageObjects.SUBMIT_COMMENTS.click();
        driver.navigate().back();
        return new CommentPage(driver);
    }

    public boolean verifyCommentIsAdded() {
        scrollDirection(commentPageObjects.SELECT_TOPIC.get(0), SwipeElementDirection.DOWN);
        return commentPageObjects.SELECT_TOPIC.get(0).getAttribute("name")
            .contains("Testing Comments");
    }


}
