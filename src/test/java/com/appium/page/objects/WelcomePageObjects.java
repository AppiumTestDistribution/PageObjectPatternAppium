package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.SelendroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.List;

public class WelcomePageObjects {

    @AndroidFindBy(id = "org.wordpress.android:id/fab_button") @SelendroidFindBy(id = "fab_button")
    @iOSFindBy(id = "New Post") public MobileElement WRITE_POST;

    @AndroidFindBy(xpath = ".//*[@text='Blog Posts']")
    @SelendroidFindBy(xpath = ".//*[@value='Blog Posts']")
    @iOSFindBy(uiAutomator = ".elements()[1].cells().firstWithPredicate(\"name BEGINSWITH 'Blog'\")")
    public MobileElement BLOG_POST;

    @AndroidFindBy(id = "org.wordpress.android:id/my_site_comments_text_view")
    @SelendroidFindBy(id = "my_site_comments_text_view") @iOSFindBy(id = "Comments")
    public MobileElement COMMENT;

    @AndroidFindBy(id = "org.wordpress.android:id/my_site_title_label")
    @SelendroidFindBy(id = "my_site_title_label") @iOSFindBy(id = "vodqademo") public MobileElement
        LOGGED_IN_USER;

    @iOSFindBy(id = "new-editor-modal-dismiss-button") public MobileElement ACCEPT_TIP;

    @AndroidFindBy(id = "org.wordpress.android:id/switch_site")
    @iOSFindBy(className = "UIATableCell") @SelendroidFindBy(id = "switch_site")
    public MobileElement WELCOME_PAGE;


    @iOSFindBy(className = "UIATableCell") @AndroidFindBy(id = "org.wordpress.android:id/title")
    @SelendroidFindBy(id = "title") public List<MobileElement> SELECT_BLOG;

    @iOSFindBy(accessibility = "Me") public MobileElement SELECT_ME;

    @AndroidFindBy(id = "org.wordpress.android:id/my_site_view_site_text_view")
    @iOSFindBy(id = "View Site") public MobileElement VIEW_SITE;

}
