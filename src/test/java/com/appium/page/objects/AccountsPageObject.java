package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.SelendroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AccountsPageObject {

    @AndroidFindBy(id = "org.wordpress.android:id/me_login_logout_text_view")
    @SelendroidFindBy(id = "me_login_logout_text_view")
    @iOSFindBy(id = "logOutFromWPcomButton") public MobileElement LOGOUT;

    @AndroidFindBy(id = "android:id/button1") @SelendroidFindBy(id = "button1")
    @iOSFindBy(id="Logging out will remove all of @vodqademo’s WordPress.com data from this device.")
    @iOSFindBy(id = "Log Out")
    public MobileElement DISCONNECT;


}
