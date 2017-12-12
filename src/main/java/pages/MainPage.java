package pages;

import coreFunctions.OlxWebElementsSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends OlxWebElementsSetup {

    protected static WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement myProfileLink() {
        return getElement("//*[@id='topLoginLink']/span/strong", DELAY, XPATH);
    }

    public WebElement mySearchButton() {
        return getElement("//*[@id='submit-searchmain']", DELAY, XPATH);
    }

    public WebElement mySearchField() {
        return getElement("//*[@id='headerSearch']", DELAY, XPATH);
    }

    public WebElement mySearchLocalizationField() {
        return getElement("//*[@id='cityField']", DELAY, XPATH);
    }

    public WebElement addNewAdvertLink() {
        return getElement("//*[@id='postNewAdLink']", DELAY, XPATH);
    }

    public WebElement myLoggedOnUserProfileLink() {
        return getElement(".//*[@id='topLoginLink']/span/strong", DELAY, XPATH);
    }
}