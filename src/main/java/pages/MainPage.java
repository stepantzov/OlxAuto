package pages;

import coreFunctions.ActionsSetup;
import org.openqa.selenium.WebElement;

public class MainPage extends ActionsSetup {
    protected String mainPageUrlPattern = "https://www.olx.ua/";

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

    public WebElement myLocalizationSuggestion() {
        return getVisibleElement("//*[@id='autosuggest-geo-ul']", DELAY, XPATH);
    }

    public WebElement addNewAdvertLnk() {
        return getElement("//*[@id='postNewAdLink']", DELAY, XPATH);
    }

    public WebElement homePageLogo() {
        return getElement("//a[@href='https://www.olx.ua']", DELAY, XPATH);
    }

    public WebElement clickClearLocalization() {
        return getElement("//a[@class='clear-input-button']", DELAY, XPATH);
    }
}