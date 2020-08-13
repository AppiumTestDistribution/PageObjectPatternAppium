package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AccountsPageObject {

    @AndroidFindBy(id = "org.wordpress.android:id/me_login_logout_text_view")
    @iOSXCUITFindBy(id = "logOutFromWPcomButton") public MobileElement LOGOUT;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(id="Logging out will remove all of @vodqademo’s WordPress.com data from this device.")
    @iOSXCUITFindBy(id = "Log Out")
    public MobileElement DISCONNECT;


}
