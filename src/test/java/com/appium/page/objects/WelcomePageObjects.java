package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class WelcomePageObjects {
	@AndroidFindBy(id = "org.wordpress.android:id/fab_button")
	public MobileElement WRITE_POST;

}
