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

    public AdvertPageActions pressAddNewAdvertLnk() {
        elementClick(addNewAdvertLnk());

        return new AdvertPageActions(driver);
    }

    public void pressMyProfileLnk() {
        elementClick(myProfileLink());
    }

    public static void logout() {
    //TODO implement log out action
    }

    public SearchResultsPageActions pressSearchButton() {
        elementClick(mySearchButton());

        return new SearchResultsPageActions(driver);
    }

    public static MyProfileSettingsPageActions openMyProfileSettings() {
        hoverOver(myProfileLink(), MyProfilePage.myProfileSettingsLnk());

        return new MyProfileSettingsPageActions(driver);
    }

    public void clearLocalization(){
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