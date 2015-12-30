package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.SelendroidFindBy;

public class WelcomePageObjects {


	@AndroidFindBy(id = "org.wordpress.android:id/fab_button")
	@SelendroidFindBy(id="fab_button")
	public MobileElement WRITE_POST;
	
	@AndroidFindBy(xpath = ".//*[@text='Blog Posts']")
	@SelendroidFindBy(xpath=".//*[@value='Blog Posts']")
	public MobileElement BLOG_POST;
	
	
	@AndroidFindBy(id="org.wordpress.android:id/my_site_comments_text_view")
	@SelendroidFindBy(id="my_site_comments_text_view")
	public MobileElement COMMENT;

}
