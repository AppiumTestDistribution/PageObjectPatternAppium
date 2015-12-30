package com.appium.page.objects;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.SelendroidFindBy;

public class CommentPageObjects {

	@AndroidFindBy(id = "org.wordpress.android:id/comment")
	@SelendroidFindBy(id = "comment")
	public List<MobileElement> SELECT_TOPIC;
	
	@AndroidFindBy(id = "org.wordpress.android:id/edit_comment")
	@SelendroidFindBy(id = "edit_comment")
	public MobileElement ENTER_COMMENTS;
	
	@AndroidFindBy(id = "org.wordpress.android:id/image_post_comment")
	@SelendroidFindBy(id = "image_post_comment")
	public MobileElement SUBMIT_COMMENTS;
	
	@AndroidFindBy(id = "org.wordpress.android:id/progress_submit_comment")
	@SelendroidFindBy(id = "progress_submit_comment")
	public String PROGRESS_SUBMIT;
}
