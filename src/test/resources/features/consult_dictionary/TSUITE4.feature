Feature: Checking notifications

  Scenario: 04.001 Check visualised of unread message icon
    Given the user is on the Chat login page
    Given login under the user
    Then chat has been opened
    When add user "k.test2" to direct list
    Then direct with user "k.test2" is opened
    When Send message with text "Hello friend"
    When delete direct with user "k.test2"
    Then direct with user "k.test2" is deleted from list
    When user log out of chat
    Then login page open
    When login under the user two
    Then chat has been opened
    Then user have unread messages from "k.test" user
    When Open unread message from user "k.test"
    Then icon about unread message from "k.test" is not displayed

  Scenario: 04.002 Сhecking of the clickability of the turn-off notification icon
    Given the user is on the Chat login page
    Given login under the user
    Then chat has been opened
    When User turn-off notifications
    Then user is have message about "Chat is muted"
    When User turn-on notifications
    Then user is have message about "Chat is unmuted"

  Scenario: 04.003 Send massage with notification off
    Given the user is on the Chat login page
    Then login page open
    When login under the user two
    Then chat has been opened
    When User turn-off notifications
    Then user is have message about "Chat is muted"
    When user log out of chat
    Given login under the user
    Then chat has been opened
    When add user "k.test2" to direct list
    Then direct with user "k.test2" is opened
    When Send message with text "Hello friend"
    When delete direct with user "k.test2"
    Then direct with user "k.test2" is deleted from list
    When user log out of chat
    Then login page open
    When login under the user two
    Then chat has been opened
    Then user have unread messages from "k.test" user
    When Open unread message from user "k.test"
    Then icon about unread message from "k.test" is not displayed
    When User turn-on notifications
    Then user is have message about "Chat is unmuted"

