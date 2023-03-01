@regression
Feature: Verify order list on the POS page

  User Story: Test Execution Ticket, As a Point of Sale manager (POS), I should be able to view product order.
@AC1US12
  Scenario: Verify POS manager can view order list and Action dropdown menu
    Given user is logged in POS page
    When user clicks Orders option
    And user selects Order Ref checkbox
    Then all orders should be selected
    And Action dropdown should be displayed



