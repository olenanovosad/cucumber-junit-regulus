@story02 @regression
Feature: ERP login feature

  User Story:
  As a user, I should be able to access all the features on the login page.


  Scenario Outline: Log in with valid credentials
    Given User is on log in page
    When user enters valid "<emails>"
    And user enters valid password "posmanager"
    Then user should see the dashboard and see title "Odoo"
    Examples:
      | emails                |
      | posmanager10@info.com |
      | posmanager13@info.com |
      | posmanager11@info.com |

@wip
  Scenario Outline: Log in with invalid credentials
    Given User is on log in page
    When user enters invalid email "<emails>"
    And user enters invalid password "<passwords>"
    Then user should see message "Wrong login/password"
    Examples:
      | emails               |  | passwords |
      | abd@gmail.com        |  | 123456ab  |
      | Abc@gmail.com        |  | jdfhg123  |
      | postmanaer13@info.ca |  | posm      |