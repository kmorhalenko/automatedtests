Feature:
  Test suite number 3
  Testing of profile settings

  Background:
    Given the user is on the Chat login page
    Given login under the user

  Scenario: 03.001 Validation of fields of profile
    When chat has been opened
    When user opened profile settings
    When type to field "firstName" value "12345"
    Then error messages show
    When clear field "firstName"
    When type to field "lastName" value "131456"
    Then error messages show
    When clear field "lastName"
    When type to field "skype" value "12345"
    Then error messages show
    When clear field "skype"
    When type to field "firstName" value "БВгЕ"
    Then error messages show
    When clear field "firstName"
    When type to field "lastName" value "РОоыф"
    Then error messages show
    When clear field "lastName"
    When type to field "skype" value "БВгЕ"
    Then error messages show
    When clear field "skype"
    When type to field "firstName" value "QW"
    Then error messages show
    When clear field "firstName"
    When type to field "lastName" value "RE"
    Then error messages show
    When clear field "lastName"
    When type to field "skype" value "WE"
    Then error messages show
    When clear field "skype"
    When type to field "firstName" value "@wLc"
    Then error messages show
    When clear field "firstName"
    When type to field "lastName" value "@Ffa "
    Then error messages show
    When clear field "lastName"
    When type to field "skype" value "@wLc"
    Then error messages show
    When clear field "skype"

  Scenario: 03.002 Validation of fields of profile
    When chat has been opened
    When user opened profile settings
    When type to field "phone" value "abcf"
    Then error messages show
    When clear field "phone"
    When type to field "phone" value "@@!#"
    Then error messages show
    When clear field "phone"
    When type to field "phone" value "12"
    Then error messages show
    When clear field "phone"
    When type to field "phone" value "123456789012345678901"
    Then error messages show
    When clear field "phone"

  Scenario: 03.003 Save changes on profile
    When chat has been opened
    When user opened profile settings
    When type to field "firstName" value "Q12@m.K"
    When click button save
    When user opened profile settings
    Then "firstName" field should have "Q12@m.K" value
    When type to field "lastName" value "Q13@m.K"
    When click button save
    When user opened profile settings
    Then "lastName" field should have "Q13@m.K" value
    When type to field "phone" value "123"
    When click button save
    When user opened profile settings
    Then "phone" field should have "123" value
    When type to field "phone" value "12345678901234567890"
    When click button save
    When user opened profile settings
    Then "phone" field should have "12345678901234567890" value
    When type to field "skype" value "Q14@m.K"
    When click button save
    When user opened profile settings
    Then "skype" field should have "Q14@m.K" value
    When type to field "whatIDo" value "I work"
    When click button save
    When user opened profile settings
    Then "whatIDo" field should have "I work" value
    When type to field "whereIAm" value "I`m on earth"
    When click button save
    When user opened profile settings
    Then "whereIAm" field should have "I`m on earth" value

  Scenario: 03.004 Save empty field on profile
    When chat has been opened
    When user opened profile settings
    When clear field "firstName"
    When clear field "lastName"
    When clear field "phone"
    When clear field "skype"
    When clear field "whereIAm"
    When clear field "whatIDo"
    When click button save
    When user opened profile settings
    Then "firstName" field should have "" value
    Then "lastName" field should have "" value
    Then "phone" field should have "" value
    Then "skype" field should have "" value
    Then "whatIDo" field should have "" value
    Then "whereIAm" field should have "" value

  Scenario: 03.005 Change avatar by user (support format)
    When chat has been opened
    When user opened profile settings
    When user choose "1.jpeg" avatar
    When user click avatar save button
    When src of first picture
    When user choose "test.jpg" avatar
    When user click avatar save button
    When src of second picture
    Then Avatar is changed

  Scenario: 03.006 Change avatar by user (support format)
    When chat has been opened
    When user opened profile settings
    When user choose "2.jpeg" avatar
    When user click avatar save button
    When src of first picture
    When user choose "test.bmp" avatar
    When user click avatar save button
    When src of second picture
    Then Avatar is changed

  Scenario: 03.007 Change avatar by user (incorrect format)
    When chat has been opened
    When user opened profile settings
    When user choose "3.jpeg" avatar
    When user click avatar save button
    When src of first picture
    When user choose "test.gif" avatar
    When src of second picture
    Then avatar is not changed
    Then error message for avatar is show

  Scenario: 03.008 Change avatar by user (incorrect format)
    When chat has been opened
    When user opened profile settings
    When user choose "4.jpeg" avatar
    When user click avatar save button
    When src of first picture
    When user choose "test.ico" avatar
    When src of second picture
    Then avatar is not changed
    Then error message for avatar is show

  Scenario: 03.009 Change avatar by user (incorrect format)
    When chat has been opened
    When user opened profile settings
    When user choose "5.jpeg" avatar
    When user click avatar save button
    When src of first picture
    When user choose "TestOver10MB.jpg" avatar
    When src of second picture
    Then avatar is not changed
    Then error message for avatar is show

  Scenario: 03.0010 Change timezone in profile settings and not saved it
    When chat has been opened
    When user opened profile settings
    When change timezone and not save
    When click back icon in user menu
    When user opened profile settings
    Then new timezone is not saved


  Scenario: 03.010 Change timezone in profile settings
    When chat has been opened
    When user opened profile settings
    When change timezone
    Then new timezone is saved