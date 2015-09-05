package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PostPageObjects {
	@AndroidFindBy(xpath = ".//*[@text='Appium']")
	public MobileElement POST_TEXT;

	@AndroidFindBy(id = "org.wordpress.android:id/deletePost")
	public MobileElement DELETE;

	@AndroidFindBy(xpath = ".//*[@text='Yes']")
	public MobileElement DELETE_CONFIRMATION;

}
