package com.appium.steps;

import com.appium.config.UserCredentials;
import com.appium.pages.CommentPage;
import com.appium.pages.LoginPage;
import com.appium.pages.PostPage;
import com.appium.pages.WelcomePage;
import com.cucumber.listener.ExtentCucumberFormatter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * Created by saikrisv on 22/04/16.
 */
public class MyStepdefs extends ExtentCucumberFormatter {

    LoginPage loginPage;
    UserCredentials credentials;
    String userNameLoggedIn;
    PostPage postpage;
    WelcomePage welcomePage = new WelcomePage(getDriver());
    CommentPage commentsPage;

    @Given("^i'm on landing page$") public void splashScreen() {
        System.out.println("Waiting for login screen");
    }

    @When("^i login with valid credentials") public void iLoginWithValidCredentails()
        throws Throwable {
        loginPage = new LoginPage(getDriver());
        credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
        userNameLoggedIn =
            loginPage.enterValidCredentails(credentials.getUserName(), credentials.getPassWord())
                .waitForWelcomePage().verifyUserIsLoggedIn();

    }

    @Then("^i should see the welcome page$") public void iShouldSeeTheWelcomePage()
        throws Throwable {
        Assert.assertEquals(userNameLoggedIn, "vodqademo");
    }

    @When("^i login with invalid credentials$") public void iLoginWithInvalidCredentials()
        throws Throwable {
        loginPage = new LoginPage(getDriver());
        credentials = new UserCredentials("vodqa123@gmail.com", "Hello12342225678");
        loginPage.enterValidCredentails(credentials.getUserName(), credentials.getPassWord());

    }

    @Then("^i should see validation message$") public void iShouldSeeValidationMessage()
        throws Throwable {
        String userNameLoggedIn = loginPage.validateErrorMessage();
        Assert.assertEquals(userNameLoggedIn, "The username or password you entered is incorrect");
    }

    @And("^i write post and publish$") public void iWritePostAndPublish() throws Throwable {
        welcomePage = new WelcomePage(getDriver());
        postpage =
            welcomePage.waitForWelcomePage().writePost().writeContentAndPublish().clickPostPage();
    }

    @Then("^i should see the post published successfully$")
    public void iShouldSeeThePostPublishedSuccessfully() throws Throwable {
        Assert.assertTrue(postpage.verifyPostIsSuccessfull());
        ;
    }

    @And("^i delete the post published$") public void iDeleteThePostPublished() throws Throwable {
        postpage = welcomePage.waitForWelcomePage().clickPostPage().deletePost();

    }

    @Then("^i should not see the published post anymore$")
    public void iShouldNotSeeThePublishedPostAnymore() throws Throwable {
        Assert.assertEquals(postpage.verifyPostIsDeleted(), "Deleting post");
    }

    @And("^i add comments to the published post$") public void iAddCommentsToThePublishedPost()
        throws Throwable {
        commentsPage = welcomePage.waitForWelcomePage().clickComments().enterComments();
    }

    @Then("^i should see the comment saved$") public void iShouldSeeTheCommentSaved()
        throws Throwable {
        Assert.assertTrue(commentsPage.verifyCommentIsAdded());
    }
}

