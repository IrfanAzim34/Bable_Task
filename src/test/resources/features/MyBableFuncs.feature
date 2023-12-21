@myBable@smoke
Feature: Verify My Bable page functions as expected

  Background: Log In to My Bable page
    Given user click logIn btn on homepage
    And user should see login page
    And user input valid credentials and click login
    Then user should see dashboard page

    Scenario: Verify Open Profile function
      Given user click Open Profile button
      And user should see profile page
      Then user should back to dashboard page

      Scenario: Verify Edit Profile function
        Given user click Edit Profile button
        And user should see user general data area
        And user should successfully back to dashboard