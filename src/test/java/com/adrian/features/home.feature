@Home
Feature: Home

  #FILTER NAME AND PRICE
  @positive-home-test
  Scenario: Can apply a filter to sort the product names from Z to A
    Given user already signed in and on the home page
    When user click filter button
    And user select Name(Z to A)
    Then The product names will be shown from Z to A

  @positive-home-test
  Scenario: User can apply a filter to sort the product prices from low to high
    Given user already signed in and on the home page
    When user click filter button
    And User click Price(low to high)
    Then The product prices will be shown from low to high

  @positive-home-test
  Scenario: User can apply a filter to sort the product prices from high to low
    Given user already signed in and on the home page
    When user click filter button
    And User click Price(high to low)
    Then The product prices will be shown from high to low

  #SIDEBAR MENU
  @positive-home-test
  Scenario: User can see information about the company
    Given user already signed in and on the home page
    When user click menu button
    And user click about sidebar
    Then the user can see the company information on the website

  @positive-home-test
  Scenario: User can do Logout
    Given user already signed in and on the home page
    When user click menu button
    And user click Logout sidebar
    Then user successfully logged out and will be directed back to the login page

  @positive-home-test
  Scenario: User can reset the application state
    Given user already signed in and on the home page
    When user click menu button
    And user click all Add to cart button
    And user click Reset App State sidebar
    Then the user preferences should be reset to default settings