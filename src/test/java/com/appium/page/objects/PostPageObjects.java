package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.SelendroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.FindBy;

public class PostPageObjects {


    @AndroidFindBy(xpath = ".//*[@text='Appium']")
    @SelendroidFindBy(xpath = ".//*[@value='Appium']") @iOSFindBy(className = "UIATableView")
    public MobileElement POST_TEXT;

    @AndroidFindBy(id = "org.wordpress.android:id/deletePost") @SelendroidFindBy(id = "deletePost")
    public MobileElement DELETE;

    @AndroidFindBy(xpath = ".//*[@text='Yes']") @SelendroidFindBy(xpath = ".//*[@value='Yes']")
    public MobileElement DELETE_CONFIRMATION;


    @AndroidFindBy(id = "org.wordpress.android:id/post_title") @SelendroidFindBy(id = "post_title")
    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[1]")
    public MobileElement TITLE;

    @AndroidFindBy(id = "org.wordpress.android:id/post_content")
    @SelendroidFindBy(id = "post_content")
    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[2]")
    public MobileElement POST_CONTENT;

    @AndroidFindBy(id = "org.wordpress.android:id/menu_save_post")
    @SelendroidFindBy(id = "menu_save_post") @iOSFindBy(id = "Post") public MobileElement PUBLISH;

    @AndroidFindBy(id = "android:id/message") @SelendroidFindBy(id = "message") public MobileElement
        DELETE_POST;
}
