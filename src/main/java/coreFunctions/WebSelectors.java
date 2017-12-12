package coreFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebSelectors extends BaseSetup {
    protected static final String XPATH = "xpath";
    protected static final Object CSS = "css";

    public static WebElement getElement(String selector, int timeWaiting, String typeSelector) {

        return new WebDriverWait(BaseSetup.driver, waiting(timeWaiting, 30)).
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

    private static int waiting(int timeWaiting, int defaultDelay) {
        int waiting = timeWaiting;

        if (waiting == 0) {
            waiting = defaultDelay;
        }

        return waiting;
    }
}