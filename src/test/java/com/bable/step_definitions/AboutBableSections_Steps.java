package com.bable.step_definitions;

import com.bable.pages.AboutUsPage;
import com.bable.pages.BableEventsPage;
import com.bable.pages.CivinetIberia;
import com.bable.pages.Newsroom;
import com.bable.utils.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AboutBableSections_Steps {

    AboutUsPage aboutUsPage = new AboutUsPage();
    BableEventsPage bableEventsPage = new BableEventsPage();

    Newsroom newsroom = new Newsroom();
    CivinetIberia civinetIberia = new CivinetIberia();

    @Given("user move the mouse on About BABLE section")
    public void userMoveTheMouseOnAboutBABLESection() {
        aboutUsPage.moveToAboutBable();
    }

    @Given("user click About Us button")
    public void userClickAboutUsButton() {
        aboutUsPage.aboutUsBtn.click();
    }


    @Then("user should see {string} title")
    public void userShouldSeeTitle(String title) {
        BrowserUtils.verifyTitle(title);
    }

    @Then("user should see all contents about About Us")
    public void userShouldSeeAllContentsAboutAboutUs() {
        aboutUsPage.verifyAllContentsDisplayed();
    }

    @Given("user click BABLE Events button")
    public void userClickBABLEEventsButton() {
        bableEventsPage.bableEventsBtn.click();
    }

    @Then("user should see all contents about BABLE Events")
    public void userShouldSeeAllContentsAboutBABLEEvents() {
        bableEventsPage.searchBoxAndBtnDisplayed();
    }

    @Given("user click Newsroom button")
    public void userClickNewsroomButton() {
        newsroom.newsRoomBtn.click();
    }

    @Then("user should see all contents about Newsroom")
    public void userShouldSeeAllContentsAboutNewsroom() {
        newsroom.allContentsDisplayed();
    }

    @Given("user click CIVINET Iberia button")
    public void userClickCIVINETIberiaButton() {
        civinetIberia.civinetIberiaBtn.click();
    }

    @Then("user should see all contents about CIVINET Iberia")
    public void userShouldSeeAllContentsAboutCIVINETIberia() {
        civinetIberia.allContentsDisplayed();
    }
}
