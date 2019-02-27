package aim.chat.steps.serenity;

import aim.chat.Tools.RandomGenerator;
import aim.chat.locators.Locators;
import aim.chat.pages.CommonElements;
import aim.chat.pages.DictionaryPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.awt.*;
import java.net.URISyntaxException;

public class EndUserSteps extends PageObject {
    RandomGenerator randomGenerator;
    DictionaryPage dictionaryPage;
    CommonElements commonElements;

    String oldValue = "";
    String newValue = "";
    String clipboard = "";
    String confirmationCode = "";
    String randomNum = "";
    String generatedPassword = "";


//    @Step
//    public void enters(String keyword) {
//        dictionaryPage.enter_keywords(keyword);
//    }
//
//    @Step
//    public void starts_search() {
//        dictionaryPage.lookup_terms();
//    }

    /*@Step
    public void should_see_definition(String definition) {
        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
    }*/
//
//    @Step
//    public void is_the_home_page() {
//        dictionaryPage.open();
//    }
//
////    @Step
////    public void looks_for(String term) {
////        enters(term);
////        starts_search();
////    }

    @Step
    public void theUserIsOnTheChatLoginPage() {
        dictionaryPage.theUserIsOnTheChatLoginPage();
    }

    @Step
    public void loginUnderTheUser() {
        dictionaryPage.loginUnderTheUser();
    }

    @Step
    public void chatHasBeenOpened() {

        commonElements.waitUntilElementAppearsAndDissappears(Locators.AIM_CHAT_LOADER);
        Assert.assertTrue("chat has not been opened", dictionaryPage.chatHasBeenOpened());
    }


    @Step
    public void userLogOutOfChat() {
        dictionaryPage.userLogOutOfChat();

    }

    @Step
    public void loginPageOpen() {
        Assert.assertTrue("user has not been sing out of chat", dictionaryPage.loginPageOpen());
    }


    @Step
    public void loginFieldClear() {
        dictionaryPage.loginFieldClear();
    }

    @Step
    public void passwordFieldClear() {
        dictionaryPage.passwordFieldClear();
    }


    @Step
    public void erorMessagesShow() {
        Assert.assertTrue("error message is not displayed", dictionaryPage.errorMessagesShow());
    }

    @Step
    public void buttonSubmitUnusable() {
        Assert.assertFalse("Button submit is active", dictionaryPage.buttonSubmitUnusable());
    }

    @Step
    public void userEnterIncorrectEmail() {
        dictionaryPage.userEnterIncorrectEmail();
    }

    @Step
    public void userEnterIncorrectPassword() {
        dictionaryPage.userEnterIncorrectPassword();
    }

    @Step
    public void clickButtonSubmit() {
        dictionaryPage.clickButtonSubmit();
    }

    @Step
    public void errorUnauthorizedMessageShow() {
        Assert.assertTrue("Unauthorizade error is not displayed ", dictionaryPage.errorUnauthorizedMessageShow());
    }

    @Step
    public void userEnterLoginWithSpecialCharacters() {
        dictionaryPage.userEnterLoginWithSpecialCharacters();
    }

    @Step
    public void userEnterCorrectPassword() {
        dictionaryPage.userEnterCorrectPassword();
    }

    @Step
    public void errorMessagesOnlyLatinShow() {
        Assert.assertTrue("Message is not displayed", dictionaryPage.errorMessagesOnlyLatinShow());

    }

    @Step
    public void userEnterLoginWithCyrillicCharacters() {
        dictionaryPage.userEnterLoginWithCyrillicCharacters();
    }

    @Step
    public void userEnterCorrectLogin() {
        dictionaryPage.userEnterCorrectLogin();
    }

    @Step
    public void holdIconShowPassword() {
        dictionaryPage.holdIconShowPassword();
    }

    @Step
    public void passwordIsNotVisible() {
        Assert.assertTrue("password is visible", dictionaryPage.passwordIsNotVisible());
    }

    @Step
    public void registrationPageOneIsOpen() {
        Assert.assertTrue("page 1 of registration is not opened", dictionaryPage.registrationPageOneIsOpen());
    }

    @Step
    public void inputFieldEmailOnPageOneOfRegistrationIsEmpty() {
        dictionaryPage.inputFieldEmailOnPageOneOfRegistrationIsEmpty();
    }

    @Step
    public void clickButtonSubmitPageOneOfRegistration() {
        dictionaryPage.clickButtonSubmitPageOneOfRegistration();
    }

    @Step
    public void pageOneOfRegistrationIsOpened() {
        Assert.assertTrue("Registration page 2 is opened", dictionaryPage.pageOneOfRegistrationIsOpened());
    }

    @Step
    public void clickButtonCancel() {
        dictionaryPage.clickButtonCancel();
    }

    @Step
    public void userEnterFollowingEmail(String value) {
        dictionaryPage.userEnterFollowingEmail(value);
    }

    @Step
    public void errorMessageHasBeenShown() {
        Assert.assertTrue("Error message has not been shown",
                dictionaryPage.errorMessageHasBeenShown());
    }

    @Step
    public void userEnterValidEmailOnTheRegistrationPage() {
        dictionaryPage.userEnterValidEmailOnTheRegistrationPage();
    }

    @Step
    public void clickButtonSubmitSecondPageOfRegistration() {
        dictionaryPage.clickButtonSubmitSecondPageOfRegistration();

    }

    @Step
    public void pageTwoOfRegistrationIsOpened() {
        Assert.assertTrue("Registration page 2 is closed", dictionaryPage.pageTwoOfRegistrationIsOpened());
    }

    @Step
    public void typeToLoginField(String text) {

        dictionaryPage.typeToFieldLogin(text);
    }

    @Step
    public void typeToPasswordOneField(String text) {

        dictionaryPage.typeToPasswordOneField(text);
    }

    @Step
    public void typeToPasswordTwoField(String text) {

        dictionaryPage.typeToPasswordTwoField(text);
    }

    @Step
    public void typeToConfirmationCodeField(String text) {
        dictionaryPage.typeToConfirmationCodeField(text);
    }

    @Step
    public void errorMessagesOnRegistrationPageIsShow() {
        Assert.assertTrue("Error message is not displayed", dictionaryPage.errorMessagesOnRegistrationPageIsShow());
    }

    @Step
    public void clickLinkRegistrationOnTheLoginPage() {

        dictionaryPage.clickLinkRegistrationOnTheLoginPage();
    }

    @Step
    public void userOpenedProfileSettings() {
        commonElements.waitUntilElementToBeInvisible(250, Locators.AIM_CHAT_LOADER);
        commonElements.waitUntilElementToBeVisible(250, Locators.USER_DROP_DOWN_MENU);

        dictionaryPage.userOpenedProfileSettings();
    }

    @Step
    public void clickButtonSave() {
        dictionaryPage.clickButtonSave();
    }

//    @Step
//    public void errorMessagesForFieldsDisplayed() {
//        Assert.assertEquals("",dictionaryPage.errorMessagesForFieldsDisplayed());
//    }

    @Step
    public void userChooseAvatar(String text) throws URISyntaxException {
        dictionaryPage.upload(dictionaryPage.
                getAbsolutePathOfFile(text)).
                to(dictionaryPage.getElementByXpath("//input[@type='file']"));
        commonElements.elementIsVisible(3, "//i[contains(@class,'fa fa-undo')]");


    }

    @Step
    public void userClickAvatarSaveButton() {
        dictionaryPage.userClickAvatarSaveButton();
    }

    @Step
    public void srcOfFirstPicture() {
        dictionaryPage.srcOfPicture();
        oldValue = dictionaryPage.srcOfPicture();
    }

    @Step
    public void typeToFieldValue(String fieldName, String value) {
        dictionaryPage.typeToFieldValue(fieldName, value);

    }

    @Step
    public void clearField(String fieldName) {
        dictionaryPage.clearField(fieldName);
    }


    @Step
    public void fieldShouldHaveValue(String fieldName, String value) {
        Assert.assertEquals("value is not same", dictionaryPage.getFieldValue(fieldName), value);
    }

    @Step
    public void srcOfSecondPicture() {
        dictionaryPage.srcOfPicture();
        newValue = dictionaryPage.srcOfPicture();
    }

    @Step
    public void avatarIsChanged() {
        Assert.assertNotEquals("avatar is not changed", oldValue, newValue);
    }

    @Step
    public void changeTimezone() {
        oldValue = dictionaryPage.oldValueOfTimezone();
        dictionaryPage.changeTimezone();
    }

    @Step
    public void newTimezoneIsSaved() {
        dictionaryPage.newValueOfTimezone();
        Assert.assertNotEquals("Timezone is not changed", newValue, dictionaryPage.newValueOfTimezone());
    }

    @Step
    public void avatarIsNotChanged() {
        Assert.assertEquals("Avatar is chenged to unsupported format", oldValue, newValue);
    }

    @Step
    public void errorMessageForAvatarIsShow() {
        Assert.assertTrue("Error message is not show", dictionaryPage.errorMessageForAvatarIsShow());
    }

    @Step
    public void clickBackIconInUserMenu() {
        Assert.assertTrue("main page of chat is not opened", dictionaryPage.clickBackIconInUserMenu());
    }

    @Step
    public void newTimezoneIsNotSaved() {
        Assert.assertEquals("Value of time zone is saved", oldValue, dictionaryPage.getValueOfTimezone());
    }

    @Step
    public void changeTimezoneAndNotSave() {
        oldValue = dictionaryPage.getValueOfTimezone();
        dictionaryPage.changeTimezoneAndNotSave();


    }

    @Step
    public void addUserToDirectList(String userName) {
        dictionaryPage.addUserToDirectList(userName);
    }

    @Step
    public void directWithUserIsOpened(String userName) {
        Assert.assertTrue("Direct with " + userName + " is mot opened", dictionaryPage.directWithUserIsOpened(userName));
    }

    @Step
    public void sendMessageWithText(String textOfMessage) {
        dictionaryPage.sendMessageWithText(textOfMessage);
    }

    @Step
    public void deleteDirectWithUser(String userName) {
        dictionaryPage.deleteDirectWithUser(userName);
    }

    @Step
    public void directWithUserIsDeletedFromList(String userName) {
        commonElements.elementIsInvisible(5, Locators.DIRECT_WITH_USER.replace("$1", userName));
        Assert.assertFalse("direct with user " + userName + " is not deleted from list", dictionaryPage.directWithUserIsDeletedFromList(userName));
    }

    @Step
    public void loginUnderTheUserTwo() {
        dictionaryPage.loginUnderTheUserTwo();
    }

    @Step
    public void userHaveUnreadMessagesFromUser(String userName) {
        Assert.assertTrue("user " + userName + " is not have unread messages", dictionaryPage.userHaveUnreadMessagesFromUser(userName));
        Assert.assertEquals("Icon about 1 unread message from" + userName + " is displayed", "1", dictionaryPage.valueOfUnreadMessages(userName));
    }

    @Step
    public void openUnreadMessageFromUser(String userName) {
        dictionaryPage.openUnreadMessageFromUser(userName);
    }


    @Step
    public void iconAboutUnreadMessageFromIsNotDisplayed(String userName) {

        Assert.assertTrue("Icon about unread message from" + userName + " is displayed", dictionaryPage.iconAboutUnreadMessageFromIsNotDisplayed(userName));
    }

    @Step
    public void userTurnOffNotifications() {

        int counter = 0;
        do {

            dictionaryPage.userClickNotificationsSwitcher();
            counter++;
        }
        while ((!dictionaryPage.messageAboutNotificationsIsVisible()) || (counter > 5));
        if (dictionaryPage.getTextFromMessageAboutNotifications().equals("Chat is unmuted")) {
            dictionaryPage.userClickNotificationsSwitcher();
        }

    }

    @Step
    public void userIsHaveMessageAbout(String message) {
        Assert.assertEquals("Message is not showed", message, dictionaryPage.getTextFromMessageAboutNotifications());
    }

    @Step
    public void userTurnOnNotifications() {
        int counter = 0;
        do {

            dictionaryPage.userClickNotificationsSwitcher();
            counter++;
        }
        while ((!dictionaryPage.messageAboutNotificationsIsVisible()) || (counter > 5));
        if (dictionaryPage.getTextFromMessageAboutNotifications().equals("Chat is muted")) {
            dictionaryPage.userClickNotificationsSwitcher();
        }
    }

    @Step
    public void userClickNotificationsSwitcher() {
        dictionaryPage.userClickNotificationsSwitcher();
    }

    @Step
    public void openPage(String pageURL) {
        dictionaryPage.openPage(pageURL);
    }

    @Step
    public void accauntSettingsPageIsOpened() {
        Assert.assertTrue("Accaunt settings page is not opened", commonElements.elementIsVisible(5, Locators.OLD_PASSWORD_FIELD) && commonElements.elementIsVisible(5, Locators.NEW_PASSWORD_FIELD));
    }

    @Step
    public void clickButtonSaveForField(String fieldName) {
        dictionaryPage.clickButtonSaveForField(fieldName);
    }

    @Step
    public void confirmationCodeIsNotSend() {
        Assert.assertFalse("Message about sending confirmation code is displayed", commonElements.elementIsVisible(3, Locators.MESSAGE_ABOUT_SENDING_CODE_OF_CONFIRMATION));
    }

    @Step
    public void errorMessageIsShowed(String textOfMessage) {
        Assert.assertEquals("Error message is not same with" + textOfMessage, textOfMessage, dictionaryPage.errorMessageIsShowed());
    }

    @Step
    public void buttonSaveForPasswordsFieldsUnusable() {
        Assert.assertFalse("Button is active", dictionaryPage.buttonSaveForPasswordsFieldsUnusable());
    }

    @Step
    public void errorMessageForPasswordsFieldsIsShowed() {
        Assert.assertTrue("Error message about incorect password is not show", dictionaryPage.errorMessageForPasswordsFieldsIsShowed());
    }

    @Step
    public void messageAboutChangedPasswordIsShowed() {
        Assert.assertTrue("Message about changed password is not show", dictionaryPage.messageAboutChangedPasswordIsShowed());
    }

    @Step
    public void messageAboutChangedUsernameIsNotShowed() {
        Assert.assertFalse("Message is showed, user name is changed", dictionaryPage.messageAboutChangedUsernameIsShowed());
    }

    @Step
    public void messageAboutChangedUsernameIsShowed() {
        Assert.assertTrue("Message is not showed, user name is changed", dictionaryPage.messageAboutChangedUsernameIsShowed());
    }

    @Step
    public void userNameInUserMenuIsChangedTo(String userName) {
        Assert.assertEquals("User name not same", userName, dictionaryPage.userNameInUserMenuIsChangedTo(userName));
    }

    @Step
    public void popupIsOpen(String titleName) {
        Assert.assertEquals("Modal window is not opened", titleName, dictionaryPage.popupIsOpen());
    }

    @Step
    public void clickCreateRoomIcon() {
        dictionaryPage.clickCreateRoomIcon();
        commonElements.waitUntilElementToBeVisible(5, Locators.MODAL_WINDOW_TITLE);
    }

    @Step
    public void typeRoomNameWhenCratedRoom(String roomName) {
        dictionaryPage.typeRoomNameWhenCratedRoom(roomName);
    }

    @Step
    public void inviteMemberWhenCreatedRoom(String userName) {
        dictionaryPage.inviteMemberWhenCreatedRoom(userName);
    }

    @Step
    public void deleteInvitedUserWithNameWhenCreatedRoom(String userName) {
        dictionaryPage.deleteInvitedUserWithNameWhenCreatedRoom(userName);
    }

    @Step
    public void addDescriptionOfRoomWhenCreatedRoom(String text) {
        dictionaryPage.addDescriptionOfRoomWhenCreatedRoom(text);
    }

    @Step
    public void chooseRadioButtonWhenCreatedRoom(String nameRadioButton) {
        dictionaryPage.chooseRadioButtonWhenCreatedRoom(nameRadioButton);
    }

    @Step
    public void clickButtonByName(String nameOfButton) {
        commonElements.elementIsVisible(5, Locators.BUTTON_BY_NAME.replace("$1", nameOfButton));
        dictionaryPage.clickButtonByName(nameOfButton);
    }

    @Step
    public void clickButtonByNameIsDisabled(String nameOfButton) {
        Assert.assertFalse("Button is active", dictionaryPage.clickButtonByNameIsDisabled(nameOfButton));
    }

    @Step
    public void roomWithNameIsOpened(String roomName) {
        Assert.assertTrue("Room is not created(opened)", dictionaryPage.roomWithNameIsOpened(roomName));
    }


    @Step
    public void roomWithNameIsDeleted(String roomName) {
        commonElements.elementIsInvisible(5, Locators.ROOM_IN_LEFT_SIDE_BAR.replace("$1", roomName));
        Assert.assertTrue("Room has not deleted", dictionaryPage.roomWithNameIsDeleted(roomName));
    }

    @Step
    public void openRoomWithName(String roomName) {
        commonElements.elementIsVisible(5, Locators.ROOM_IN_LEFT_SIDE_BAR.replace("$1", roomName));
        dictionaryPage.openRoomWithName(roomName);
    }

    @Step
    public void clickButtonInRightSideBar(String buttonName) {
        dictionaryPage.clickButtonInRightSideBar(buttonName);
    }

    @Step
    public void rightSlideBarIsOpened(String titleName) {
        Assert.assertEquals("Right slide bar is not opened", titleName, dictionaryPage.rightSlideBarIsOpened(titleName));
    }

    @Step
    public void clickButtonByNameDeleteRoom() {
        dictionaryPage.clickButtonByNameDeleteRoom();
    }

    @Step
    public void popupIsClosed(String titleName) {
        Assert.assertFalse("Pop-up window is opened", dictionaryPage.popupIsClosed(titleName));

    }

    @Step
    public void userWithNameIsOnRoomMembersList(String userName) {
        Assert.assertTrue("User " + userName + " is not added to room members list", dictionaryPage.userWithNameIsOnRoomMembersList(userName));
    }

    @Step
    public void userWithNameIsNotOnRoomMembersList(String userName) {
        Assert.assertTrue("User " + userName + " is added to room members list", dictionaryPage.userWithNameIsNotOnRoomMembersList(userName));
    }

    @Step
    public void clickAddNewMemberToRoomIcon() {
        dictionaryPage.clickAddNewMemberToRoomIcon();
    }

    @Step
    public void inviteMemberWhenRoomAlreadyCreated(String userName) {
        dictionaryPage.inviteMemberWhenRoomAlreadyCreated(userName);
    }

    @Step
    public void deleteUserFromRoom(String userName) {
        dictionaryPage.deleteUserFromRoom(userName);
    }

    @Step
    public void assignToAdministrateUserWithName(String userName) {
        dictionaryPage.assignToAdministrateUserWithName(userName);
    }

    @Step
    public void userHasBeenAddToAdministratorsList(String userName) {
        Assert.assertTrue("User " + userName + " has not add to administrator list", dictionaryPage.userHasBeenAddToAdministratorsList(userName));
    }

    @Step
    public void userHasNotBeenAddToAdministratorsList(String userName) {
        Assert.assertFalse("user " + userName + " is added to administrator list", dictionaryPage.userHasBeenAddToAdministratorsList(userName));
    }

    @Step
    public void typeToFieldAssignNewAdministratorUserName(String userName) {
        dictionaryPage.typeToFieldAssignNewAdministratorUserName(userName);
    }

    @Step
    public void clickToUserNameInDropDownListOfUsers(String userName) {
        dictionaryPage.clickToUserNameInDropDownListOfUsers(userName);
    }

    @Step
    public void userLeaveTheRoom(String roomName) {
        commonElements.elementIsInvisible(5, Locators.ROOM_IN_LEFT_SIDE_BAR.replace("$1", roomName));
        Assert.assertTrue("user is not leave the room " + roomName, dictionaryPage.roomWithNameIsDeleted(roomName));
    }

    @Step
    public void clickButtonByNameLeaveRoom() {
        dictionaryPage.clickButtonByNameLeaveRoom();
    }

    @Step
    public void openNewTab(String url) {
        dictionaryPage.openNewTab(url);
    }

    @Step
    public void switchToCurrentTab(int numberOfTab) {
        dictionaryPage.switchToCurrentTab(numberOfTab);
    }

    @Step
    public void copyValueOfEmailToClipboard() {
        dictionaryPage.copyValueOfEmailToClipboard();
        clipboard = dictionaryPage.copyValueOfEmailToClipboard();
    }

    @Step
    public void pasteTempMailFromClipboard() {

        String tempMail = "";
        tempMail = clipboard;
        dictionaryPage.pasteTempMailFromClipboard(tempMail);
    }

    @Step
    public void waitUntilMailWithSubjectIsCome(String subjectOfMail) {
        Assert.assertEquals("Mail is not came", subjectOfMail, dictionaryPage.waitUntilMailWithSubjectIsCome());
    }

    @Step
    public void copyConfirmationCodeToClipboard() {

        String textOfMessage = dictionaryPage.copyConfirmationCodeToClipboard();
        confirmationCode = textOfMessage.replace("Here is your code confirmation ", "");

    }

    @Step
    public void openMessageByNumber(String numberOfMesaage) {
        dictionaryPage.openMessageByNumber(numberOfMesaage);
    }

    @Step
    public void messageHasBeenOpen() {
        Assert.assertTrue("Message has not been opened", dictionaryPage.messageHasBeenOpen());
    }

    @Step
    public void pasteConfirmationCodeToField() {
        dictionaryPage.pasteConfirmationCodeToField(confirmationCode);
    }

    @Step
    public void enterValidUserNameAndPasswords() {
        randomNum = randomGenerator.randomGeneratorNumeric(4);
        String randomUserName = "testuser" + randomNum;
        String randomPassword = "qwerty" + randomNum;

        dictionaryPage.enterUserNameWhenRegistrate(randomUserName);
        dictionaryPage.enterPasswordsWhenRegistrate(randomPassword);
    }

    @Step
    public void loginUnderARandomUser() {
        dictionaryPage.loginUnderARandomUser(randomNum, clipboard);
    }

    @Step
    public void clickLink(String textLink) {
        dictionaryPage.clickLink(textLink);
    }

    @Step
    public void putNumberOfMessagesFromMailIntoCurrentSession() {
        Serenity.getCurrentSession().put("MESSAGES", dictionaryPage.getAllMessagesFromMail().size());
    }


    @Step
    public void newMessageWithSubjectIsCome(String subjectOfMessage) {

//        int quantityOfAllMessagesFromCurrentSession = (int) Serenity.getCurrentSession().get("MESSAGES");

        Assert.assertTrue("New message is not comes time is off", dictionaryPage.waitUntillMessageComes());

//        Assert.assertEquals((quantityOfAllMessagesFromCurrentSession + 1), dictionaryPage.getAllMessagesFromMail().size());

        Assert.assertTrue("New message with subject " + subjectOfMessage + " is not come", dictionaryPage.newMessageWithSubjectIsCome(subjectOfMessage));
    }

    @Step
    public void enterRandomEmailToFieldEmail() {
        dictionaryPage.enterRandomEmailToFieldEmail(clipboard);
    }

    @Step
    public void updateMailListInTempMail() {
        dictionaryPage.updateMailListInTempMail();
    }

    @Step
    public void openLastMessageInTempMail() {
        dictionaryPage.openLastMessageInTempMail();

    }

    @Step
    public void copyGeneratePasswordToClipboard() {
        generatedPassword = dictionaryPage.copyGeneratePasswordToClipboard();
    }

    @Step
    public void typeToFieldGeneratedPassFromClipboard() {
        dictionaryPage.typeToFieldGeneratedPassFromClipboard(generatedPassword);
    }

    @Step
    public void typeToLoginFieldValueOfTampMail() {
        dictionaryPage.typeToLoginFieldValueOfTampMail(clipboard);
    }

    @Step
    public void typeToPasswordFieldGeneratedPassword() {
        dictionaryPage.typeToPasswordFieldGeneratedPassword(generatedPassword);
    }

    @Step
    public void userSendRandomMessageToChat(int value) {

        int counter = 0;
        do {
            String randomMessage = randomGenerator.randomGeneratorAlphaNumeric(25);
            dictionaryPage.userSendRandomMessageToChat(randomMessage);
            counter++;
        }
        while (counter < value);
    }

    @Step
    public void scrollChatToMessageOfNumber(String numberOfMessage) throws AWTException {
        dictionaryPage.scrollChatToMessageOfNumber(dictionaryPage.xpathOfMessageInChatByNumber(numberOfMessage));
    }

    @Step
    public void messageWithNumberIsNotVisible(String numberOfMessage) {
        Assert.assertFalse("Message is visible", dictionaryPage.messageWithNumberIsVisible(numberOfMessage));
//        Assert.assertEquals("Message is visible", false, dictionaryPage.messageWithNumberIsVisible(numberOfMessage));
    }

    @Step
    public void messageWithNumberIsVisible(String numberOfMessage) {
        Assert.assertTrue("Message is not visible", dictionaryPage.messageWithNumberIsVisible(numberOfMessage));
//        Assert.assertEquals("Message is not visible", true, dictionaryPage.messageWithNumberIsVisible(numberOfMessage));
    }

    @Step
    public void staredMessageByNumber(String numberOfMessage) {
        dictionaryPage.staredMessageByNumber(dictionaryPage.xpathOfStarForMessageInChatByNumber(numberOfMessage));

    }

    @Step

    public void valueOfStarredMessageIncreasedBy(int increasedBy) {
        int numBefore = (int) Serenity.getCurrentSession().get("START NUMBER");
        Assert.assertEquals("Value of starred messages is not same",
                numBefore + increasedBy,
                dictionaryPage.getValueOfStarredMessagesAfterAddNewStarredMessage());
    }

    @Step
    public void getValueOfStarredMessagesBeforeAddNewStarredMessage() {
        Serenity.getCurrentSession().put("START NUMBER", dictionaryPage.getValueOfStarredMessagesBeforeAddNewStarredMessage());
    }

    public void getValueOfStarredMessagesAfterAddNewStarredMessage() {
        dictionaryPage.getValueOfStarredMessagesAfterAddNewStarredMessage();
    }

    public void clickLinkByNumber(String linkText, int numberOfMessage) {
        dictionaryPage.clickLinkByNumber(linkText, numberOfMessage);
    }

    public void getTextOfMessageFromStarredMessageByNumber(String numberOfMessage) {
        Serenity.getCurrentSession().put("TEXT OF STARRED MESSAGE", dictionaryPage.getTextOfMessageFromStarredMessageByNumber(numberOfMessage));
    }

    public void chatScrolledToMessageAndHighlightIt() {
        Assert.assertEquals("Message is not highlighted or chat not scrolled",
                (String) Serenity.getCurrentSession().get("TEXT OF STARRED MESSAGE"),
                dictionaryPage.getTextOfHighlightedMessage());
    }

    public void moveMouseToStarredMessageByNumber(String numberOfMessage) {
        dictionaryPage.moveMouseToStarredMessageByNumber(numberOfMessage);

    }

    public void deleteRoomWithNameIfItAlreadyCreated(String roomName) {
        if (commonElements.elementIsVisible(5, Locators.ROOM_IN_LEFT_SIDE_BAR.replace("$1", roomName))) {
            dictionaryPage.openRoomWithName(roomName);
            roomWithNameIsOpened(roomName);
            dictionaryPage.clickButtonInRightSideBar("Room settings");
            rightSlideBarIsOpened("Room settings");
            dictionaryPage.clickButtonByNameDeleteRoom();
            popupIsOpen("Delete Room" + roomName);
            dictionaryPage.clickButtonByName("Delete");
            roomWithNameIsDeleted(roomName);
        }
    }
}
