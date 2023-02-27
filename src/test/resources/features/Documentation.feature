Feature: Access to the Documentation Page
@AC1US16
  Scenario: Verify user can acces Doc page
    Given user is logged in
    When user clicks "POSManager10" button
    And user clicks "Documentation" option
    Then user sees  "documentation" in the url

