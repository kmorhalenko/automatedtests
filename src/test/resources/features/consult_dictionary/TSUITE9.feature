Feature: Adding to room and deleting from room users.

  Scenario: 09.001 Add user when creating room
    Given the user is on the Chat login page
    Given login under the user
    Then chat has been opened
#    Check that room is not created
    When delete room with name "k_test_room" if it already created
#   Creating room
    When click create room icon
    Then popup "Add Room" is open
    When type room name "k_test_room" when crated room
    When invite member "k.test2" when created room
    When invite member "k_test3" when created room
    When delete invited user with name "k_test3" when created room
    When click button by name "Add"
    Then room with name "k_test_room" is opened
#   Adding new user to room
    When click button "Room members" in right side bar
    Then right slide bar "Room members" is opened
    Then user with name "k.test2" is on room members list
    Then user with name "k_test3" is not on room members list
    When click add new member to room icon
    Then popup "Invite new Members to #k_test_room" is open
    When invite member "k_test3" when room already created
    When click button by name "Invite"
    Then user with name "k_test3" is on room members list
#   Deleting user froom room
    When delete user "k_test3" from room
    Then user with name "k_test3" is not on room members list
#   Adding new administrator of room
    When assign to administrate user with name "k.test2"
    Then user "k.test2" has been add to administrators list
#   Delete admins rights
    When delete user "k.test2" from room
    Then user with name "k.test2" is not on room members list
    When click add new member to room icon
    Then popup "Invite new Members to #k_test_room" is open
    When invite member "k.test2" when room already created
    When click button by name "Invite"
    Then user with name "k.test2" is on room members list
    Then user "k.test2" has not been add to administrators list
#   Checking then user really will be added to room
    When user log out of chat
    Then login page open
    When login under the user two
    Then chat has been opened
    Then open room with name "k_test_room"
    Then room with name "k_test_room" is opened
    When user log out of chat
    Then login page open
#    Deleting of room
    When login under the user
    Then chat has been opened
    Then open room with name "k_test_room"
    Then room with name "k_test_room" is opened
    When click button "Room settings" in right side bar
    Then right slide bar "Room settings" is opened
    When click button by name Delete room
    Then popup "Delete Roomk_test_room" is open
    When click button by name "Delete"
    Then room with name "k_test_room" is deleted

  Scenario: 09.002 Administrator leave room and assign admins rights
    Given the user is on the Chat login page
    Given login under the user
    Then chat has been opened
#    Check that room is not created
    When delete room with name "k_test_room" if it already created
#   Creating room
    When click create room icon
    Then popup "Add Room" is open
    When type room name "k_test_room" when crated room
    When invite member "k.test2" when created room
    When invite member "k_test3" when created room
    When click button by name "Add"
    Then room with name "k_test_room" is opened
#   Administrator leave of the room
    When click button "Room settings" in right side bar
    Then right slide bar "Room settings" is opened
    When click button by name Leave Room
    Then popup "Assign new owner for room k_test_room" is open
    When type to field assign new administrator user name "k.test2"
    When click to user name "k.test2" in drop down list of users
    When click button by name "Assign & leave"
    Then user leave the room "k_test_room"
    When user log out of chat
    Then login page open
#   Checking admin rights of user k.test2
    When login under the user two
    Then chat has been opened
    When open room with name "k_test_room"
    Then room with name "k_test_room" is opened
    When click button "Room members" in right side bar
    Then right slide bar "Room members" is opened
    Then user "k.test2" has been add to administrators list
    Then user "k.test" has not been add to administrators list
#   Deleting room
    When click button "Room settings" in right side bar
    Then right slide bar "Room settings" is opened
    When click button by name Delete room
    Then popup "Delete Roomk_test_room" is open
    When click button by name "Delete"
    Then room with name "k_test_room" is deleted









