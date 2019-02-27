Feature: Creating  rooms

  Scenario: 08.001 Validation "Name" field when user created room
    Given the user is on the Chat login page
    Given login under the user
    Then chat has been opened
    #    Check that room is not created
    When delete room with name "1test_room" if it already created
    When click create room icon
    Then popup "Add Room" is open
    When type room name "1test_room" when crated room
    When choose radio button "Public Room" when created room
    Then error messages show
    Then click button by name "Add" is disabled

  Scenario: 08.002 Validation "Name" field when user created room
    Given the user is on the Chat login page
    Given login under the user
    Then chat has been opened
        #    Check that room is not created
    When delete room with name "t_e_s_t_room" if it already created
#   value 1
    When click create room icon
    Then popup "Add Room" is open
    When type room name "t e s t room" when crated room
    When choose radio button "Public Room" when created room
    When click button by name "Add"
    Then room with name "t_e_s_t_room" is opened
    When open room with name "t_e_s_t_room"
    Then room with name "t_e_s_t_room" is opened
    When click button "Room settings" in right side bar
    Then right slide bar "Room settings" is opened
    When click button by name Delete room
    Then popup "Delete Roomt_e_s_t_room" is open
    When click button by name "Delete"
    Then room with name "t_e_s_t_room" is deleted
            #    Check that room is not created
    When delete room with name "tes" if it already created
#   Value 2
    When click create room icon
    Then popup "Add Room" is open
    When type room name "tes" when crated room
    When choose radio button "Public Room" when created room
    When click button by name "Add"
    Then room with name "tes" is opened
    When open room with name "tes"
    Then room with name "tes" is opened
    When click button "Room settings" in right side bar
    Then right slide bar "Room settings" is opened
    When click button by name Delete room
    Then popup "Delete Roomtes" is open
    When click button by name "Delete"
    Then room with name "tes" is deleted
                #    Check that room is not created
    When delete room with name "testroom11testroom11testroo" if it already created
#   Value 3
    When click create room icon
    Then popup "Add Room" is open
    When type room name "testroom11testroom11testroo" when crated room
    When choose radio button "Public Room" when created room
    When click button by name "Add"
    Then room with name "testroom11testroom11testroo" is opened
    When open room with name "testroom11testroom11testroo"
    Then room with name "testroom11testroom11testroo" is opened
    When click button "Room settings" in right side bar
    Then right slide bar "Room settings" is opened
    When click button by name Delete room
    Then popup "Delete Roomtestroom11testroom11testroo" is open
    When click button by name "Delete"
    Then room with name "testroom11testroom11testroo" is deleted

  Scenario: 08.003 Validation "Name" field when user created room
    Given the user is on the Chat login page
    Given login under the user
    Then chat has been opened
#    Check that room is not created
    When delete room with name "testДroom" if it already created
#    Check that room is not created
    When delete room with name "test@room" if it already created
#    Check that room is not created
    When delete room with name "te" if it already created
#    Check that room is not created
    When delete room with name "testroom11testroom11testroom" if it already created
#    Check that room is not created
    When delete room with name "546" if it already created


    When click create room icon
    Then popup "Add Room" is open
    When type room name "testДroom" when crated room
    When choose radio button "Public Room" when created room
    Then error messages show
    Then click button by name "Add" is disabled
#   Value 2
    Then popup "Add Room" is open
    When type room name "test@room" when crated room
    When choose radio button "Public Room" when created room
    Then error messages show
    Then click button by name "Add" is disabled
#   Value 3
    Then popup "Add Room" is open
    When type room name "testroom11testroom11testroom" when crated room
    When choose radio button "Public Room" when created room
    Then error messages show
    Then click button by name "Add" is disabled
#   Value 4
    Then popup "Add Room" is open
    When type room name "te" when crated room
    When choose radio button "Public Room" when created room
    Then error messages show
    Then click button by name "Add" is disabled
#   Value 5
    Then popup "Add Room" is open
    When type room name "546" when crated room
    When choose radio button "Public Room" when created room
    Then error messages show
    Then click button by name "Add" is disabled

  Scenario: 08.004 Create duplicate of room
    Given the user is on the Chat login page
    Given login under the user
    Then chat has been opened
#    Check that room is not created
    When delete room with name "kTEST_Room" if it already created
#    Check that room is not created
    When delete room with name "KtesT_room" if it already created
#    Check that room is not created
    When delete room with name "kTesT_rOOm" if it already created
#    Create test room
    When click create room icon
    Then popup "Add Room" is open
    When type room name "kTEST_Room" when crated room
    When choose radio button "Public Room" when created room
    When click button by name "Add"
    Then room with name "kTEST_Room" is opened
#    Value 2
    When click create room icon
    Then popup "Add Room" is open
    When type room name "KtesT_room" when crated room
    When choose radio button "Private Room" when created room
    Then error messages show
    Then click button by name "Add" is disabled
#    Value 3
    Then popup "Add Room" is open
    When type room name "kTesT_rOOm" when crated room
    When choose radio button "Public Room" when created room
    Then error messages show
    Then click button by name "Add" is disabled
    When click button by name "Cancel"
    When click button by name "Discard"
    When popup "Add Room" is closed
    When open room with name "kTEST_Room"
    Then room with name "kTEST_Room" is opened
    When click button "Room settings" in right side bar
    Then right slide bar "Room settings" is opened
    When click button by name Delete room
    Then popup "Delete RoomkTEST_Room" is open
    When click button by name "Delete"
    Then room with name "kTEST_Room" is deleted

  Scenario: 08.005 Checking buttons on form of creating room
    Given the user is on the Chat login page
    Given login under the user
    Then chat has been opened
#    Check that room is not created
    When delete room with name "kTesT_rOOm" if it already created
    When click create room icon
    Then popup "Add Room" is open
    When type room name "kTesT_rOOm" when crated room
    When click button by name "Cancel"
    When click button by name "Keep"
    Then popup "Add Room" is open
    When click button by name "Cancel"
    When click button by name "Discard"
    When popup "Add Room" is closed