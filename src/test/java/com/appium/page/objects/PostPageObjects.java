package com.appium.page.objects;

import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PostPageObjects {


    @AndroidFindBy(xpath = ".//*[@text='Appium']")
    @iOSXCUITFindBy(className = "UIATableView")
    public WebElement POST_TEXT;

    @AndroidFindBy(xpath = ".//*[@text='Trash']")
    public WebElement DELETE;

    @AndroidFindBy(id = "org.wordpress.android:id/snackbar_text")
    public WebElement DELETE_CONFIRMATION;


    @AndroidFindBy(id = "org.wordpress.android:id/post_title")
    @iOSXCUITFindBy(xpath = ".//*[@name='ZSSRichTextEditor']/XCUIElementTypeTextView[1]")
    public WebElement TITLE;

    @AndroidFindBy(id = "org.wordpress.android:id/post_content")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"ZSSRichTextEditor\"]/XCUIElementTypeTextView[2]\n")
    public WebElement POST_CONTENT;

    @AndroidFindBy(id = "org.wordpress.android:id/menu_save_post")
    @iOSXCUITFindBy(id = "WPPostView")
    @iOSXCUITFindBy(id = "Publish")
    public WebElement PUBLISH;

    @AndroidFindBy(id = "android:id/message")
            public WebElement DELETE_POST;
}
