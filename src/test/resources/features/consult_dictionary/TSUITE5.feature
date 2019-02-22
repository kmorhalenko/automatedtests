Feature: Changing accaunt settings

  Scenario: 05.001 Change email on email existing user
    Given the user is on the Chat login page
    Given login under the user
    Then chat has been opened
    Given open page "https://192.168.217.23/index.html#/chat/settings/account"
    Then accaunt settings page is opened
    When type to field "email" value "k_test1@rambler.ru"
#                                      email of exist user
    When click button save for "Email:" field
    Then error messages show
    And confirmation code is not send

  Scenario: 05.002 Change user email address with incorrect confirmation code
    Given the user is on the Chat login page
    Given login under the user
    Then chat has been opened
    Given open page "https://192.168.217.23/index.html#/chat/settings/account"
    Then accaunt settings page is opened
    When type to field "email" value "k_test7@rambler.ru"
#                                      email of exist user
    When click button save for "Email:" field
    When type to field "confirmCode" value "qwe123"
    When click button save for "Code confirmations:" field
    Then error messages show


  Scenario: 05.003 Change password (not valid value old password)
    Given the user is on the Chat login page
    Given login under the user
    Then chat has been opened
    Given open page "https://192.168.217.23/index.html#/chat/settings/account"
    Then accaunt settings page is opened
    When type to field "password" value "123456"
    When type to field "password2" value "q123456"
    Then error message "Password must contains one or more letters" is showed
    And button save for passwords fields unusable

  Scenario: 05.004 Change password (incorroct old password)
    Given the user is on the Chat login page
    Given login under the user
    Then chat has been opened
    Given open page "https://192.168.217.23/index.html#/chat/settings/account"
    Then accaunt settings page is opened
    When type to field "password" value "qq123456"
    When type to field "password2" value "q123456"
    When click button save for "New password:" field
    Then error message for passwords fields is showed

  Scenario: 05.005 Change password (same value)
    Given the user is on the Chat login page
    Given login under the user
    Then chat has been opened
    Given open page "https://192.168.217.23/index.html#/chat/settings/account"
    Then accaunt settings page is opened
    When type to field "password" value "qq123456"
    When type to field "password2" value "qq123456"
    Then error message "Passwords must not be identical!" is showed
    And button save for passwords fields unusable

  Scenario: 05.005 Change password (correct value)
    Given the user is on the Chat login page
    Given login under the user
    Then chat has been opened
    Given open page "https://192.168.217.23/index.html#/chat/settings/account"
    Then accaunt settings page is opened
    When type to field "password" value "m7118056"
    When type to field "password2" value "qwerty12345"
    When click button save for "New password:" field
    When user log out of chat
    Then login page open
    When type to field "login" value "k.test2019@gmail.com"
    When type to field "password" value "qwerty12345"
    When Click button submit
    Then chat has been opened
#    Change password to default for this user
    Given open page "https://192.168.217.23/index.html#/chat/settings/account"
    Then accaunt settings page is opened
    When type to field "password" value "qwerty12345"
    When type to field "password2" value "m7118056"
    When click button save for "New password:" field
    Then message about changed password is showed

  Scenario: 05.006 Changing the username to the username who be in database
    Given the user is on the Chat login page
    Given login under the user
    Then chat has been opened
    Given open page "https://192.168.217.23/index.html#/chat/settings/account"
    Then accaunt settings page is opened
    When type to field "username" value "k.test2"
    When click button save for "Username" field
    Then user name in user menu is changed to "k.test"
    Then message about changed username is not showed

  Scenario: 05.007 Changing the username to the username who not be in database
    Given the user is on the Chat login page
    Given login under the user
    Then chat has been opened
    Given open page "https://192.168.217.23/index.html#/chat/settings/account"
    Then accaunt settings page is opened
    When type to field "username" value "user_123456"
    When click button save for "Username" field
#    Then message about changed username is showed
    Then user name in user menu is changed to "user_123456"
#      Change user name to default for this user
    When type to field "username" value "k.test"
    When click button save for "Username" field
#    Then message about changed username is showed
    Then user name in user menu is changed to "k.test"


    
