Feature: User should be able to get correct information on the Sales page
@US96 @regression @smoke
  Scenario: Verify sales manager is able to see 6 columns
    Given User is logged in as Sales Manager
    When User clicks Sales menu option
    Then User is on quotations page
    And user should see
      | Quotation Number |
      | Quotation Date   |
      | Customer         |
      | Salesperson      |
      | Total            |
      | Status           |
  Scenario: Verify sales manager is able to see 6 columns
    Given User is logged in as POS manager
    When User clicks Sales menu option
    Then User is on quotations page
    And user should see
      | Quotation Number |
      | Quotation Date   |
      | Customer         |
      | Salesperson      |
      | Total            |
      | Status           |