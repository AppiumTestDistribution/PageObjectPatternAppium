package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WelcomePageObjects {

    @AndroidFindBy(id = "org.wordpress.android:id/fab_button")
    @iOSXCUITFindBy(id = "New Post")
    public MobileElement WRITE_POST;

    @AndroidFindBy(xpath = ".//*[@text='Blog Posts']")
    @iOSXCUITFindBy(iOSNsPredicate = "name BEGINSWITH 'Blog'")
    public MobileElement BLOG_POST;

    @AndroidFindBy(id = "org.wordpress.android:id/my_site_comments_text_view")
    @iOSXCUITFindBy(id = "Comments")
    public MobileElement COMMENT;

    @AndroidFindBy(id = "org.wordpress.android:id/my_site_title_label")
    @iOSXCUITFindBy(accessibility = "vodqademo.wordpress.com")
    public MobileElement LOGGED_IN_USER;

    @iOSXCUITFindBy(accessibility = "Not Now")
    @AndroidFindBy(id = "promo_dialog_button_negative")
    public MobileElement ACCEPT_TIP;

    @iOSXCUITFindBy(accessibility = "Not Now")
    public MobileElement clickBetaPopUp;

    @AndroidFindBy(id = "org.wordpress.android:id/switch_site")
    @iOSXCUITFindBy(className = "UIATableCell")
    public MobileElement WELCOME_PAGE;

    @iOSXCUITFindBy(accessibility = "Continue")
    public MobileElement continueButton;

    @iOSXCUITFindBy(id = "vodqademo on Appium: Testing comments")
    @AndroidFindBy(id = "org.wordpress.android:id/title")
    public MobileElement SELECT_BLOG;

    @iOSXCUITFindBy(accessibility = "Me")
    public MobileElement SELECT_ME;

    @AndroidFindBy(id = "org.wordpress.android:id/my_site_view_site_text_view")
    @iOSXCUITFindBy(iOSNsPredicate = "name BEGINSWITH 'View'")
    public MobileElement VIEW_SITE;

    @AndroidFindBy(accessibility = "Reader. Follow content from other sites.")
    @iOSXCUITFindBy(accessibility = "readerTabButton")
    public MobileElement READER;

    @AndroidFindBy(id = "org.wordpress.android:id/viewpager_main")
    @iOSXCUITFindBy(className = "XCUIElementTypeTable")
    @iOSXCUITFindBy(accessibility = "Reader")
    public MobileElement swipeReader;

    @iOSXCUITFindBy(accessibility = "Blog Details Table")
    @AndroidFindBy(id = "org.wordpress.android:id/scroll_view")
    public MobileElement BLOGTABLE;

}
