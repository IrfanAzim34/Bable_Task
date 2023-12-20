@aboutBable
Feature: Verify all "About BABLE" functions as expected

  Background:
    Given user move the mouse on About BABLE section

  Scenario: Verify About Us section
    Given user click About Us button
    And user should see "About Us" title
    Then user should see all contents about About Us

  Scenario: Verify BABLE Events section
    Given user click BABLE Events button
    And user should see "BABLE Events" title
    Then user should see all contents about BABLE Events

  Scenario: Verify Newsroom section
    Given user click Newsroom button
    And user should see "Newsroom" title
    Then user should see all contents about Newsroom

  Scenario: Verify CIVINET Iberia section
    Given user click CIVINET Iberia button
    And user should see "CIVINET" title
    Then user should see all contents about CIVINET Iberia
