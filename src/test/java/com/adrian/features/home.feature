@Home
Feature: Home

  #FILTER NAME AND PRICE
  @positive-test
  Scenario: User can apply a filter to sort the product names from Z to A
    Given user already signed in and on the homepage
    When user click filter button
    And user select Name(Z to A)
    Then The product names will be shown from Z to A

  @positive-test
  Scenario: User can apply a filter to sort the product prices from low to high
    Given user already signed in and on the homepage
    When user click filter button
    And User click Price(low to high)
    Then The product prices will be shown from low to high

  @positive-test
  Scenario: User can apply a filter to sort the product prices from high to low
    Given user already signed in and on the homepage
    When user click filter button
    And User click Price(high to low)
    Then The product prices will be shown from high to low