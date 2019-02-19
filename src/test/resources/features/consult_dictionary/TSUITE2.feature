Feature:
  Test suite number 2
  Testing of registration form


  Scenario: 02.001 Submit button on page 1 of registration is not active
    Given registration page one is open
    When  input field email on page one of registration is empty
    When  click button submit page one of registration
    Then  page one of registration is opened

  Scenario: 02.002 Checking clickability of cancel button page of registration 1
    Given registration page one is open
    When  click button cancel
    Then  login page open

  Scenario Outline: 02.004 Email field validation
    Given registration page one is open
    When User enter following email "<value>"
    When click button submit page one of registration
    Then Error message has been shown
    Examples:
      | value              |
      | QWE&&!!)(@mail.ty  |
      | qwerty@gmail.a     |
      | qwerty@gmail.comma |
      | qwerty@@gmail.com  |
      | 564                |

  Scenario: 02.005 Check clickabulity of SUBMIT button registration page 2
    Given registration page one is open
    When user enter valid email on the registration page
    When click button submit page one of registration
    When click button submit second page of registration
    Then page two of registration is opened

  Scenario: 02.006 Input to the field "Email confirmation code" uncorect code
    Given registration page one is open
    When user enter valid email on the registration page
    When click button submit page one of registration
    When type to confirmation code field "1234567890"
    When type to login field "user"
    When type to password one field "q123456"
    When type to password two field "q123456"
    When click button submit second page of registration
    Then button submit unusable
    Then page two of registration is opened

  Scenario: 02.007 Field "Email confirmation code" is empty
    Given registration page one is open
    When user enter valid email on the registration page
    When click button submit page one of registration
    When type to login field "user"
    When type to password one field "q123456"
    When type to password two field "q123456"
    When click button submit second page of registration
    Then button submit unusable
    Then page two of registration is opened

  Scenario Outline: 02.008 Validation email field on form of registration page 2
    Given registration page one is open
    When user enter valid email on the registration page
    When click button submit page one of registration
    When type to login field "<value>"
    When type to password one field "q123456"
    When type to password two field "q123456"
    Then error messages show
    When click button cancel

    Examples:
      | value                        |
      | qw                           |
      | q1234567890qwertyuiopqwerssa |
      | 1qwerty                      |
      |                              |
      | a!@#$%^&*()_+                |

  Scenario Outline: 02.009 Validation passwords fields on form of registration page 2
    Given registration page one is open
    When user enter valid email on the registration page
    When click button submit page one of registration
    When type to password one field "<value>"
    When type to password two field "<value>"
    When type to login field "zaebis"
    Then error messages show
    When button submit unusable
    When click button cancel

    Examples:
      | value                     |
      | qwerty                    |
      | 1@34%6                    |
      | qwertyuiopasdfghjkl123456 |
      | 123456^                   |

  Scenario Outline: 02.010 Validation passwords fields on form of registration page 2
    Given registration page one is open
    When user enter valid email on the registration page
    When click button submit page one of registration
    When type to password one field "<value>"
    When type to password two field "<value2>"
    When type to login field "zaebis"
    Then error messages show
    When button submit unusable
    When click button cancel

    Examples:
      | value   | value2  |
      | qw1234  | qw12345 |
      | qw12345 | qw1234  |

  Scenario Outline: 02.011 Checking sing in with incorrect password
    Given the user is on the Chat login page
    When type to login field "<value>"
    When type to password one field "<value2>"
    When Click button submit
    Then error unauthorized message show

    Examples:
      | value               | value2    |
      | k_test2@rambler.ru  | m71180566 |
      | K_test22@rambler.ru | m27118056 |
      | k_test2@rambler.ru  | ь27118056 |



  Scenario: 02.012 Checking sing in with incorrect password
    Given the user is on the Chat login page
    When type to login field "л_еуче2@куьидукюкг"
    When type to password one field "m27118056"
    Then button submit unusable
    Then login page open
