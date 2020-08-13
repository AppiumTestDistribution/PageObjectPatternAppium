package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PostPageObjects {


    @AndroidFindBy(xpath = ".//*[@text='Appium']")
    @iOSXCUITFindBy(className = "UIATableView")
    public MobileElement POST_TEXT;

    @AndroidFindBy(xpath = ".//*[@text='Trash']")
    public MobileElement DELETE;

    @AndroidFindBy(id = "org.wordpress.android:id/snackbar_text")
    public MobileElement DELETE_CONFIRMATION;


    @AndroidFindBy(id = "org.wordpress.android:id/post_title")
    @iOSXCUITFindBy(xpath = ".//*[@name='ZSSRichTextEditor']/XCUIElementTypeTextView[1]")
    public MobileElement TITLE;

    @AndroidFindBy(id = "org.wordpress.android:id/post_content")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"ZSSRichTextEditor\"]/XCUIElementTypeTextView[2]\n")
    public MobileElement POST_CONTENT;

    @AndroidFindBy(id = "org.wordpress.android:id/menu_save_post")
    @iOSXCUITFindBy(id = "WPPostView")
    @iOSXCUITFindBy(id = "Publish")
    public MobileElement PUBLISH;

    @AndroidFindBy(id = "android:id/message")
            public MobileElement DELETE_POST;
}
