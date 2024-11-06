@product_price
Feature: Validate product price consistency

  Scenario: Price on Dashboard matches the product detail page
    Given User is already on the DemoBlaze homepage
    When User selects a product
    Then the price displayed on the product page should match the price on the Dashboard