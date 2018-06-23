package com.appium.pages;

import com.appium.config.CommonAppiumTest;
import com.appium.config.DeviceInterface;
import com.appium.config.ViewFactory;
import com.appium.page.objects.WelcomePageObjects;
import com.appium.utils.ScreenShotManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class WelcomePage extends CommonAppiumTest {
    public ViewFactory viewFactory = new ViewFactory(driver);
    public DeviceInterface runnerInfo;
    WelcomePageObjects welcomePageObjects = new WelcomePageObjects();

    public WelcomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), welcomePageObjects);
        runnerInfo = viewFactory.getMobilePlatform(driver.getPlatformName());
    }

    public WelcomePage waitForWelcomePage() {
        runnerInfo.waitForHomePage(this);
        return new WelcomePage(driver);

    }

    public PublishPage writePost() {
        welcomePageObjects.WRITE_POST.click();
        return new PublishPage(driver);
    }

    public WelcomePage acceptToolTip() {
        waitForElement(welcomePageObjects.ACCEPT_TIP).click();
        return this;
    }

    public PostPage clickPostPage() {
        welcomePageObjects.BLOG_POST.click();
        return new PostPage(driver);
    }

    public CommentPage clickComments() {
        welcomePageObjects.COMMENT.click();
        waitForElement(welcomePageObjects.SELECT_BLOG);
        welcomePageObjects.SELECT_BLOG.click();
        return new CommentPage(driver);

    }

    public boolean verifyUserIsLoggedIn() throws IOException, InterruptedException {
        //new ScreenShotManager().captureScreenShot("LoggedInUser");
        Thread.sleep(3000);
        return welcomePageObjects.LOGGED_IN_USER.isDisplayed();
    }

    public void waitForHomePageToLoad() {
        waitForElement(welcomePageObjects.WELCOME_PAGE);
    }

    public void acceptEditorToolTip() {
        waitForElement(welcomePageObjects.continueButton).click();
        waitForElement(welcomePageObjects.ACCEPT_TIP);
        welcomePageObjects.ACCEPT_TIP.click();
    }

    public void selectBlog() {
        waitForElement(driver.findElementById("vodqademo.wordpress.com")).click();
    }

    public AccountsPage clickOnMe() {
        welcomePageObjects.SELECT_ME.click();
        return new AccountsPage(driver);
    }

    public AccountsPage moveToDisconnect() throws IOException, InterruptedException {
        runnerInfo.moveToLogOutScreen(this);
        new ScreenShotManager().captureScreenShot("LogoutPage");
        return new AccountsPage(driver);
    }

    public ViewSitePage clickViewSite() {
        runnerInfo.scrollUp(welcomePageObjects.BLOGTABLE);
        waitForElement(welcomePageObjects.VIEW_SITE).click();
        return new ViewSitePage(driver);
    }

    public WelcomePage reader() throws InterruptedException {
        welcomePageObjects.READER.click();
        Thread.sleep(3000);
        return this;
    }

    public MobileElement swipe() {
        return runnerInfo.scrollUp(welcomePageObjects.swipeReader);

    }

}
