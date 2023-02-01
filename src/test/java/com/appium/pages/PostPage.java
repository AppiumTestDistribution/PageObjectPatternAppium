package com.appium.pages;

import com.appium.config.CommonAppiumTest;
import com.appium.page.objects.PostPageObjects;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class PostPage extends CommonAppiumTest {
    PostPageObjects postPageObjects = new PostPageObjects();

    public PostPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), postPageObjects);
    }

    public boolean verifyPostIsSuccessfull() throws InterruptedException {
        return postPageObjects.POST_TEXT.isDisplayed();

    }

    public PostPage deletePost() {
        //waitForElement(postPageObjects.POST_TEXT).click();
        waitForElement(postPageObjects.DELETE).click();
        return new PostPage(driver);
    }

    public String verifyPostIsDeleted() {
        return postPageObjects.DELETE_CONFIRMATION.getText();
    }

}
