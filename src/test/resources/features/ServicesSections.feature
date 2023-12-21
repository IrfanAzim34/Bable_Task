@services
Feature: Verify all "Services" functions as expected

  Background:
    Given user move the mouse on Services section

  Scenario: Verify BABLE For Cities function
    Given user click BABLE For Cities button
    And user should see "BABLE For Cities" title
    Then user should see all contents about BABLE for Cities


  Scenario: Verify BABLE For Companies function
    Given user click BABLE For Companies button
    And user should see "BABLE For Companies" title
    Then user should see all contents about BABLE For Companies

  Scenario: Verify BABLE For Networks function
    Given user click BABLE For Networks button
    And user should see "BABLE For Networks" title
    Then user should see all contents about BABLE For Networks

  Scenario: Verify BABLE Academy function
    Given user click BABLE Academy button
    And user should see "BABLE Academy" title
    Then user should see all contents about BABLE Academy