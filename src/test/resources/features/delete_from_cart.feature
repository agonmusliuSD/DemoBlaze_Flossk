@delete
Feature: Delete an item from cart

  Scenario: User deletes an item from the cart successfully
    Given User is logged in on the DemoBlaze homepage
    And User adds a phone to the cart
    And User views the cart
    When User deletes the phone from the cart
    Then the cart should be empty