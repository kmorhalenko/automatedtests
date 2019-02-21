package aim.chat.pages;

import aim.chat.locators.Credentials;
import aim.chat.locators.Locators;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@DefaultUrl("https://192.168.217.23/index.html#/login")
public class DictionaryPage extends CommonElements {

    public int idLastMessage;
//    public Object oldValueOfAvatar;
//        WebElement oldAvatar = $(Locators.AVATAR_FRAME).getValue(src);



   /* public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        return definitionList.findElements(By.tagName("li")).stream()
                .map(element -> element.getText())
                .collect(Collectors.toList());
    }*/


    public void theUserIsOnTheChatLoginPage() {

        getDriver().get("https://192.168.217.23/index.html#/login");

    }


    public void loginUnderTheUser() {
        $(Locators.LOGIN_FIELD).clear();
        $(Locators.LOGIN_FIELD).type(Credentials.USER_1);

        $(Locators.PASSWORD_FIELD).clear();
        $(Locators.PASSWORD_FIELD).type(Credentials.PASS_1);

        $(Locators.SUBMIT_BUTTON).click();


    }


    public boolean chatHasBeenOpened() {
        return $(Locators.TYPE_MESSAGE_HERE_FIELD).isVisible();

    }


    public void userLogOutOfChat() {
        $(Locators.USER_DROP_DOWN_MENU).isVisible();
        $(Locators.USER_DROP_DOWN_MENU).click();
        $(Locators.SING_OUT_IN_USER_MENU).isVisible();
        $(Locators.SING_OUT_IN_USER_MENU).click();

    }


    public boolean loginPageOpen() {
//        waitABit(500);
        elementIsVisible(15,(Locators.LOGIN_FIELD));
        return $(Locators.LOGIN_FIELD).isVisible();
    }

    public void loginFieldClear() {
        $(Locators.LOGIN_FIELD).clear();
    }

    public void passwordFieldClear() {
        $(Locators.PASSWORD_FIELD).clear();
        $(Locators.LOGIN_FIELD).clear();

    }

    public boolean buttonSubmitUnusable() {
        return $(Locators.SUBMIT_BUTTON).isEnabled();
//        WebElement Submit = $(Locators.SUBMIT_BUTTON);
//        if (Submit.isEnabled()) {
//            $(Locators.SUBMIT_BUTTON).click();
//            System.out.println("the button is enabled");
//        } else {
//            System.out.println("the button is disabled");
//        }
    }

    public boolean errorMessagesShow() {
        return $(Locators.ERROR_MESSAGE).isVisible();

    }

    public void userEnterIncorrectEmail() {
        $(Locators.LOGIN_FIELD).clear();
        $(Locators.LOGIN_FIELD).type("Qqq123");


    }

    public void userEnterIncorrectPassword() {
        $(Locators.PASSWORD_FIELD).clear();
        $(Locators.PASSWORD_FIELD).type("Qq12");
    }

    public void clickButtonSubmit() {
        elementIsClicable(5, Locators.SUBMIT_BUTTON);
        $(Locators.SUBMIT_BUTTON).click();

    }

    public boolean errorUnauthorizedMessageShow() {
        return $(Locators.ERROR_MESSAGE_UNAUTHORIZED).isVisible();

    }

    public void userEnterLoginWithSpecialCharacters() {
        $(Locators.LOGIN_FIELD).clear();
        $(Locators.LOGIN_FIELD).type("!@# $%^");

    }

    public void userEnterCorrectPassword() {
        $(Locators.PASSWORD_FIELD).clear();
        $(Locators.PASSWORD_FIELD).type(Credentials.PASS_1);
    }

    public boolean errorMessagesOnlyLatinShow() {
        return $("//div[@class='text-danger']").isVisible();
    }


    public void userEnterLoginWithCyrillicCharacters() {

        $(Locators.LOGIN_FIELD).clear();
        $(Locators.LOGIN_FIELD).type("фывыфвфыв");

    }


    public void userEnterCorrectLogin() {
        $(Locators.LOGIN_FIELD).clear();
        $(Locators.LOGIN_FIELD).type(Credentials.USER_1);
    }


    public void holdIconShowPassword() {
        Actions action = new Actions(getDriver());

        do {
            action.clickAndHold($(Locators.SHOW_PASSWORD_ICON)).build().perform();
        }
        while (!($(Locators.ERROR_MESSAGE_UNAUTHORIZED).isVisible()));
    }

    public boolean passwordIsNotVisible() {
        return $(Locators.XPATH_LOGIN_PAGE_PASSWORD_FIELD).getAttribute("type").equals("password");
    }

    public void registrationPageOneIsOpen() {
        //  getDriver().manage().window().maximize();
        getDriver().get("https://192.168.217.23/index.html#/registration");
    }

    public void inputFieldEmailOnPageOneOfRegistrationIsEmpty() {
        $(Locators.EMAIL_FIELD_REGISTRATION_FORM_ONE).clear();
    }

    public void clickButtonSubmitPageOneOfRegistration() {
        // $(Locators.SUBMIT_BUTTON_REGISTRATION_PAGE).click();
        WebElement Submit = $(Locators.SUBMIT_BUTTON_REGISTRATION_PAGE);
        if (Submit.isEnabled()) {
            $(Locators.SUBMIT_BUTTON_REGISTRATION_PAGE).click();
            System.out.println("the button is enabled");
        } else {
            System.out.println("the button is disabled");
        }
    }

    public boolean pageOneOfRegistrationIsOpened() {
        return !($(Locators.LOGIN_FIELD_REGISTRATION_PAGE).isVisible());

    }

    public void clickButtonCancel() {
        $(Locators.CANCEL_BUTTON_REGISTRATION_PAGE).click();
    }


    public void userEnterFollowingEmail(String value) {
        $(Locators.EMAIL_FIELD_REGISTRATION_FORM_ONE).clear();
        $(Locators.EMAIL_FIELD_REGISTRATION_FORM_ONE).type(value);
        $(Locators.TEXT_AIM_PRO_SOFT_REGISTRATION_PAGE).click();
    }

    public boolean errorMessageHasBeenShown() {
        return $(Locators.ERROR_MESSAGE_EMAIL_FIELD_REGISTRATION_PAGE).isVisible();
    }

    public void userEnterValidEmailOnTheRegistrationPage() {
        $(Locators.EMAIL_FIELD_REGISTRATION_FORM_ONE).type(Credentials.USER_1);
    }

    public void clickButtonSubmitSecondPageOfRegistration() {
        $(Locators.SUBMIT_BUTTON_SECOND_PAGE_OF_REGISTRATION).click();
        waitABit(500);

    }

    public boolean pageTwoOfRegistrationIsOpened() {
        if ($(Locators.PASSWORD_FIELD_ONE_REGISTRATION_PAGE).isVisible() && $(Locators.PASSWORD_FIELD_TWO_REGISTRATION_PAGE).isVisible()) {
            return true;
        } else {
            return false;
        }

    }

    public void typeToFieldLogin(String text) {
        $(Locators.LOGIN_FIELD_REGISTRATION_PAGE).clear();
        $(Locators.LOGIN_FIELD_REGISTRATION_PAGE).type(text);

    }

    public void typeToPasswordOneField(String text) {
        $(Locators.PASSWORD_FIELD_ONE_REGISTRATION_PAGE).clear();
        $(Locators.PASSWORD_FIELD_ONE_REGISTRATION_PAGE).type(text);

    }

    public void typeToPasswordTwoField(String text) {
        $(Locators.PASSWORD_FIELD_TWO_REGISTRATION_PAGE).clear();
        $(Locators.PASSWORD_FIELD_TWO_REGISTRATION_PAGE).type(text);

    }

    public void typeToConfirmationCodeField(String text) {
        $(Locators.CONFIRMATION_CODE_FIELD_REGISTRATION_PAGE).clear();
        $(Locators.CONFIRMATION_CODE_FIELD_REGISTRATION_PAGE).type(text);

    }

    public boolean errorMessagesOnRegistrationPageIsShow() {
        if ($(Locators.ERROR_MESSAGE).isVisible()) {
            return true;
        } else {
            return false;
        }
    }

    public void clickLinkRegistrationOnTheLoginPage() {
        $(Locators.REGISTER_LINK).click();
    }

    public void userOpenedProfileSettings() {
        $(Locators.USER_DROP_DOWN_MENU).click();
        $(Locators.PROFILE_IN_DROP_DOWN_LIST).click();
    }


    public void clickButtonSave() {
        $(Locators.SAVE_BUTTON).click();
    }


    public String getAbsolutePathOfFile(String fileName) throws URISyntaxException {

        Serenity.getCurrentSession().put("Uploaded File Name", fileName);
        URL resource = this.getClass().getResource("/files/" + fileName);
        return new File(resource.toURI()).getAbsolutePath();

    }


    public WebElementFacade getElementByXpath(String s) {
        return $(s);
    }

    public void waitMSeconds(int msec) {
        waitABit(msec);
    }

    public void userClickAvatarSaveButton() {
//        elementIsVisible(4 ,"//div[contains(@class,'cropper-drag-box')]");

        $(Locators.AVATAR_SAVE_BUTTON).click();
        waitABit(1000);

    }


    public void typeToFieldValue(String fieldName, String value) {
        $(Locators.PROFILE_SETTINGS_FIELD.replace("$1", fieldName)).clear();
        $(Locators.PROFILE_SETTINGS_FIELD.replace("$1", fieldName)).typeAndTab(value);


    }

    public void clearField(String fieldName) {
        $(Locators.PROFILE_SETTINGS_FIELD.replace("$1", fieldName)).clear();


    }


    public String getFieldValue(String fieldName) {
        return $(Locators.PROFILE_SETTINGS_FIELD.replace("$1", fieldName)).getValue();
    }

    public String srcOfPicture() {
        return $(Locators.AVATAR_FRAME).getAttribute("src");
    }


    public String oldValueOfTimezone() {
        $(Locators.TIME_ZONE_FIELD).click();
        $(Locators.TIME_ZONE_FIELD).selectByValue("Europe/Helsinki").click();
        $(Locators.SAVE_BUTTON).click();
        return $(Locators.TIME_ZONE_FIELD).getAttribute("value");


    }

    public void changeTimezone() {
        $(Locators.TIME_ZONE_FIELD).click();
        $(Locators.TIME_ZONE_FIELD).selectByValue("Africa/Casablanca").click();
        $(Locators.SAVE_BUTTON).click();


    }

    public String newValueOfTimezone() {
        return $(Locators.TIME_ZONE_FIELD).getAttribute("value");
    }

    public boolean errorMessageForAvatarIsShow() {
        return $(Locators.AVATAR_ERROR).isVisible();

    }

    public boolean clickBackIconInUserMenu() {
        $(Locators.ICON_BACK_IN_USER_MENU).click();
        return $(Locators.TYPE_MESSAGE_HERE_FIELD).isVisible();
    }

//    public String newTimezoneIsNotSaved() {
//        return $(Locators.TIME_ZONE_FIELD).getAttribute("value");
//    }


    public void changeTimezoneAndNotSave() {

        $(Locators.TIME_ZONE_FIELD).click();
        $(Locators.TIME_ZONE_FIELD).selectByValue("America/Belize").click();

    }

    public String getValueOfTimezone() {

        return $(Locators.TIME_ZONE_FIELD).getAttribute("value");
    }

    public void addUserToDirectList(String userName) {
        $(Locators.ADD_DIRECT_ICON).click();
        $(Locators.SEARCH_DIRECT_FIELD).isCurrentlyVisible();
        $(Locators.SEARCH_DIRECT_FIELD).typeAndEnter(userName);
    }

    public boolean directWithUserIsOpened(String userName) {
        String realyUserName = $(Locators.TITLE_NAME).getText();
        if (realyUserName.equals(userName)) {
            return true;
        }
        return false;
    }

    public void sendMessageWithText(String textOfMessage) {
        $(Locators.TYPE_MESSAGE_HERE_INPUT_FIELD).isCurrentlyVisible();
        $(Locators.TYPE_MESSAGE_HERE_INPUT_FIELD).clear();
        $(Locators.TYPE_MESSAGE_HERE_INPUT_FIELD).typeAndEnter(textOfMessage);
        waitABit(3000);
    }

    public void deleteDirectWithUser(String userName) {
        $(Locators.DIRECT_WITH_USER.replace("$1", userName)).click();
        $(Locators.DELETE_ROOM_OR_DIRECT_ICON.replace("$1", userName)).waitUntilVisible();
        $(Locators.DELETE_ROOM_OR_DIRECT_ICON.replace("$1", userName)).click();
    }

    public boolean directWithUserIsDeletedFromList(String userName) {
        return $(Locators.DIRECT_WITH_USER.replace("$1", userName)).isVisible();

    }

    public void loginUnderTheUserTwo() {

        $(Locators.LOGIN_FIELD).clear();
        $(Locators.LOGIN_FIELD).type(Credentials.USER_2);

        $(Locators.PASSWORD_FIELD).clear();
        $(Locators.PASSWORD_FIELD).type(Credentials.PASS_2);

        $(Locators.SUBMIT_BUTTON).click();

    }

    public String userHaveUnreadMessagesFromUser(String userName) {
        return $(Locators.UNREAD_MESSAGES.replace("$1", userName)).getText();
    }

    public void openUnreadMessageFromUser(String userName) {
        $(Locators.DIRECT_WITH_USER.replace("$1", userName)).click();
    }


    public boolean iconAboutUnreadMessageFromIsNotDisplayed(String userName) {
        return $(Locators.UNREAD_MESSAGES.replace("$1", userName)).isVisible();
    }


    public String getTextFromMessageAboutNotifications() {
        return $(Locators.MESSAGE_ABOUT_NOTIFICATIONS).getText();
    }


    public void userClickNotificationsSwitcher() {
//        waitABit(500);
        $(Locators.BELL_ICON).click();
        elementIsVisible(5, Locators.MUTE_DROP_DOWN_WINDOW);
//        waitFor(Locators.MUTE_DROP_DOWN_WINDOW).isElementVisible(By.id(Locators.MUTE_NOTIFICATONS_SWITCHER));
        $(Locators.MUTE_NOTIFICATONS_SWITCHER).click();
        $(Locators.SEARCH_FIELD).click();
        elementIsInvisible(5, Locators.MUTE_DROP_DOWN_WINDOW);
    }

    public boolean messageAboutNotificationsIsVisible() {
        return $(Locators.MESSAGE_ABOUT_NOTIFICATIONS).isPresent();
    }

    public void openPage(String pageURL) {
        getDriver().get(pageURL);
    }

    public void clickButtonSaveForField(String fieldName) {
        waitABit(500);
        $(Locators.SAVE_BUTTON_FOR_FIELDS.replace("$1", fieldName)).click();
    }

    public String errorMessageIsShowed() {
        return $(Locators.ERROR_MESSAGE).getText();
    }

    public boolean buttonSaveForPasswordsFieldsUnusable() {
        return $(Locators.SAVE_BUTTON_FOR_FIELDS.replace("$1", "New password:")).isEnabled();
    }

    public boolean errorMessageForPasswordsFieldsIsShowed() {
//        return $(Locators.INCORRECT_PASSWORD_ERROR_MESSAGE).isVisible();
        return elementIsVisible(5, Locators.INCORRECT_PASSWORD_ERROR_MESSAGE);
    }

    public boolean messageAboutChangedPasswordIsShowed() {
        return $(Locators.PASSWORD_IS_CHANGED_SUCCESSFULY).isVisible();
    }

    public boolean messageAboutChangedUsernameIsShowed() {
        return elementIsVisible(5, Locators.USERNAME_IS_SUCSESSFULY_CHANGED_MESSAGE);
    }

    public String userNameInUserMenuIsChangedTo() {
        waitABit(2000);
        return $(Locators.USER_NAME_IN_USER_MENU).getText();

    }

    public String popupIsOpen() {
        return $(Locators.MODAL_WINDOW_TITLE).getText();
    }

    public void clickCreateRoomIcon() {
        $(Locators.CREATE_ROOM_BUTTON).click();
    }

    public void typeRoomNameWhenCratedRoom(String roomName) {
        $(Locators.INPUT_FIELD_BY_LABLE_NAME.replace("$1", "Name")).clear();
        $(Locators.INPUT_FIELD_BY_LABLE_NAME.replace("$1", "Name")).type(roomName);
    }

    public void inviteMemberWhenCreatedRoom(String userName) {
        $(Locators.FIELD_BY_LABLE_NAME_ROOM_CREATE_POPUP.replace("$1", "Invite members ")).type(userName);
        elementIsVisible(5, Locators.USER_NAME_IN_DROP_DOWN_MENU.replace("$1", userName));
        $(Locators.USER_NAME_IN_DROP_DOWN_MENU.replace("$1", userName)).click();
        $(Locators.INPUT_FIELD_BY_LABLE_NAME.replace("$1", "Name")).click();
    }

    public void deleteInvitedUserWithNameWhenCreatedRoom(String userName) {
        $(Locators.DELETE_INVITED_MEMBER_WHEN_USER_CREATED_ROOM.replace("$1", userName)).click();
        $(Locators.INPUT_FIELD_BY_LABLE_NAME.replace("$1", "Name")).click();
    }

    public void addDescriptionOfRoomWhenCreatedRoom(String text) {
        $(Locators.ROOM_DESCRIPTION_FIELD_WHEN_CREATED_ROOM).type(text);
    }

    public void chooseRadioButtonWhenCreatedRoom(String nameRadioButton) {
        $(Locators.RARIO_BUTTON_WHEN_CRATED_ROOM.replace("$1", nameRadioButton)).click();
    }

    public void clickButtonByName(String nameOfButton) {

        $(Locators.BUTTON_BY_NAME.replace("$1", nameOfButton)).click();
    }

    public boolean clickButtonByNameIsDisabled(String nameOfButton) {
        return elementIsClicable(3, Locators.BUTTON_BY_NAME.replace("$1", nameOfButton));
    }

    public boolean roomWithNameIsOpened(String roomName) {
        return elementIsVisible(5, Locators.ROOM_NAME.replace("$1", roomName));
    }


    public boolean roomWithNameIsDeleted(String roomName) {
        return !($(Locators.ROOM_IN_LEFT_SIDE_BAR.replace("$1", roomName)).isVisible());
    }

    public void openRoomWithName(String roomName) {

        $(Locators.ROOM_IN_LEFT_SIDE_BAR.replace("$1", roomName)).click();

    }

    public void clickButtonInRightSideBar(String buttonName) {
        $(Locators.RIGHT_SIDE_BAR_BUTTONS_BY_TITLE.replace("$1", buttonName)).click();
    }

    public boolean rightSlideBarIsOpened(String titleName) {
        return $(Locators.RIGHT_SLIDE_BAR_BY_TITLE.replace("$1", titleName)).isVisible();
    }

    public void clickButtonByNameDeleteRoom() {
        $("//span[contains(text(), 'Delete Room')]").click();
    }

    public boolean popupIsClosed(String titleName) {
        return $(Locators.MODAL_WINDOW_TITLE.replace("$1", titleName)).isVisible();
    }

    public boolean userWithNameIsOnRoomMembersList(String userName) {
        return elementIsVisible(5, Locators.USER_IN_ROOM_MEMBERS.replace("$1", userName));
    }

    public boolean userWithNameIsNotOnRoomMembersList(String userName) {
        return elementIsInvisible(5, Locators.USER_IN_ROOM_MEMBERS.replace("$1", userName));
    }

    public void clickAddNewMemberToRoomIcon() {
        $(Locators.ADD_NEW_USER_TO_ROOM_ICON).click();
    }

    public void inviteMemberWhenRoomAlreadyCreated(String userName) {
//        $(Locators.SEARCH_FIELD_WHEN_ADD_USER_TO_ROOM).type(userName)
        $(Locators.INVITE_NEW_MEMBER_TO_ALREADY_CREATED_ROOM.replace("$1", userName)).click();
    }

    public void deleteUserFromRoom(String userName) {
        $(Locators.USER_IN_ROOM_MEMBERS.replace("$1", userName)).click();
        elementIsVisible(3, Locators.REMOVE_FROM_ROOM_BUTTON);
        $(Locators.REMOVE_FROM_ROOM_BUTTON).click();
        elementIsClicable(5, Locators.BUTTON_BY_NAME.replace("$1", "Remove"));
        $(Locators.BUTTON_BY_NAME.replace("$1", "Remove")).click();

    }

    public void assignToAdministrateUserWithName(String userName) {
        $(Locators.USER_IN_ROOM_MEMBERS.replace("$1", userName)).click();
        elementIsVisible(3, Locators.ASSIGN_TO_ADMINISTRATOR_IN_POPUP_USER_MENU_IN_RIGTS_SLIDE_BAR_IN_ROOM);
        $(Locators.ASSIGN_TO_ADMINISTRATOR_IN_POPUP_USER_MENU_IN_RIGTS_SLIDE_BAR_IN_ROOM).click();
        elementIsClicable(5, Locators.BUTTON_BY_NAME.replace("$1", "Assign"));
        $(Locators.BUTTON_BY_NAME.replace("$1", "Assign")).click();


    }

    public boolean userHasBeenAddToAdministratorsList(String userName) {
        return elementIsVisible(5, Locators.USER_BY_USERNAME_IN_ROOM_ADMINISTRATOR_LIST.replace("$1", userName));
    }

    public void typeToFieldAssignNewAdministratorUserName(String userName) {
        $(Locators.ASSIGT_NEW_ADMINISTRATOR_FIELD).type(userName);
    }


    public void clickToUserNameInDropDownListOfUsers(String userName) {
        elementIsVisible(5, Locators.USER_NAME_IN_DROP_DOWN_MENU.replace("$1", userName));
        $(Locators.USER_NAME_IN_DROP_DOWN_MENU.replace("$1", userName)).click();
    }

    public void clickButtonByNameLeaveRoom() {
        $("//div[@class='chat-container active']//span[contains(text(),'Leave Room')]").click();
    }


    public void openNewTab(String url) {
        ((JavascriptExecutor) getDriver()).executeScript("window.open()");
        switchToCurrentTab(2);
        getDriver().get(url);

    }

    public void switchToCurrentTab(int numberOfTab) {
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(numberOfTab - 1));

    }

    public String copyValueOfEmailToClipboard() {

        return $(Locators.FIELD_WITH_TEMP_EMAIL).getAttribute("Value");
    }

    public void pasteTempMailFromClipboard(String tempMail) {
        $(Locators.EMAIL_FIELD_REGISTRATION_FORM_ONE).type(tempMail);

    }

    public String waitUntilMailWithSubjectIsCome() {
        elementIsVisible(30, Locators.SUBJECT_OF_MAIL);
        return $(Locators.SUBJECT_OF_MAIL).getText();
    }

    public String copyConfirmationCodeToClipboard() {
        elementIsVisible(5, Locators.TEXT_OF_MESSAGE_WITH_CODE_OF_CONFIRMATION);
        return $(Locators.TEXT_OF_MESSAGE_WITH_CODE_OF_CONFIRMATION).getText();

    }

    public void openMessageByNumber(String numberOfMesaage) {
        elementIsVisible(5, Locators.OPEN_MESSAGE_BY_NUMBER_LINK.replace("$1", numberOfMesaage));
        $(Locators.OPEN_MESSAGE_BY_NUMBER_LINK.replace("$1", numberOfMesaage)).click();
    }

    public boolean messageHasBeenOpen() {
        return elementIsVisible(15, Locators.TEXT_OF_MESSAGE_WITH_CODE_OF_CONFIRMATION);
    }

    public void pasteConfirmationCodeToField(String confirmationCode) {
        $(Locators.CONFIRMATION_CODE_FIELD_REGISTRATION_PAGE).type(confirmationCode);
//        waitABit(5000);
    }

    public void enterUserNameWhenRegistrate(String randomUserName) {
        $(Locators.LOGIN_FIELD_REGISTRATION_PAGE).type(randomUserName);
    }

    public void enterPasswordsWhenRegistrate(String randomPassword) {
        $(Locators.PASSWORD_FIELD_ONE_REGISTRATION_PAGE).clear();
        $(Locators.PASSWORD_FIELD_ONE_REGISTRATION_PAGE).type(randomPassword);

        $(Locators.PASSWORD_FIELD_TWO_REGISTRATION_PAGE).clear();
        $(Locators.PASSWORD_FIELD_TWO_REGISTRATION_PAGE).type(randomPassword);

    }

    public void loginUnderARandomUser(String randomNum, String clipboard) {

        $(Locators.LOGIN_FIELD).clear();
        $(Locators.LOGIN_FIELD).type(clipboard);

        $(Locators.PASSWORD_FIELD).clear();
        $(Locators.PASSWORD_FIELD).type("qwerty" + randomNum);

        $(Locators.SUBMIT_BUTTON).click();
    }

    public void clickLink(String textLink) {
        $(Locators.LINK_BY_NAME.replace("$1", textLink)).click();

    }

    public List<WebElementFacade> getAllMessagesFromMail() {
        List<WebElementFacade> list = findAll(By.xpath(Locators.MESSAGES));
        return list;
    }

    public boolean newMessageWithSubjectIsCome(String subjectOfMessage) {
        List<WebElementFacade> list = findAll(By.xpath(Locators.MESSAGES));
        idLastMessage = findAll(By.xpath(Locators.MESSAGES)).size() - 1;
        if ((list.get(idLastMessage).getText().contains(subjectOfMessage))) {
            return true;
        }
        return false;
    }

    public boolean checkThatMessagesHaveBeenIncreasedByOne() {
        int quantityFromCurrentSession = (int) Serenity.getCurrentSession().get("MESSAGES");

        if (findAll(By.xpath(Locators.MESSAGES)).size() == (quantityFromCurrentSession + 1)) {
            return true;
        }
        return false;
    }


    public boolean waitUntillMessageComes() {
        int counter = 0;
        while ((counter <= 30) && !(checkThatMessagesHaveBeenIncreasedByOne())) {
            waitABit(500);
            counter++;
        }
        return checkThatMessagesHaveBeenIncreasedByOne();
    }

    public void enterRandomEmailToFieldEmail(String clipboard) {
        $(Locators.EMAIL_FIELD_REGISTRATION_FORM_ONE).sendKeys(clipboard);
    }

    public void updateMailListInTempMail() {
        $(Locators.BACK_TO_LIST_OF_MAILS_BUTTON).click();
        elementIsVisible(10, Locators.FIELD_WITH_TEMP_EMAIL);
    }

    public void openLastMessageInTempMail() {
        String str = Integer.toString(idLastMessage + 1);
        elementIsVisible(5, Locators.OPEN_MESSAGE_BY_NUMBER_LINK.replace("$1", str));
        $(Locators.OPEN_MESSAGE_BY_NUMBER_LINK.replace("$1", str)).click();
        waitMSeconds(3000);

    }

    public String copyGeneratePasswordToClipboard() {

        return $(Locators.GENERATE_PASSWORD_CONTAINER).getText();
    }

    public void typeToFieldGeneratedPassFromClipboard(String generatedPassword) {
        $(Locators.GENERETED_PASSWORD_FIELD).sendKeys(generatedPassword);
    }

    public void typeToLoginFieldValueOfTampMail(String clipboard) {
        $(Locators.LOGIN_FIELD).sendKeys(clipboard);
    }

    public void typeToPasswordFieldGeneretedPassword(String generatedPassword) {
        $(Locators.PASSWORD_FIELD).sendKeys(generatedPassword);
    }
}


