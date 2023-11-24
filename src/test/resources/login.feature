Feature: Login Feature

  @success-login
  Scenario: Successful login
    Given user is on the login page
    When user input email text box with "standard_user"
    And user input password text box with "secret_sauce"
    And user click login button
    Then user is on the home page


  Scenario: Invalid login
    Given user is on the login page
    When user input email text box with "standard_user"
    And user input password text box with "invalid"
    And user click login button
    Then user is on the login page


