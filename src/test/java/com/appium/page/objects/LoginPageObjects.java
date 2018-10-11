package com.appium.page.objects;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.SelendroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

    @CacheLookup
    @AndroidFindBy(id = "org.wordpress.android:id/nux_username")
    @iOSXCUITFindBy(accessibility = "Email address")
    @SelendroidFindBy(id = "nux_username")
    @FindBy(id = "user_login") public MobileElement username;

    @iOSXCUITFindBy(iOSNsPredicate = "label contains 'Log In'")
    public MobileElement logInButton;

    @iOSXCUITFindBy(accessibility = "Next Button")
    @AndroidFindBy(id="nux_sign_in_button")
    public MobileElement nextButton;

    @iOSXCUITFindBy(accessibility = "Enter your password instead.")
    @AndroidFindBy(id = "password_layout")
    public MobileElement enterPasswordLink;

    @CacheLookup
    @AndroidFindBy(id = "org.wordpress.android:id/nux_password")
    @iOSXCUITFindBy(accessibility = "Password") @SelendroidFindBy(id = "nux_password")
    @FindBy(id = "user_pass")  public MobileElement password;


    @CacheLookup
    @iOSFindBy(xpath = ".//*[@name='Add Self-Hosted Site']")
    @AndroidFindBy(id = "org.wordpress.android:id/nux_add_selfhosted_button")
    @SelendroidFindBy(id = "nux_add_selfhosted_button") public MobileElement add_self_site;

    @CacheLookup
    @AndroidFindBy(xpath = ".//*[@text='Log in']")
    @iOSXCUITFindBy(accessibility = "Log In Button")
    @SelendroidFindBy(id = "nux_sign_in_button") @FindBy(id = "wp-submit") public MobileElement
        sign_in;

    @CacheLookup
    @AndroidFindBy(id = "org.wordpress.android:id/nux_url")
    @iOSFindBy(xpath = ".//*[@value='Site Address (URL)']") @SelendroidFindBy(id = "nux_url")
    public MobileElement server_url;
}
