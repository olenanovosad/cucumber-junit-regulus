Feature: sales manager should be able to access to the different modules
  Agile story:
  As a sales manager, I should be able to access to the different modules.

@US104 @smoke
  Scenario: Verify the sales managers access to 19 modules
    Given User is logged in as Sales Manager
    Then User should see 19 modules
    And see "SalesManager10" as a user
