package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.SelendroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.List;

public class CommentPageObjects {

    @AndroidFindBy(id = "org.wordpress.android:id/comment") @SelendroidFindBy(id = "comment")
    @iOSFindBy(className = "UIATableCell") public List<MobileElement> SELECT_TOPIC;

    @AndroidFindBy(id = "org.wordpress.android:id/edit_comment")
    @SelendroidFindBy(id = "edit_comment") @iOSFindBy(accessibility = "ReplyText") public MobileElement
        ENTER_COMMENTS;

    @AndroidFindBy(id = "org.wordpress.android:id/btn_submit_reply")
    @SelendroidFindBy(id = "image_post_comment") @iOSFindBy(id = "Reply") public MobileElement
        SUBMIT_COMMENTS;

    @iOSFindBy(accessibility = "Comments")
    @AndroidFindBy(accessibility = "Navigate up")
    public MobileElement BACK;

    @AndroidFindBy(id = "org.wordpress.android:id/progress_submit_comment")
    @SelendroidFindBy(id = "progress_submit_comment") public String PROGRESS_SUBMIT;

}
