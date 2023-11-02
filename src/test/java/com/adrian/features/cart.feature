@Cart
Feature: Cart

  #ADD TO CART
  @positive-test
  Scenario: User can add a product to the cart from the homepage
    Given user already signed in and on the homepage
    When user click Add to cart button of Sauce Labs Backpack
    Then Sauce Labs Backpack is added to the cart

  @boundaries-test
  Scenario: User can add all product to the cart from the homepage
    Given user already signed in and on the homepage
    When user click all Add to cart button
    Then the products are added to the cart

  #REMOVE FROM CART
  @positive-test
  Scenario: User can remove the product from the cart from the homepage
    Given user already signed in and on the homepage
    When user click all Add to cart button
    And user click all Remove button
    Then the products are all removed from the cart
