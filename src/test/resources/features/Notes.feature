Feature: Create a new note feature

  User Story:
  As a user, I should be able to create a note and assign it to the different timeline.

  @AC1US08
  Scenario: Verify the users can create notes.
    Given User is logged in notes page
    When user clicks create button
    Then user sees "New - Odoo" in the title
    When user selects from existing tags
    And user types in the text box
    And user selects different options from timeline
    And user clicks save button
    Then user sees Note Created message is displayed
    When user clicks Notes module button
    Then user is Notes page and sees created note displayed

  @AC2US08
  Scenario: Verify user can drag and drop note
    Given User is logged in notes page
    When user is Notes page and sees created note displayed
    Then user is able to drag and drop new note under each timeline


