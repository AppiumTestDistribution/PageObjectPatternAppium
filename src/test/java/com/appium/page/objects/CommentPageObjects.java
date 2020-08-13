package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.util.List;

public class CommentPageObjects {

    @AndroidFindBy(id = "org.wordpress.android:id/comment")
    @iOSXCUITFindBy(className = "UIATableCell")
    public List<MobileElement> SELECT_TOPIC;

    @AndroidFindBy(id = "org.wordpress.android:id/edit_comment")
    @iOSXCUITFindBy(accessibility = "ReplyText")
    public MobileElement
        ENTER_COMMENTS;

    @AndroidFindBy(id = "org.wordpress.android:id/btn_submit_reply")
    @iOSXCUITFindBy(id = "Reply")
    public MobileElement
        SUBMIT_COMMENTS;

    @iOSXCUITFindBy(accessibility = "Comments")
    @AndroidFindBy(accessibility = "Navigate up")
    public MobileElement BACK;

    @AndroidFindBy(id = "org.wordpress.android:id/progress_submit_comment")
    public String PROGRESS_SUBMIT;

}
