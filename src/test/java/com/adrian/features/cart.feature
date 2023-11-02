@AddItem
Feature: Add Item to Cart

  #Add Item
  @positive-item-test
  Scenario: Adding one item to a cart
    Given user on the inventory page
    When user add one item to the cart
    Then user have one item in my cart

  @positive-item-test
  Scenario: Adding one item to a cart
    Given user on the inventory page
    When user add two item to the cart
    Then user have two item in my cart
