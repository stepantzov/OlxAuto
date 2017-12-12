package pageActions;

import actionsVetification.AdvertPageActionsVerify;
import coreFunctions.OlxWebElementsSetup;
import org.openqa.selenium.WebDriver;
import pages.*;

public class MainPageActions extends MainPage {
    public MainPageActions(WebDriver driver) {
        super(driver);
    }

    public static void clickMyProfileLink() {
        OlxWebElementsSetup.elementClick(myProfileLink());
    }

    public void setSearchFieldValue(String fieldValue) {
        OlxWebElementsSetup.sendKeys(mySearchField(), fieldValue);
    }

    public void setSearchLocalizationValue(String fieldValue) {
        OlxWebElementsSetup.sendKeys(mySearchLocalizationField(), fieldValue);
    }

    public void clickSearchButton() {
        OlxWebElementsSetup.elementClick(mySearchButton());
    }

    public void pressAddNewAdvertLink() {
        OlxWebElementsSetup.elementClick(addNewAdvertLink());
    }

    public static void logout() {
//to be implemented
    }

    public AdvertPageActionsVerify getAdvertPageAfterLogin() {
        pressAddNewAdvertLink();
        LoginPageActions.loginOlx(login, password);

        return new AdvertPageActionsVerify(driver);
    }

    public SearchResultsPage getSearchResultsPage(String keyWord, String localization) {
        setSearchFieldValue(keyWord);
        setSearchLocalizationValue(localization);
        clickSearchButton();
        return new SearchResultsPage(driver);
    }

    public static MyProfileSettingsPage openMyProfileSettings() {
        LoginPageActions.loginOlx(login, password);
        MainPageActions.hoverOver(myProfileLink(), MyProfilePage.myProfileSettings());

        return new MyProfileSettingsPage(driver);
    }
}