package com.appium.page.objects;


import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

    @CacheLookup
    @AndroidFindBy(id = "org.wordpress.android:id/nux_username")
    @iOSXCUITFindBy(accessibility = "Email address")
    @FindBy(id = "user_login") public WebElement username;

    @iOSXCUITFindBy(iOSNsPredicate = "label contains 'Log In'")
    public WebElement logInButton;

    @iOSXCUITFindBy(accessibility = "Next Button")
    @AndroidFindBy(id="nux_sign_in_button")
    public WebElement nextButton;

    @iOSXCUITFindBy(accessibility = "Enter your password instead.")
    @AndroidFindBy(id = "password_layout")
    public WebElement enterPasswordLink;

    @CacheLookup
    @AndroidFindBy(id = "org.wordpress.android:id/nux_password")
    @iOSXCUITFindBy(accessibility = "Password")
    @FindBy(id = "user_pass")  public WebElement password;


    @CacheLookup
    @iOSXCUITFindBy(xpath = ".//*[@name='Add Self-Hosted Site']")
    @AndroidFindBy(id = "org.wordpress.android:id/nux_add_selfhosted_button")
    public WebElement add_self_site;

    @CacheLookup
    @AndroidFindBy(xpath = ".//*[@text='Log in']")
    @iOSXCUITFindBy(accessibility = "Log In Button")
    @FindBy(id = "wp-submit") public WebElement
        sign_in;

    @CacheLookup
    @AndroidFindBy(id = "org.wordpress.android:id/nux_url")
    @iOSXCUITFindBy(xpath = ".//*[@value='Site Address (URL)']")
    public WebElement server_url;
}
