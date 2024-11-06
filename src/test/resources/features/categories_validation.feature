@categories
Feature: Validate Categories Functionality

  Scenario: Check Categories Option on Dashboard
    Given User is on the DemoBlaze page
    When User views the categories on the Dashboard
    Then the categories "Phones", "Laptops", and "Monitors" should be present