@cart_calculation
Feature: Validate cart total calculation

  Scenario: Cart total updates correctly when multiple products are added
    Given User logs into the DemoBlaze page
    And User adds multiple products to the cart
    When User opens the cart
    Then the cart total should match the sum of added products