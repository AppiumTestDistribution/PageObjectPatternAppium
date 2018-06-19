package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.SelendroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.FindBy;

public class PostPageObjects {


    @AndroidFindBy(xpath = ".//*[@text='Appium']")
    @SelendroidFindBy(xpath = ".//*[@value='Appium']")
    @iOSFindBy(className = "UIATableView")
    public MobileElement POST_TEXT;

    @AndroidFindBy(xpath = ".//*[@text='Trash']")
    @SelendroidFindBy(id = "deletePost")
    public MobileElement DELETE;

    @AndroidFindBy(id = "org.wordpress.android:id/snackbar_text")
    @SelendroidFindBy(xpath = ".//*[@value='Yes']")
    public MobileElement DELETE_CONFIRMATION;


    @AndroidFindBy(id = "org.wordpress.android:id/post_title")
    @SelendroidFindBy(id = "post_title")
    @iOSFindBy(xpath = ".//*[@name='ZSSRichTextEditor']/XCUIElementTypeTextView[1]")
    public MobileElement TITLE;

    @AndroidFindBy(id = "org.wordpress.android:id/post_content")
    @SelendroidFindBy(id = "post_content")
    @iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"ZSSRichTextEditor\"]/XCUIElementTypeTextView[2]\n")
    public MobileElement POST_CONTENT;

    @AndroidFindBy(id = "org.wordpress.android:id/menu_save_post")
    @SelendroidFindBy(id = "menu_save_post")
    @iOSFindBy(id = "WPPostView")
    @iOSFindBy(id = "Publish")
    public MobileElement PUBLISH;

    @AndroidFindBy(id = "android:id/message")
    @SelendroidFindBy(id = "message")
    public MobileElement
            DELETE_POST;
}
