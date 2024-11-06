@send_message
Feature: Send a message

  Scenario: User sends a message successfully
    Given User opens the Contact form on the DemoBlaze page
    When User enters their email, name, and message
    And User sends the message
    Then A confirmation alert should appear