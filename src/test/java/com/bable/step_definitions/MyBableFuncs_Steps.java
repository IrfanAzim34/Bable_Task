package com.bable.step_definitions;

import com.bable.pages.MyBablePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MyBableFuncs_Steps {

    MyBablePage myBablePage = new MyBablePage();

    @Given("user click Open Profile button")
    public void userClickOpenProfileButton() {
        myBablePage.openProfileBtn.click();
    }

    @And("user should see profile page")
    public void userShouldSeeProfilePage() {
        Assert.assertTrue(myBablePage.myProfileArea.isDisplayed());
    }

    @Then("user should back to dashboard page")
    public void userShouldBackToDashboardPage() {
        myBablePage.openDashboardBtn.click();
        myBablePage.dashboardPageIsOpened();
    }

    @Given("user click Edit Profile button")
    public void userClickEditProfileButton() {
        myBablePage.editProfileBtn.click();
    }

    @And("user should see user general data area")
    public void userShouldSeeUserGeneralDataArea() {
        Assert.assertTrue(myBablePage.generalDataArea.isDisplayed());
    }


    @And("user should successfully back to dashboard")
    public void userShouldSuccessfullyBackToDashboard() {
        myBablePage.editPageBackwardBtn.click();
        myBablePage.dashboardPageIsOpened();
    }
}
