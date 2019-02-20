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
