Feature:Verify Log In and Out function as expected
  @login&out @smoke
  Scenario:Verify user can successfully log in and out
    Given user click logIn btn on homepage
    And user should see login page
    And user input valid credentials and click login
    Then user should see dashboard page
    And user click logOut btn
    Then user should see login page