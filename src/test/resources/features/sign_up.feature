@sign_up
Feature: User Registration

  Scenario: User signs up
    Given User signs up on the DemoBlaze page
    And User clicks on Sign Up button
    When the user enters valid details and submits the form
    Then the user should be registered and see a confirmation message

