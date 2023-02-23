Feature: Create a new note feature

  User Story:
  As a user, I should be able to create a note and assign it to the different timeline.

  Scenario: Verify the users can create notes.
    Given User is on notes page
    When user clicks create button
    Then user sees "New - Odoo" in the title
    When user selects from existing tags
    And user types in the text box
    And user selects different options from timeline
    And user clicks save button
    Then user sees Note Created message is displayed
    When user clicks Notes module button
    Then user is Notes page and sees created note displayed

