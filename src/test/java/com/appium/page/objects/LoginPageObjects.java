package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.SelendroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginPageObjects {

	@AndroidFindBy(id = "org.wordpress.android:id/nux_username")
	@iOSFindBy(className = "UIATextField")
	@SelendroidFindBy(id="nux_username")
	public MobileElement username;

	@AndroidFindBy(id = "org.wordpress.android:id/nux_password")
	@iOSFindBy(className = "UIASecureTextField")
	@SelendroidFindBy(id="nux_password")
	public MobileElement password;

	@AndroidFindBy(id = "org.wordpress.android:id/switch_site")
	@iOSFindBy(className = "UIATableCell")
	@SelendroidFindBy(id="switch_site")
	public MobileElement WELCOME_PAGE;

	@iOSFindBy(xpath = ".//*[@name='Add Self-Hosted Site']")
	@AndroidFindBy(id = "org.wordpress.android:id/nux_add_selfhosted_button")
	@SelendroidFindBy(id="nux_add_selfhosted_button")
	public MobileElement add_self_site;

	@AndroidFindBy(xpath = ".//*[@text='Sign in']")
	@iOSFindBy(xpath = ".//*[@name='Add Site']")
	@SelendroidFindBy(id="nux_sign_in_button")
	public MobileElement sign_in;

	@AndroidFindBy(id = "org.wordpress.android:id/nux_url")
	@iOSFindBy(xpath = ".//*[@value='Site Address (URL)']")
	@SelendroidFindBy(id="nux_url")
	public MobileElement server_url;
}
