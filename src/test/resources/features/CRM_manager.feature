Feature: User should be able to log in as CRM manager

  Agile Story:
  As POS and eventCRM manager, I should be able to Login with valid credentials.
@US107
  Scenario: CRM manager is able to log in with valid credentials
    When user enters valid email "eventscrmmanager10@info.com" enters password "eventscrmmanager"
    Then user is should be able to access to main page
    And see "EventsCRMManager10" as account holder name
