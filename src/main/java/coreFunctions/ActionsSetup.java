package coreFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static pages.MyProfilePage.myProfileLogOutLnk;

public class ActionsSetup extends DriverSetup {
    public static WebElement getElement(String selector, int timeWaiting, String typeSelector) {
        return new WebDriverWait(driverInstance, setTimeWaiting(timeWaiting, DELAY)).
                until(ExpectedConditions.presenceOfElementLocated(bySelector(selector, typeSelector)));
    }

    private static By bySelector(String selector, String typeSelector) {
        return XPATH.equals(type(typeSelector)) ? By.xpath(selector) : By.cssSelector(selector);
    }

    private static String type(String typeSelector) {
        String type = typeSelector;
        if (!XPATH.equals(type) && !CSS.equals(type)) {
            type = XPATH;
        }

        return type;
    }

    private static int setTimeWaiting(int timeWaiting, int defaultDelay) {
        int waitingTime = timeWaiting;

        if (waitingTime == 0) {
            return defaultDelay;
        } else
            return timeWaiting;
    }

    public static void setImplicitWaitTime(int implicitWaitTime) {
        driverInstance.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
    }

    public static String getText(WebElement element) {
        setImplicitWaitTime(IMPLICITDELAY);

        return element.getText();
    }

    public static void elementClick(WebElement element) {
        setImplicitWaitTime(IMPLICITDELAY);
        element.click();
    }

    public static void sendKeys(WebElement element, String fieldValue) {
        setImplicitWaitTime(IMPLICITDELAY);
        element.sendKeys(fieldValue);
    }

    public static void hoverOverAndClick(WebElement baseElement, WebElement selectedElement) {
        Actions action = new Actions(DriverSetup.driverInstance);
        action.moveToElement(baseElement).moveToElement(selectedElement).click().build().perform();
    }

    public static void hoverOverLogOut(WebElement baseElement) {
        Actions action = new Actions(DriverSetup.driverInstance);
        action.moveToElement(baseElement).perform();
        elementClick(myProfileLogOutLnk());
    }

    public static WebElement getVisibleElement(String selector, int timeWaiting, String typeSelector) {
        WebDriverWait wait = new WebDriverWait(driverInstance, timeWaiting);

        return (wait.until(ExpectedConditions.visibilityOfElementLocated(bySelector(selector, typeSelector))));
    }
}