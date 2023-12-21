package com.bable.step_definitions;

import com.bable.pages.HomePage;
import com.bable.pages.SearchPage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class HomePageFuncs_Steps {

    Faker faker = new Faker();
    static String searchValue = null;

    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();

    @Given("user click search button")
    public void userClickSearchButton() {
        homePage.searchBtn.click();
    }


    @And("user search any type of info")
    public void userSearchAnyTypeOfInfo() {
        Assert.assertTrue(homePage.homePageSearchBar.isDisplayed());
        searchValue = faker.address().cityName();
        homePage.homePageSearchBar.sendKeys(searchValue + Keys.ENTER);
        Assert.assertTrue(searchPage.searchResultArea.isDisplayed());
    }

    @Then("user should see search result")
    public void userShouldSeeSearchResult() {
        Assert.assertTrue(searchPage.searchResultArea.isDisplayed());
    }
}
