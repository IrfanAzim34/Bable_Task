package com.bable.step_definitions;

import com.bable.pages.BableForCitiesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Services_Steps {

    BableForCitiesPage bableForCitiesPage = new BableForCitiesPage();

    @Given("user move the mouse on Services section")
    public void userMoveTheMouseOnServicesSection() {
        bableForCitiesPage.moveToServices();
    }

    @Given("user click BABLE For Cities button")
    public void userClickBABLEForCitiesButton() {
        bableForCitiesPage.bableForCitiesBtn.click();
    }

    @And("user should see all contents about BABLE for Cities")
    public void userShouldSeeAllContentsAboutBABLEForCities() {
        bableForCitiesPage.allContentsDisplayed();
    }
}
