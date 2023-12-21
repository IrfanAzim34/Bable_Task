package com.bable.step_definitions;

import com.bable.pages.BableAcademyPage;
import com.bable.pages.BableForCitiesPage;
import com.bable.pages.BableForCompaniesPage;
import com.bable.pages.BableForNetworksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ServicesSections_Steps {

    BableForCitiesPage bableForCitiesPage = new BableForCitiesPage();
    BableForCompaniesPage bableForCompaniesPage = new BableForCompaniesPage();
    BableForNetworksPage bableForNetworksPage = new BableForNetworksPage();
    BableAcademyPage bableAcademyPage = new BableAcademyPage();

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

    @Given("user click BABLE For Companies button")
    public void userClickBABLEForCompaniesButton() {
        bableForCompaniesPage.bableForCompaniesBtn.click();
    }

    @Then("user should see all contents about BABLE For Companies")
    public void userShouldSeeAllContentsAboutBABLEForCompanies() {
        bableForCompaniesPage.allContentsDisplayed();
    }

    @Given("user click BABLE For Networks button")
    public void userClickBABLEForNetworksButton() {
        bableForNetworksPage.bableForNetworksBtn.click();
    }

    @Then("user should see all contents about BABLE For Networks")
    public void userShouldSeeAllContentsAboutBABLEForNetworks() {
        bableForNetworksPage.allContentsDisplayed();
    }

    @Given("user click BABLE Academy button")
    public void userClickBABLEAcademyButton() {
        bableAcademyPage.bableForAcademyBtn.click();
    }

    @Then("user should see all contents about BABLE Academy")
    public void userShouldSeeAllContentsAboutBABLEAcademy() {
        bableAcademyPage.allContentsDisplayed();
    }
}
