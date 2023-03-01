@regression
Feature:Verify the POS managers can submit expenses

  User story:As a Point of Sale manager (POS), I should be able to submit expenses
  @US14
  Scenario: user  is able to create and submit expenses
    Given User is logged in
    When user selects expenses option
    And user clicks Create button
    Then user should see expenses description page
    When user fill out all fields
    And clicks save button
    Then user should see confirmation info
    And expenses info
