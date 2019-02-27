package aim.chat.pages;

import aim.chat.locators.Locators;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class CommonElements extends PageObject {


    public void waitUntilElementToBeInvisible(int waitSec, String xpath) {

        int counter = 0;
        while ((findBy(xpath).isVisible()) && (counter <= 20)) {
            waitABit(waitSec);
            counter++;
        }
    }

    public void waitUntilElementToBeVisible(int waitSec, String xpath) {
        waitABit(250);
        int counter = 0;
        while (!(findBy(xpath).isVisible()) && (counter < 5)) {
            waitABit(waitSec);
            counter++;

        }


    }


    public boolean elementIsVisible(int waitSec, String xpath) {
        try {
            withTimeoutOf(waitSec, TimeUnit.SECONDS)
                    .waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy
                            (By.xpath(xpath)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean elementIsInvisible(int waitSec, String xpath) {
        try {
            withTimeoutOf(waitSec, TimeUnit.SECONDS)
                    .waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public void waitUntilElementAppearsAndDissappears(String xpath) {
        if (elementIsVisible(20, xpath)) {
            elementIsInvisible(300, xpath);
        }
    }

    public void waitUntilTextOfElementIsChanged(String xpath) {
        waitABit(100);
        int counter = 0;
        String value = $(xpath).getText();
        while ($(xpath).getText().equals(value) && counter<=30) {
            counter++;
        }


    }

    public boolean elementIsClicable(int waitSec, String xpath) {
        try {
            withTimeoutOf(waitSec, TimeUnit.SECONDS)
                    .waitFor(ExpectedConditions.elementToBeClickable
                            (By.xpath(xpath)));
            return true;
        } catch (Exception e) {
            return false;
        }


    }

    public void moveMouseToElementByXpath(String xpath) {
        Actions action = new Actions(getDriver());
        WebElement message = getDriver().findElement(org.openqa.selenium.By.xpath(xpath));
        action.moveToElement(message).build().perform();
    }
}