Feature: Find (sttared and pinned) messeges

  Scenario: 12.001 pinned and starred messages
    Given the user is on the Chat login page
    When login under the user
    Then chat has been opened
#    Check that room is not created
    When delete room with name "k_test_room" if it already created
#   Creating room
    When click create room icon
    Then popup "Add Room" is open
    When type room name "k_test_room" when crated room
    When invite member "k.test2" when created room
    When click button by name "Add"
    Then room with name "k_test_room" is opened
#   User send to chat of room random messages
    When user send "10" random message to chat
#   Starred message from chat
    When get value of starred messages before add new starred message
    When scroll chat to message of number "8"
    When stared message by number "8"
    When get value of starred messages after add new starred message
    Then value of starred message increased by 1
#    #   Starred message from chat
#    When get value of starred messages before add new starred message
#    When scroll chat to message of number "10"
#    When stared message by number "10"
#    When get value of starred messages after add new starred message
#    Then value of starred message increased by 1
#   Find starred message
    When click button "Starred messages" in right side bar
    Then right slide bar "Starred messages" is opened
    When get text of message from starred message by number "1"
    When move mouse to starred message by number "1"
    When click "Open" link by number 1
    Then chat scrolled to message and highlight it




#   Delete room (only user who create room)
#    When open room with name "General"
#    Then room with name "General" is opened
    When open room with name "k_test_room"
    Then room with name "k_test_room" is opened

    When click button "Room settings" in right side bar
    Then right slide bar "Room settings" is opened
    When click button by name Delete room
    Then popup "Delete Roomk_test_room" is open
    When click button by name "Delete"
    Then room with name "k_test_room" is deleted


