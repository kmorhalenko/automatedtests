#Feature: Checking scrolling
#
#  Scenario: 11.001 Return the chat to the end when sending a message
#    Given the user is on the Chat login page
#    When login under the user
#    Then chat has been opened
#    #   Creating room
#    When click create room icon
#    Then popup "Add Room" is open
#    When type room name "k_test_room" when crated room
#    When invite member "k.test2" when created room
#    When click button by name "Add"
#    Then room with name "k_test_room" is opened
##User send to chat of room random messages
#    When user send "50" random message to chat
##First user log out
#    When user log out of chat
#    Then login page open
##Second user log in
#    Then login page open
#    When login under the user two
#    Then chat has been opened
#    Then open room with name "k_test_room"
#    Then room with name "k_test_room" is opened
#
#
#    When scroll chat to message of number "30"
#    Then message with number "50" is not visible
#    When user send "1" random message to chat
#    Then message with number "51" is visible
#
##    Second user log out of chat
#    When user log out of chat
#    Then login page open
#
#
#
#
##First user log in for delete room
#    When login under the user
#    Then chat has been opened
##Delete room (only user who create room)
#    Then open room with name "k_test_room"
#    Then room with name "k_test_room" is opened
#    When click button "Room settings" in right side bar
#    Then right slide bar "Room settings" is opened
#    When click button by name Delete room
#    Then popup "Delete Roomk_test_room" is open
#    When click button by name "Delete"
#    Then room with name "k_test_room" is deleted