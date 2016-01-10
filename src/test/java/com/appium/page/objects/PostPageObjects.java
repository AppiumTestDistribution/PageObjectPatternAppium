package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.SelendroidFindBy;

public class PostPageObjects {


	@AndroidFindBy(xpath = ".//*[@text='Appium']")
	@SelendroidFindBy(xpath = ".//*[@value='Appium']")
	public MobileElement POST_TEXT;

	@AndroidFindBy(id = "org.wordpress.android:id/deletePost")
	@SelendroidFindBy(id="deletePost")
	public MobileElement DELETE;

	@AndroidFindBy(xpath = ".//*[@text='Yes']")
	@SelendroidFindBy(xpath = ".//*[@value='Yes']")
	public MobileElement DELETE_CONFIRMATION;
	
	
	@AndroidFindBy(id = "org.wordpress.android:id/post_title")
	@SelendroidFindBy(id="post_title")
	public MobileElement TITLE;

	@AndroidFindBy(id = "org.wordpress.android:id/post_content")
	@SelendroidFindBy(id="post_content")
	public MobileElement POST_CONTENT;

	@AndroidFindBy(id = "org.wordpress.android:id/menu_save_post")
	@SelendroidFindBy(id="menu_save_post")
	public MobileElement PUBLISH;
	
	@AndroidFindBy(id="android:id/message")
	@SelendroidFindBy(id="message")
	public MobileElement DELETE_POST;
}
