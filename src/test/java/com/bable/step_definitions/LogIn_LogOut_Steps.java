package com.bable.step_definitions;

import com.bable.pages.LogInPage;
import com.bable.pages.MyBablePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LogIn_LogOut_Steps {

    LogInPage logInPage = new LogInPage();
    MyBablePage myBablePage = new MyBablePage();

    @Given("user click logIn btn on homepage")
    public void userClickLogInBtnOnHomepage() {
        logInPage.logInHomePageBtn.click();
        Assert.assertTrue(logInPage.logInBtn.isDisplayed());
    }

    @And("user should see login page")
    public void userShouldSeeLoginPage() {
        Assert.assertTrue(logInPage.logInPageIsDisplayed());
    }

    @And("user input valid credentials and click login")
    public void userInputValidCredentialsAndClickLogin() {
        logInPage.logIn();
    }

    @Then("user should see profile page")
    public void userShouldSeeProfilePage() {
        Assert.assertTrue(myBablePage.profilePageIsOpened());
    }

    @And("user click logOut btn")
    public void userClickLogOutBtn() {
        myBablePage.logOut();
    }
}
