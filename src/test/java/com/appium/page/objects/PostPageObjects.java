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
	
	@AndroidFindBy(xpath = ".//*[@text='Appium']")
	public
	MobileElement text_added;
	
	@AndroidFindBy(id = "org.wordpress.android:id/post_title")
	public MobileElement TITLE;

	@AndroidFindBy(id = "org.wordpress.android:id/post_content")
	public MobileElement POST_CONTENT;

	@AndroidFindBy(id = "org.wordpress.android:id/menu_save_post")
	public MobileElement PUBLISH;

}
