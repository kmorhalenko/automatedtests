Feature: Check login page


  Scenario: 01.001 go to chat
    Given the user is on the Chat login page
    When login under the user
    Then chat has been opened

  Scenario: 01.002 log out of chat
    Given the user is on the Chat login page
    When login under the user
    When chat has been opened
    When user log out of chat
    Then login page open

  Scenario: 01.003 clicability of singin button (without value)
    Given the user is on the Chat login page
    When login field clear
    When password field clear
    When button submit unusable
    Then error messages show
    Then login page open

  Scenario: 01.004 Log in on the system with incorrect login and password.
    Given the user is on the Chat login page
    When  User enter incorrect email
    When  User enter incorrect password
    When  Click button submit
    Then error unauthorized message show
    Then login page open

  Scenario: 01.005 Login to chat with login which have special characters
    Given the user is on the Chat login page
    When User enter login with special characters
    When User enter correct password
    When button submit unusable
    Then error messages only latin show
    Then login page open

  Scenario: 01.006Login to chat with password which have cyrillic characters
    Given  the user is on the Chat login page
    When User enter login with cyrillic characters
    When User enter correct password
    When button submit unusable
    Then error messages only latin show
    Then login page open

  Scenario: 01.007 Check show icon
    Given  the user is on the Chat login page
    When User enter correct password
    When User enter incorrect email
    When Click button submit
    When Hold icon show password
    Then Password is not visible


