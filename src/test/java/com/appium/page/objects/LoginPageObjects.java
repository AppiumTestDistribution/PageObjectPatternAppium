package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginPageObjects {

	@AndroidFindBy(id = "org.wordpress.android:id/nux_username")
	@iOSFindBy(className = "UIATextField")
	public MobileElement username;

	@AndroidFindBy(id = "org.wordpress.android:id/nux_password")
	@iOSFindBy(className = "UIASecureTextField")
	public MobileElement password;

	@AndroidFindBy(id = "org.wordpress.android:id/switch_site")
	@iOSFindBy(className = "UIATableCell")
	public MobileElement WELCOME_PAGE;

	@iOSFindBy(xpath = ".//*[@name='Add Self-Hosted Site']")
	@AndroidFindBy(id = "org.wordpress.android:id/nux_add_selfhosted_button")
	public MobileElement add_self_site;

	@AndroidFindBy(xpath = ".//*[@text='Sign in']")
	@iOSFindBy(xpath = ".//*[@name='Add Site']")
	public MobileElement sign_in;

	@AndroidFindBy(id = "org.wordpress.android:id/nux_url")
	@iOSFindBy(xpath = ".//*[@value='Site Address (URL)']")
	public MobileElement server_url;
}
