Feature: User should be able to access to calendar page
@US109 @regression
  Scenario: verify user can get time list by default
    Given User is logged in
    When user click "Calendar" menu option
    Then user is on calendar page
    And user sees following time list by default
      | 0:00 |
      | 1:00 |
      | 2:00 |
      | 3:00 |
      | 4:00 |
      | 5:00 |
      | 6:00 |
      | 7:00 |
      | 8:00 |
      | 9:00 |
      | 10:00 |
      | 11:00 |
      | 12:00 |
      | 13:00 |
      | 14:00 |
      | 15:00 |
      | 16:00 |
      | 17:00 |
      | 18:00 |
      | 19:00 |
      | 20:00 |
      | 21:00 |
      | 22:00 |
      | 23:00 |





