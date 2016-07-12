package com.appium.pages;

import com.appium.config.CommonAppiumTest;
import com.appium.page.objects.PostPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class PostPage extends CommonAppiumTest {
    PostPageObjects postPageObjects = new PostPageObjects();

    public PostPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), postPageObjects);
    }

    public boolean verifyPostIsSuccessfull() throws InterruptedException {
        return postPageObjects.POST_TEXT.isDisplayed();

    }

    public PostPage deletePost() {
        waitForElement(postPageObjects.POST_TEXT).click();
        waitForElement(postPageObjects.DELETE).click();
        waitForElement(postPageObjects.DELETE_CONFIRMATION).click();
        return new PostPage(driver);
    }

    public String verifyPostIsDeleted() {
        return postPageObjects.DELETE_POST.getText();
    }

}
