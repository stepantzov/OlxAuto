package pageActions;

import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.MyProfilePage;

public class MainPageActions extends MainPage {
    protected static WebDriver driver;

    public MainPageActions(WebDriver driver) {
        this.driver = driver;
    }

    public static void clickMyProfileLnk() {
        elementClick(myProfileLink());
    }

    public void setSearchFieldVal(String fieldValue) {
        sendKeys(mySearchField(), fieldValue);
    }

    public void pressAddNewAdvertLnk() {
        elementClick(addNewAdvertLnk());
    }

    public void pressMyProfileLnk() {
        elementClick(myProfileLink());
    }

    public static void logOutOlx() {
        hoverOverLogOut(myProfileLink());
        //elementClick(myProfileLogOutLnk());
    }

    public SearchResultsPageActions pressSearchButton() {
        elementClick(mySearchButton());

        return new SearchResultsPageActions(driver);
    }

    public static MyProfileSettingsPageActions openMyProfileSettings() {
        hoverOverAndClick(myProfileLink(), MyProfilePage.myProfileSettingsLnk());

        return new MyProfileSettingsPageActions(driver);
    }

    public void clearLocalization() {
        elementClick(clickClearLocalization());
    }

    public void setSearchLocalizationVal(String searchLocalizationVal) {
        mySearchLocalizationField().clear();
        sendKeys(mySearchLocalizationField(), searchLocalizationVal);
    }

    public void clickLocalizationSuggest() {
        elementClick(myGeoSuggestion());
    }

    public void navigateHomePage() {
        elementClick(homePageLogo());
    }
}