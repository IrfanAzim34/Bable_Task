Feature: Verify all "Services" functions as expected

  Background:
    Given user move the mouse on Services section
  @wip
  Scenario: Verify BABLE For Cities function
    Given user click BABLE For Cities button
    And user should see "BABLE For Cities" title
    Then user should see all contents about BABLE for Cities