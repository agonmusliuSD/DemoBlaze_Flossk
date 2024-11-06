
@login
Feature: User Login

  Scenario: Successful Login
    Given User is on the DemoBlaze page
    When User clicks on Login button
    And the user enters valid "username" and "password" and submits the form