@cart
Feature: Add items to cart and place an order

  Scenario: Add a phone and a laptop to the cart and successfully place an order
    Given User is logged in on the DemoBlaze page
    When User adds one phone to the cart
    And User adds a laptop to the cart
    When User proceeds to place the order
    And User fills in the order details
      | name        | country | city   | creditCard     | month | year |
      | Agon Musliu | Kosova  | Gjilan | 1234-5678-9012 | 12    | 2024 |
    And User confirms the order
    Then a confirmation message should appear with the order ID
