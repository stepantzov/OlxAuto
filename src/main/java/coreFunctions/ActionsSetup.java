package coreFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ActionsSetup extends DriverSetup {
    public static WebElement getElement(String selector, int timeWaiting, String typeSelector) {
        return new WebDriverWait(DriverSetup.driver, setTimeWaiting(timeWaiting, DELAY)).
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
            waitingTime = defaultDelay;
        }
        return waitingTime;
    }

    public static void setImplicitWaitTime(int implicitWaitTime) {
        driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
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

    public static void hoverOver(WebElement baseElement, WebElement selectedElement) {
        Actions action = new Actions(driver);
        action.moveToElement(baseElement).moveToElement(selectedElement).click().build().perform();
    }
}