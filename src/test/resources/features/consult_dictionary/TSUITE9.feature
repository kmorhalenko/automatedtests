Feature: Adding to room and deleting from room users.

  Scenario: 09.001 Add user when creating room
    Given the user is on the Chat login page
    Given login under the user
    Then chat has been opened
    When click create room icon
    Then popup "Add Room" is open
    When type room name "k_test_room" when crated room
    When invite member "k.test2" when created room
    When invite member "k_test3" when created room
    When delete invited user with name "k_test3" when created room
    When click button by name "Add"
    Then room with name "k_test_room" is opened
    When click button "Room members" in right side bar
    Then right slide bar "Room members" is opened
    Then user with name "k.test2" is on room members list
    Then user with name "k_test3" is not on room members list
    When click add new member to room icon
    Then popup "Invite new Members to #k_test_room" is open
    When invite member "k_test3" when room already created
    When click button by name "Invite"
    Then user with name "k_test3" is on room members list
    When delete user "k_test3" from room
    Then user with name "k_test3" is not on room members list








    When user log out of chat
    Then login page open
    When login under the user two
    Then chat has been opened
    Then open room with name "k_test_room"
    Then room with name "k_test_room" is opened















#deleteing room
#    When click button "Room settings" in right side bar
#    Then right slide bar "Room settings" is opened
#    When click button by name Delete room
#    Then popup "Delete Roomk_test_room" is open
#    When click button by name "Delete"
#    Then room with name "k_test_room" is deleted