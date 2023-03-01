@story13
Feature: Verify create an order feature

  User story:As a Point of Sale manager (POS), I should be able to create manufacturing orders

  @AC1US13
  Scenario: user creates new manufacturing order
    Given user is logged in on Manufacturing page
    When user clicks create
    Then user sees New order page
    When user fills in all fields
    And user clicks Save button
    Then user sees order confirmation message displayed

