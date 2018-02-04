package pages;

import coreFunctions.ActionsSetup;
import org.openqa.selenium.WebElement;

public class MainPage extends ActionsSetup {

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

    public WebElement myGeoSuggestion() {
        return getElement("//ul[@class='suggestgeo bgfff normal br-3 abs']", DELAY, XPATH);
    }

    public WebElement addNewAdvertLnk() {
        return getElement("//*[@id='postNewAdLink']", DELAY, XPATH);
    }

    public WebElement homePageLogo() {
        return getElement("//a[@href='https://www.olx.ua']", DELAY, XPATH);
    }
}