package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.SelendroidFindBy;

public class AccountsPageObject {
	
	@AndroidFindBy(id="org.wordpress.android:id/me_login_logout_text_view")
	@SelendroidFindBy(id="me_login_logout_text_view")
	public MobileElement LOGOUT;
	
	@AndroidFindBy(id="android:id/button1")
	@SelendroidFindBy(id="button1")
	public MobileElement DISCONNECT;
	

}
