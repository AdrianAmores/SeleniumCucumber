Feature: Add product to shopping cart

  Scenario: Products successfully added to the shopping cart
    Given User is on Home Page
    When  User search product
    And User add product to shopping cart and move to Home Page
    When User search another product
    And User add product to shopping cart
    Then User checks that the products have been added to the shopping cart
