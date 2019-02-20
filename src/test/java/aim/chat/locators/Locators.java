package aim.chat.locators;

public interface Locators {


    //  *** LOGIN PAGE ***

    String XPATH_LOGIN_PAGE_PASSWORD_FIELD = "//*[@name='password']";
    String ERROR_MESSAGE_UNAUTHORIZED = "//div[@class='alert alert-danger']";
    String LOGIN_FIELD = "//input[@name='login']";
    String PASSWORD_FIELD = "//*[@name='password']";
    String SUBMIT_BUTTON = "//button[@type='submit']";

    String SHOW_PASSWORD_ICON = "//span[@class='password-show']";
    String AIM_CHAT_LOGO = "//div[@class='login-right']";
    String REGISTER_LINK = "//a[contains(text(),'Register')]";


    //  *** MAIN PAGE ***
    String AIM_CHAT_LOADER = "//div[@class='c5 c-hidden']";
    String PROFILE_IN_DROP_DOWN_LIST = "//span[contains(text(),'Profile')]";
    String USER_DROP_DOWN_MENU = "//*[@class='team-name']";
    String TYPE_MESSAGE_HERE_FIELD = "//*[@name='send-message-input']";
    String SING_OUT_IN_USER_MENU = "//span[contains(text(),'Sign out')]";
    String ICON_BACK_IN_USER_MENU = "//i[contains(text(),'arrow_back')]";
    String ADD_DIRECT_ICON = "//a[@class='add-direct-button']";
    String SEARCH_DIRECT_FIELD = "//input[@placeholder='Search room']";
    String TITLE_NAME = "//div[@class='channel-name room-direct']";
    String TYPE_MESSAGE_HERE_INPUT_FIELD = "(//*[@placeholder='Type message here'])[2]";
    String DIRECT_WITH_USER = "//span[contains(text(),'$1')]";
    String DELETE_ROOM_OR_DIRECT_ICON = "//li[descendant::a//*[.='$1']]//i";
    String UNREAD_MESSAGES = "//li[descendant::a//*[.='$1']]//span[@class = 'unread-messages ']";
    String BELL_ICON = "//div[@id='mute-menu-toggle']";
    String MUTE_DROP_DOWN_WINDOW = "//div[contains(@class,'dropdown open')]//ul[contains(@class,'')]";
    String MUTE_NOTIFICATONS_SWITCHER = "//span[contains(@class,'slider round')]";
    String CHAT_MUTED_MESSAGE = "//div[@class = 'toast-title'][ contains(text(), 'Chat is muted')]";
    String CHAT_UNMUTED_MESSAGE = "//div[@class = 'toast-title'][ contains(text(), 'Chat is unmuted')]";
    String MESSAGE_ABOUT_NOTIFICATIONS = "//div[@class = 'toast-title']";
    String SEARCH_FIELD = "//input[contains(@placeholder,'Search...')]";
    String USER_NAME_IN_USER_MENU = "//p[@class='username']";
    String CREATE_ROOM_BUTTON = "//a[@class='add-room-button']";
    String MODAL_WINDOW_TITLE = "//h4[@class='modal-title']";
    String BUTTON_BY_NAME = "//button[.='$1']";
    String ROOM_NAME = "//div[contains(@class,'channel-room-name')]//div[contains(@class,'channel-name')][.='$1']";
    String ROOM_IN_LEFT_SIDE_BAR = "//span[.='$1']";
    String RIGHT_SIDE_BAR_BUTTONS_BY_TITLE = "//*[@title='$1']";
    String RIGHT_SLIDE_BAR_BY_TITLE = "//span[contains(text(),'$1')]";
    String USER_IN_ROOM_MEMBERS = "//*[@class='chat-container active']//*[@class='search-members']/following-sibling::ul/div[descendant::*[.='$1']]";
    String ADD_NEW_USER_TO_ROOM_ICON = "//i[contains(@class,'material-icons 25 md-dark')]";
    String REMOVE_FROM_ROOM_BUTTON = "//ul[@class='members-list scroll-disable']//a[@role='menuitem'][contains(text(),'Remove from')]";
    String ASSIGN_TO_ADMINISTRATOR_IN_POPUP_USER_MENU_IN_RIGTS_SLIDE_BAR_IN_ROOM = "//a[contains(text(),'Assign as administrator')]";
    String USER_BY_USERNAME_IN_ROOM_ADMINISTRATOR_LIST = "(//div[contains(text(), \"Room administration\")]/..//div[@class='member-info'][.='$1'])[1]";
    String ASSIGT_NEW_ADMINISTRATOR_FIELD = "//input[@placeholder='Choose new administrator from room’s members']";
    String INVITE_NEW_MEMBER_TO_ALREADY_CREATED_ROOM = "//div[@class='ue ue-username ue-username-person'][contains(text(),'$1')]";


    // *** REGISTRATION FORM ***

    String EMAIL_FIELD_REGISTRATION_FORM_ONE = "//*[@name='email']";
    String SUBMIT_BUTTON_REGISTRATION_PAGE = "//*[@type='submit']";
    String CANCEL_BUTTON_REGISTRATION_PAGE = "//*[@id='cancel-recovery']";
    String BACK_TO_AUTORIZATION_LINK_REGISTRATION_PAGE = "//a[contains(text(),'Back to authorization')]";
    String LOGIN_FIELD_REGISTRATION_PAGE = "//input[@placeholder='Login']";
    String ERROR_MESSAGE_EMAIL_FIELD_REGISTRATION_PAGE = "//div[@class='text-danger']";
    String TEXT_AIM_PRO_SOFT_REGISTRATION_PAGE = "//div[@class='text-center']//h1[1]";
    String SUBMIT_BUTTON_SECOND_PAGE_OF_REGISTRATION = "//button[@type='submit']";
    String LINK_SEND_AGAIN = "//a[@class='send-again']";
    String CONFIRMATION_CODE_FIELD_REGISTRATION_PAGE = "//input[@placeholder='Email confirmation code']";
    String PASSWORD_FIELD_ONE_REGISTRATION_PAGE = "//*[@name='password']";
    String PASSWORD_FIELD_TWO_REGISTRATION_PAGE = "//*[@name='password2']";
    String ERROR_MESSAGE = "//*[@class='text-danger']";



    // ***PROFILE SETTINGS ***
//
//    String FIRST_NAME_FIELD = "//input[@name='firstName']";
//    String LAST_NAME_FIELD = "//input[@name='lastName']";
//    String PHONE_NUMBER_FIELD = "//input[@name='phone']";
//    String SKYPE_FIELD = "//input[@name='skype']";
//    String WHAT_I_DO_FIELD = "//input[@name='whatIDo']";
//    String WHERE_I_AM_FILED = "//input[@name='whereIAm']";
    String SAVE_BUTTON = "//button[@type='button']";
    String CHANGE_AVATAR_BUTTON = "//label[contains(@class,'btn btn-default')]";
    String AVATAR_SAVE_BUTTON = "//div[@class='cropper']//div//button[@type='button'][contains(text(),'Save')]";
    String AVATAR_FRAME = "//img[@class='img-responsive']";
    String PROFILE_SETTINGS_FIELD = "//*[@name = '$1']";
    String TIME_ZONE_FIELD = "//select[@name='timezoneProfile']";
    String AVATAR_ERROR = "//*[@class='avatarError']";

    //   *** ACCAUNT SETTINGS ***

    String OLD_PASSWORD_FIELD = "//input[@name='password']";
    String NEW_PASSWORD_FIELD = "//input[@name='password2']";
    String SAVE_BUTTON_FOR_FIELDS = "//label[.='$1']/../..//button";
    String INPUT_FIELD_BY_LABLE_NAME = "//label[.='$1']/..//input";
    String MESSAGE_ABOUT_SENDING_CODE_OF_CONFIRMATION = "//span[@class='confirm-code-status']";
    String INCORRECT_PASSWORD_ERROR_MESSAGE = "//label[.='New password:']/../..//*[@class='statusError']";
    String PASSWORD_IS_CHANGED_SUCCESSFULY = "//label[.='New password:']/../..//*[@class='statusSucces']";
    String USERNAME_IS_SUCSESSFULY_CHANGED_MESSAGE = "//*[contains(text(),'Username successfully changed')]";


    //***ERROR MESSAGES ***

    String ERROR_MESSAGE_LOGIN_CANT_BE_EMPTY = "//div[contains(text(),\"Login can't be empty\")]";

    //***CREATE ROOM***

    String DELETE_INVITED_MEMBER_WHEN_USER_CREATED_ROOM = "//div[contains(text(), '$1')]/..//div[@class='sc sc-chip']";
    String USER_NAME_IN_DROP_DOWN_MENU = "//div[@class='ue ue-username ue-username-person'][contains(text(),'$1')]";
    String ROOM_DESCRIPTION_FIELD_WHEN_CREATED_ROOM = "//textarea[@name='room-description']";
    String RARIO_BUTTON_WHEN_CRATED_ROOM = "//label[.='$1']";
    String DELETE_ROOM_BUTTON = "//span[contains(@class,'delete-room one-user')]";
    String FIELD_BY_LABLE_NAME_ROOM_CREATE_POPUP = "//*[@class=\"field-name\"] [contains(text(),\"$1\")]/..//input";
    String CHOOSE_NEW_ADMINISTRATOR_FIELD = "";




    //***TEMP MAIL***
    String FIELD_WITH_TEMP_EMAIL = "//input[@id='mail']";
    String SUBJECT_OF_MAIL = "//a[@class='title-subject']";
    String OPEN_FIRST_MAIL_BUTTON = "(//span[@class='glyphicon glyphicon-chevron-right'])[1]";
    String OPEN_MAIL_IF_IT_ONE = "//span[@class='glyphicon glyphicon-chevron-right']";
    String TEXT_OF_MESSAGE_WITH_CODE_OF_CONFIRMATION = "//p[contains(text(),'Here is your code confirmation')]";
    String OPEN_MESSAGE_BY_NUMBER_LINK = "(//a[@class='link'])[$1]";
}

