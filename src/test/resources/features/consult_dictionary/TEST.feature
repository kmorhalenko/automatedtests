Feature: Check login page


  Scenario: 00.001 register new user
    Given registration page one is open
    When open new tab "https://temp-mail.org/ru/"
    When copy value of email to clipboard
    When switch to current tab "1"
    When paste temp mail from clipboard
    When click button submit page one of registration
    Then page two of registration is opened
    When switch to current tab "2"
    Then wait until mail with subject "Email confirmation" is come
    When open message by number "1"
    Then message has been open
    When copy confirmation code to clipboard
    When switch to current tab "1"
    When paste confirmation code to field
    When enter valid user name and passwords
    When click button submit second page of registration
    Then login page open
    When login under a random user
    Then chat has been opened


  Scenario: 00.002 Check resending of confirmation code Given registration page one is open
    Given registration page one is open
    When open new tab "https://temp-mail.org/ru/"
    When copy value of email to clipboard
    When switch to current tab "1"
    When paste temp mail from clipboard
    When click button submit page one of registration
    Then page two of registration is opened
    When switch to current tab "2"
    Then wait until mail with subject "Email confirmation" is come
    When put number of messages from mail into current session
    When switch to current tab "1"
    When click "Send again" link
    When switch to current tab "2"
    Then new message with subject "Email confirmation" is come

  Scenario: 00.003 Create user with username who exist in database
    Given registration page one is open
    When open new tab "https://temp-mail.org/ru/"
    When copy value of email to clipboard
    When switch to current tab "1"
    When paste temp mail from clipboard
    When click button submit page one of registration
    Then page two of registration is opened
    When switch to current tab "2"
    Then wait until mail with subject "Email confirmation" is come
    When open message by number "1"
    Then message has been open
    When copy confirmation code to clipboard
    When switch to current tab "1"
    When paste confirmation code to field
    When type to login field "k_test2"
    When type to password one field "qwerty123"
    When type to password two field "qwerty123"
    When click button submit second page of registration
    Then error messages show
    Then page two of registration is opened

  Scenario: 00.004 Checking of recovery password form (use generate password rof sing in)
    Given registration page one is open

#    Create temp mail
    When open new tab "https://temp-mail.org/ru/"
    When copy value of email to clipboard

#    Send confirmation code
    When switch to current tab "1"
    When paste temp mail from clipboard
    When click button submit page one of registration
    Then page two of registration is opened

#    Check that confirmation is come
    When switch to current tab "2"
    Then wait until mail with subject "Email confirmation" is come
    When put number of messages from mail into current session
    When open message by number "1"
    Then message has been open
    When copy confirmation code to clipboard

#    Registration by user
    When switch to current tab "1"
    When paste confirmation code to field
    When enter valid user name and passwords
    When click button submit second page of registration
    Then login page open

#    Check forgot password function
    When click "Forgot your password?" link
    When enter random email to field Email
    When click button by name "Send reset instructions"
    When switch to current tab "2"
    When update mail list in temp mail
    Then new message with subject "Recovery" is come
    When put number of messages from mail into current session
    When open last message in temp mail
    When copy generate password to clipboard

#    Change password to custom
    When switch to current tab "1"
    When type to field generated pass from clipboard
    When type to password one field "testpassword1"
    When type to password two field "testpassword1"
    When click button by name "Use custom pass"
    Then login page open
    When type to login field value of tamp mail
    When type to field "password" value "testpassword1"
    When click button by name "Sign In"
    Then chat has been opened
    When user log out of chat
    Then login page open

#    Check that message about changed password is come
    When switch to current tab "2"
    When update mail list in temp mail
    Then new message with subject "Password changed" is come
    When put number of messages from mail into current session

#    Check resend forgot password massage
    When switch to current tab "1"
    When click "Forgot your password?" link
    When enter random email to field Email
    When click button by name "Send reset instructions"
    When switch to current tab "2"
    Then new message with subject "Recovery" is come
    When open last message in temp mail
    When copy generate password to clipboard
    When switch to current tab "1"

#    Change password to generate
    When type to field generated pass from clipboard
    When click button by name "Use generated pass"
    Then login page open
    When type to login field value of tamp mail
    When type to password field generated password
    When click button by name "Sign In"
    Then chat has been opened
    



