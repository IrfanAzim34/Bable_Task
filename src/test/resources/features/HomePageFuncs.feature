@homePage
Feature: Verify HomePage functions as expected

  Scenario: Verify The Search function
    Given user click search button
    And user search any type of info
    Then user should see search result