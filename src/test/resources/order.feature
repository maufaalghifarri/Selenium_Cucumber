@orderSauceLabsBackpack
Feature: Login Feature

  @add-orderSauceLabsBackpack
  Scenario: User success to add Sauce Labs Backpack to chart
    Given user is on the login page
    And user input email text box with "standard_user"
    And user input password text box with "secret_sauce"
    And user click login button
    When user is on the home page
    And user sees the Sauce Labs Backpack on the home page
    And user click add to cart button on Sauce Labs Backpack
    And user click cart symbol
    And user is on the cart page
    Then user sees the Sauce Labs Backpack on the cart page


  @remove-orderSauceLabsBackpack
  Scenario: User success to remove Sauce Labs Backpack
    Given user is on the login page
    And user input email text box with "standard_user"
    And user input password text box with "secret_sauce"
    And user click login button
    When user is on the home page
    And user sees the Sauce Labs Backpack on the home page
    And user click add to cart button on Sauce Labs Backpack
    And user click cart symbol
    And user is on the cart page
    Then user sees the Sauce Labs Backpack on the cart page
    And user click remove on the Sauce Labs Backpack product
