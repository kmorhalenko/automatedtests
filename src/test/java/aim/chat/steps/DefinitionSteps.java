package aim.chat.steps;

import aim.chat.steps.serenity.EndUserSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

import java.awt.*;
import java.net.URISyntaxException;

public class DefinitionSteps {

    @Steps
    EndUserSteps user;

    @Given("^the user is on the Chat login page$")
    public void theUserIsOnTheChatLoginPage() {
        user.theUserIsOnTheChatLoginPage();
    }

    @Given("^login under the user$")
    public void loginUnderTheUser() {
        user.loginUnderTheUser();
    }

    @Then("^chat has been opened$")
    public void chatHasBeenOpened() {
        user.chatHasBeenOpened();
    }


    @When("^user log out of chat$")
    public void userLofOutOfChat() {
        user.userLogOutOfChat();
    }

    @Then("^login page open$")
    public void loginPageOpen() {
        user.loginPageOpen();
    }


    @When("^login field clear$")
    public void loginFieldClear() {
        user.loginFieldClear();
    }

    @When("^password field clear$")
    public void passwordFieldClear() {
        user.passwordFieldClear();
    }

    @When("^button submit unusable$")
    public void buttonSubmitUnusable() {
        user.buttonSubmitUnusable();
    }

    @Then("^error messages show$")
    public void errorMessagesShow() {
        user.erorMessagesShow();
    }

    @When("^User enter incorrect email$")
    public void userEnterIncorrectEmail() {
        user.userEnterIncorrectEmail();

    }

    @When("^User enter incorrect password$")
    public void userEnterIncorrectPassword() {
        user.userEnterIncorrectPassword();
    }

    @When("^Click button submit$")
    public void clickButtonSubmit() {
        user.clickButtonSubmit();
    }

    @Then("^error unauthorized message show$")
    public void errorUnauthorizedMessageShow() {
        user.errorUnauthorizedMessageShow();
    }

    @When("^User enter login with special characters$")
    public void userEnterLoginWithSpecialCharacters() {
        user.userEnterLoginWithSpecialCharacters();
    }

    @When("User enter correct password$")
    public void userEnterCorrectPassword() {
        user.userEnterCorrectPassword();
    }

    @Then("^error messages only latin show$")
    public void errorMessagesOnlyLatinShow() {
        user.errorMessagesOnlyLatinShow();
    }


    @When("^User enter login with cyrillic characters$")
    public void userEnterPasswordWithCyrillicCharacters() {
        user.userEnterLoginWithCyrillicCharacters();
    }


    @When("^User enter correct login$")
    public void userEnterCorrectLogin() {
        user.userEnterCorrectLogin();
    }

    @When("^Hold icon show password$")
    public void holdIconShowPassword() {
        user.holdIconShowPassword();
    }

    @Then("^Password is not visible$")
    public void passwordIsNotVisible() {
        user.passwordIsNotVisible();
    }


    @Given("^registration page one is open$")
    public void registrationPageOneIsOpen() {
        user.registrationPageOneIsOpen();
    }

    @When("^input field email on page one of registration is empty$")
    public void inputFieldEmailOnPageOneOfRegistrationIsEmpty() {
        user.inputFieldEmailOnPageOneOfRegistrationIsEmpty();
    }

    @When("^click button submit page one of registration$")
    public void clickButtonSubmitPageOneOfRegistration() {
        user.clickButtonSubmitPageOneOfRegistration();
    }

    @Then("^page one of registration is opened$")
    public void pageOneOfRegistrationIsOpened() {
        user.pageOneOfRegistrationIsOpened();
    }

    @When("^click button cancel$")
    public void clickButtonCancel() {
        user.clickButtonCancel();
    }

    @When("^User enter following email \"([^\"]*)\"$")
    public void userEnterFollowingEmail(String value) throws Throwable {
        user.userEnterFollowingEmail(value);
    }

    @Then("^Error message has been shown$")
    public void errorMessageHasBeenShown() {
        user.errorMessageHasBeenShown();
    }

    @When("^user enter valid email on the registration page$")
    public void userEnterValidEmailOnTheRegistrationPage() {
        user.userEnterValidEmailOnTheRegistrationPage();
    }

    @When("^click button submit second page of registration$")
    public void clickButtonSubmitSecondPageOfRegistration() {
        user.clickButtonSubmitSecondPageOfRegistration();
    }

    @Then("^page two of registration is opened$")
    public void pageTwoOfRegistrationIsOpened() {
        user.pageTwoOfRegistrationIsOpened();
    }

    @When("^type to login field \"([^\"]*)\"$")
    public void typeToLoginField(String text) throws Throwable {
        user.typeToLoginField(text);
    }

    @When("^type to password one field \"([^\"]*)\"$")
    public void typeToPasswordOneField(String text) throws Throwable {
        user.typeToPasswordOneField(text);
    }

    @When("^type to password two field \"([^\"]*)\"$")
    public void typeToPasswordTwoField(String text) throws Throwable {
        user.typeToPasswordTwoField(text);
    }

    @When("^type to confirmation code field \"([^\"]*)\"$")
    public void typeToConfirmationCodeField(String text) throws Throwable {
        user.typeToConfirmationCodeField(text);
    }


    @Then("^error messages on registration page is show$")
    public void errorMessagesOnRegistrationPageIsShow() {
        user.errorMessagesOnRegistrationPageIsShow();
    }

    @When("^click link registration on the login page$")
    public void clickLinkRegistrationOnTheLoginPage() {
        user.clickLinkRegistrationOnTheLoginPage();
    }

    @When("^user opened profile settings$")
    public void userOpenedProfileSettings() {
        user.userOpenedProfileSettings();
    }


    @When("^click button save$")
    public void clickButtonSave() {
        user.clickButtonSave();

    }
//
//    @Then("^error messages for fields displayed$")
//    public void errorMessagesForFieldsDisplayed() {
//        user.errorMessagesForFieldsDisplayed();
//    }

    @When("^user choose \"([^\"]*)\" avatar$")
    public void userChooseAvatar(String text) throws URISyntaxException {
        user.userChooseAvatar(text);
    }

    @When("^user click avatar save button$")
    public void userClickAvatarSaveButton() {
        user.userClickAvatarSaveButton();
    }

    @When("^src of first picture$")
    public void srcOfFirstPicture() {
        user.srcOfFirstPicture();
    }

    @When("^type to field \"([^\"]*)\" value \"([^\"]*)\"$")
    public void typeToFieldValue(String fieldName, String value) throws Throwable {
        user.typeToFieldValue(fieldName, value);

    }

    @When("^clear field \"([^\"]*)\"$")
    public void clearField(String fieldName) throws Throwable {
        user.clearField(fieldName);
    }


    @Then("^\"([^\"]*)\" field should have \"([^\"]*)\" value$")
    public void fieldShouldHaveValue(String fieldName, String value) throws Throwable {
        user.fieldShouldHaveValue(fieldName, value);
    }

    @When("^src of second picture$")
    public void srcOfSecondPicture() {
        user.srcOfSecondPicture();
    }

    @Then("^Avatar is changed$")
    public void avatarIsChanged() {
        user.avatarIsChanged();
    }

    @When("^change timezone$")
    public void changeTimezone() {
        user.changeTimezone();
    }

    @Then("^new timezone is saved$")
    public void newTimezoneIsSaved() {
        user.newTimezoneIsSaved();

    }

    @Then("^avatar is not changed$")
    public void avatarIsNotChanged() {
        user.avatarIsNotChanged();
    }

    @Then("^error message for avatar is show$")
    public void errorMessageForAvatarIsShow() {
        user.errorMessageForAvatarIsShow();
    }

    @When("^click back icon in user menu$")
    public void clickBackIconInUserMenu() {
        user.clickBackIconInUserMenu();
    }

    @Then("^new timezone is not saved$")
    public void newTimezoneIsNotSaved() {
        user.newTimezoneIsNotSaved();
    }

    @When("^change timezone and not save$")
    public void changeTimezoneAndNotSave() {
        user.changeTimezoneAndNotSave();
    }

    @When("^add user \"([^\"]*)\" to direct list$")
    public void addUserToDirectList(String userName) throws Throwable {
        user.addUserToDirectList(userName);

    }

    @Then("^direct with user \"([^\"]*)\" is opened$")
    public void directWithUserIsOpened(String userName) throws Throwable {
        user.directWithUserIsOpened(userName);

    }

    @Then("^Send message with text \"([^\"]*)\"$")
    public void sendMessageWithText(String textOfMessage) throws Throwable {
        user.sendMessageWithText(textOfMessage);

    }

    @Then("^delete direct with user \"([^\"]*)\"$")
    public void deleteDirectWithUser(String userName) throws Throwable {
        user.deleteDirectWithUser(userName);

    }

    @Then("^direct with user \"([^\"]*)\" is deleted from list$")
    public void directWithUserIsDeletedFromList(String userName) throws Throwable {
        user.directWithUserIsDeletedFromList(userName);

    }

    @When("^login under the user two$")
    public void loginUnderTheUserTwo() {
        user.loginUnderTheUserTwo();
    }

    @Then("^user have unread messages from \"([^\"]*)\" user$")
    public void userHaveUnreadMessagesFromUser(String userName) throws Throwable {
        user.userHaveUnreadMessagesFromUser(userName);

    }

    @When("^Open unread message from user \"([^\"]*)\"$")
    public void openUnreadMessageFromUser(String userName) throws Throwable {
        user.openUnreadMessageFromUser(userName);
    }


    @Then("^icon about unread message from \"([^\"]*)\" is not displayed$")
    public void iconAboutUnreadMessageFromIsNotDisplayed(String userName) throws Throwable {
        user.iconAboutUnreadMessageFromIsNotDisplayed(userName);
    }

    @When("^User turn-off notifications$")
    public void userTurnOffNotifications() {
        user.userTurnOffNotifications();
    }

    @Then("^user is have message about \"([^\"]*)\"$")
    public void userIsHaveMessageAbout(String message) throws Throwable {
        user.userIsHaveMessageAbout(message);
    }

    @When("^User turn-on notifications$")
    public void userTurnOnNotifications() {
        user.userTurnOnNotifications();
    }

    @When("^User click notifications switcher$")
    public void userClickNotificationsSwitcher() {
        user.userClickNotificationsSwitcher();
    }


    @Given("^open page \"([^\"]*)\"$")
    public void openPage(String pageURL) throws Throwable {
        user.openPage(pageURL);


    }

    @Then("^accaunt settings page is opened$")
    public void accauntSettingsPageIsOpened() {
        user.accauntSettingsPageIsOpened();
    }

    @When("^click button save for \"([^\"]*)\" field$")
    public void clickButtonSaveForField(String fieldName) throws Throwable {
        user.clickButtonSaveForField(fieldName);
    }

    @And("^confirmation code is not send$")
    public void confirmationCodeIsNotSend() {
        user.confirmationCodeIsNotSend();
    }

    @Then("^error message \"([^\"]*)\" is showed$")
    public void errorMessageIsShowed(String textOfMessage) throws Throwable {
        user.errorMessageIsShowed(textOfMessage);
    }

    @And("^button save for passwords fields unusable$")
    public void buttonSaveForPasswordsFieldsUnusable() {
        user.buttonSaveForPasswordsFieldsUnusable();
    }

    @Then("^error message for passwords fields is showed$")
    public void errorMessageForPasswordsFieldsIsShowed() {
        user.errorMessageForPasswordsFieldsIsShowed();
    }

    @Then("^message about changed password is showed$")
    public void messageAboutChangedPasswordIsShowed() {
        user.messageAboutChangedPasswordIsShowed();
    }


    @Then("^message about changed username is not showed$")
    public void messageAboutChangedUsernameIsNotShowed() {
        user.messageAboutChangedUsernameIsNotShowed();
    }

    @Then("^message about changed username is showed$")
    public void messageAboutChangedUsernameIsShowed() {
        user.messageAboutChangedUsernameIsShowed();
    }

    @Then("^user name in user menu is changed to \"([^\"]*)\"$")
    public void userNameInUserMenuIsChangedTo(String userName) throws Throwable {
        user.userNameInUserMenuIsChangedTo(userName);

    }

    @Then("^popup \"([^\"]*)\" is open$")
    public void popupIsOpen(String titleName) throws Throwable {

        user.popupIsOpen(titleName);
    }

    @When("^click create room icon$")
    public void clickCreateRoomIcon() {
        user.clickCreateRoomIcon();
    }

    @When("^type room name \"([^\"]*)\" when crated room$")
    public void typeRoomNameWhenCratedRoom(String roomName) throws Throwable {
        user.typeRoomNameWhenCratedRoom(roomName);

    }

    @When("^invite member \"([^\"]*)\" when created room$")
    public void inviteMemberWhenCreatedRoom(String userName) throws Throwable {
        user.inviteMemberWhenCreatedRoom(userName);

    }

    @When("^delete invited user with name \"([^\"]*)\" when created room$")
    public void deleteInvitedUserWithNameWhenCreatedRoom(String userName) throws Throwable {
        user.deleteInvitedUserWithNameWhenCreatedRoom(userName);
    }

    @When("^add description of room \"([^\"]*)\" when created room$")
    public void addDescriptionOfRoomWhenCreatedRoom(String text) throws Throwable {
        user.addDescriptionOfRoomWhenCreatedRoom(text);
    }

    @When("^choose radio button \"([^\"]*)\" when created room$")
    public void chooseRadioButtonWhenCreatedRoom(String nameRadioButton) throws Throwable {
        user.chooseRadioButtonWhenCreatedRoom(nameRadioButton);
    }

    @When("^click button by name \"([^\"]*)\"$")
    public void clickButtonByName(String nameOfButton) throws Throwable {
        user.clickButtonByName(nameOfButton);
    }

    @Then("^click button by name \"([^\"]*)\" is disabled$")
    public void clickButtonByNameIsDisabled(String nameOfButton) throws Throwable {
        user.clickButtonByNameIsDisabled(nameOfButton);
    }

    @Then("^room with name \"([^\"]*)\" is opened$")
    public void roomWithNameIsOpened(String roomName) throws Throwable {
        user.roomWithNameIsOpened(roomName);

    }


    @Then("^room with name \"([^\"]*)\" is deleted$")
    public void roomWithNameIsDeleted(String roomName) throws Throwable {
        user.roomWithNameIsDeleted(roomName);
    }

    @When("^open room with name \"([^\"]*)\"$")
    public void openRoomWithName(String roomName) throws Throwable {
        user.openRoomWithName(roomName);
    }

    @When("^click button \"([^\"]*)\" in right side bar$")
    public void clickButtonInRightSideBar(String buttonName) throws Throwable {
        user.clickButtonInRightSideBar(buttonName);
    }

    @Then("^right slide bar \"([^\"]*)\" is opened$")
    public void rightSlideBarIsOpened(String titileName) {
        user.rightSlideBarIsOpened(titileName);
    }

    @When("^click button by name Delete room$")
    public void clickButtonByNameDeleteRoom() {
        user.clickButtonByNameDeleteRoom();
    }

    @When("^popup \"([^\"]*)\" is closed$")
    public void popupIsClosed(String titleName) throws Throwable {
        user.popupIsClosed(titleName);
    }

    @Then("^user with name \"([^\"]*)\" is on room members list$")
    public void userWithNameIsOnRoomMembersList(String userName) throws Throwable {
        user.userWithNameIsOnRoomMembersList(userName);
    }

    @Then("^user with name \"([^\"]*)\" is not on room members list$")
    public void userWithNameIsNotOnRoomMembersList(String userName) throws Throwable {
        user.userWithNameIsNotOnRoomMembersList(userName);
    }

    @When("^click add new member to room icon$")
    public void clickAddNewMemberToRoomIcon() {
        user.clickAddNewMemberToRoomIcon();
    }

    @When("^invite member \"([^\"]*)\" when room already created$")
    public void inviteMemberWhenRoomAlreadyCreated(String userName) throws Throwable {
        user.inviteMemberWhenRoomAlreadyCreated(userName);
    }

    @When("^delete user \"([^\"]*)\" from room$")
    public void deleteUserFromRoom(String userName) throws Throwable {
        user.deleteUserFromRoom(userName);
    }

    @When("^assign to administrate user with name \"([^\"]*)\"$")
    public void assignToAdministrateUserWithName(String userName) throws Throwable {
        user.assignToAdministrateUserWithName(userName);
    }

    @Then("^user \"([^\"]*)\" has been add to administrators list$")
    public void userHasBeenAddToAdministratorsList(String userName) throws Throwable {
        user.userHasBeenAddToAdministratorsList(userName);

    }

    @Then("^user \"([^\"]*)\" has not been add to administrators list$")
    public void userHasNotBeenAddToAdministratorsList(String userName) throws Throwable {
        user.userHasNotBeenAddToAdministratorsList(userName);

    }

    @When("^type to field assign new administrator user name \"([^\"]*)\"$")
    public void typeToFieldAssignNewAdministratorUserName(String userName) throws Throwable {
        user.typeToFieldAssignNewAdministratorUserName(userName);
    }

    @When("^click to user name \"([^\"]*)\" in drop down list of users$")
    public void clickToUserNameInDropDownListOfUsers(String userName) throws Throwable {
        user.clickToUserNameInDropDownListOfUsers(userName);

    }

    @Then("^user leave the room \"([^\"]*)\"$")
    public void userLeaveTheRoom(String roomName) throws Throwable {
        user.userLeaveTheRoom(roomName);

    }

    @When("^click button by name Leave Room$")
    public void clickButtonByNameLeaveRoom() {
        user.clickButtonByNameLeaveRoom();
    }

    @When("^open new tab \"([^\"]*)\"$")
    public void openNewTab(String url) throws Throwable {
        user.openNewTab(url);
    }

    @When("^switch to current tab \"([^\"]*)\"$")
    public void switchToCurrentTab(int numberOfTab) throws Throwable {
        user.switchToCurrentTab(numberOfTab);
    }

    @When("^copy value of email to clipboard$")
    public void copyValueOfEmailToClipboard() {
        user.copyValueOfEmailToClipboard();
    }

    @When("^paste temp mail from clipboard$")
    public void pasteTempMailFromClipboard() {
        user.pasteTempMailFromClipboard();
    }

    @Then("^wait until mail with subject \"([^\"]*)\" is come$")
    public void waitUntilMailWithSubjectIsCome(String subjectOfMail) throws Throwable {
        user.waitUntilMailWithSubjectIsCome(subjectOfMail);
    }

    @When("^copy confirmation code to clipboard$")
    public void copyConfirmationCodeToClipboard() {
        user.copyConfirmationCodeToClipboard();
    }

    @When("^open message by number \"([^\"]*)\"$")
    public void openMessageByNumber(String numberOfMesaage) throws Throwable {
        user.openMessageByNumber(numberOfMesaage);
    }

    @Then("^message has been open$")
    public void messageHasBeenOpen() {
        user.messageHasBeenOpen();

    }

    @When("^paste confirmation code to field$")
    public void pasteConfirmationCodeToField() {
        user.pasteConfirmationCodeToField();
    }

    @When("^enter valid user name and passwords$")
    public void enterValidUserNameAndPasswords() {
        user.enterValidUserNameAndPasswords();
    }

    @When("^login under a random user$")
    public void loginUnderARandomUser() {
        user.loginUnderARandomUser();
    }

    @When("^click \"([^\"]*)\" link$")
    public void clickLink(String textLink) throws Throwable {
        user.clickLink(textLink);

    }

    @When("^put number of messages from mail into current session$")
    public void putNumberOfMessagesFromMailIntoCurrentSession() {
        user.putNumberOfMessagesFromMailIntoCurrentSession();
    }

    @Then("^new message with subject \"([^\"]*)\" is come$")
    public void newMessageWithSubjectIsCome(String subjectOfMessage) throws Throwable {
        user.newMessageWithSubjectIsCome(subjectOfMessage);
    }

    @When("^enter random email to field Email$")
    public void enterRandomEmailToFieldEmail() {
        user.enterRandomEmailToFieldEmail();

    }

    @When("^update mail list in temp mail$")
    public void updateMailListInTempMail() {
        user.updateMailListInTempMail();
    }

    @When("^open last message in temp mail$")
    public void openLastMessageInTempMail() {
        user.openLastMessageInTempMail();
    }

    @When("^copy generate password to clipboard$")
    public void copyGeneratePasswordToClipboard() {
        user.copyGeneratePasswordToClipboard();
    }

    @When("^type to field generated pass from clipboard$")
    public void typeToFieldGeneratedPassFromClipboard() {
        user.typeToFieldGeneratedPassFromClipboard();
    }

    @When("^type to login field value of tamp mail$")
    public void typeToLoginFieldValueOfTampMail() {
        user.typeToLoginFieldValueOfTampMail();
    }

    @When("^type to password field generated password$")
    public void typeToPasswordFieldGeneratedPassword() {
        user.typeToPasswordFieldGeneratedPassword();
    }

    @When("^user send \"([^\"]*)\" random message to chat$")
    public void userSendRandomMessageToChat(int value) throws Throwable {
        user.userSendRandomMessageToChat(value);
    }


    @When("^scroll chat to message of number \"([^\"]*)\"$")
    public void scrollChatToMessageOfNumber(String numberOfMessage) throws Throwable {
        user.scrollChatToMessageOfNumber(numberOfMessage);
    }

    @Then("^message with number \"([^\"]*)\" is not visible$")
    public void messageWithNumberIsNotVisible(String numberOfMessage) throws Throwable {
        user.messageWithNumberIsNotVisible(numberOfMessage);
    }


    @Then("^message with number \"([^\"]*)\" is visible$")
    public void messageWithNumberIsVisible(String numberOfMessage) throws Throwable {
        user.messageWithNumberIsVisible(numberOfMessage);
    }

    @When("^stared message by number \"([^\"]*)\"$")
    public void staredMessageByNumber(String numberOfMessage) throws Throwable {
        user.staredMessageByNumber(numberOfMessage);
    }



    @Then("^value of starred message increased by (\\d+)$")
    public void valueOfStarredMessageIncreasedBy(int increasedBy) {
        user.valueOfStarredMessageIncreasedBy(increasedBy);
    }


    @When("^get value of starred messages before add new starred message$")
    public void getValueOfStarredMessagesBeforeAddNewStarredMessage() {
        user.getValueOfStarredMessagesBeforeAddNewStarredMessage();
    }

    @When("^get value of starred messages after add new starred message$")
    public void getValueOfStarredMessagesAfterAddNewStarredMessage() {
        user.getValueOfStarredMessagesAfterAddNewStarredMessage();
    }

    @When("^click \"([^\"]*)\" link by number (\\d+)$")
    public void clickLinkByNumber(String linkText, int numberOfMessage) throws Throwable {
        user.clickLinkByNumber(linkText,numberOfMessage);
    }

    @When("^get text of message from starred message by number \"([^\"]*)\"$")
    public void getTextOfMessageFromStarredMessageByNumber(String numberOfMessage) {
        user.getTextOfMessageFromStarredMessageByNumber(numberOfMessage);
    }


    @Then("^chat scrolled to message and highlight it$")
    public void chatScrolledToMessageAndHighlightIt() {
        user.chatScrolledToMessageAndHighlightIt();

    }

    @When("^move mouse to starred message by number \"([^\"]*)\"$")
    public void moveMouseToStarredMessageByNumber(String numberOfMessage) throws Throwable {
        user.moveMouseToStarredMessageByNumber(numberOfMessage);
    }

    @When("^delete room with name \"([^\"]*)\" if it already created$")
    public void deleteRoomWithNameIfItAlreadyCreated(String roomName) throws Throwable {
        user.deleteRoomWithNameIfItAlreadyCreated(roomName);
    }
}
