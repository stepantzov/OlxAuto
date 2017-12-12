package pageActions;

import coreFunctions.OlxWebElementsSetup;
import org.openqa.selenium.WebDriver;
import pages.SearchResultsPage;

public class SearchResultsPageActions extends SearchResultsPage {
    public SearchResultsPageActions(WebDriver driver) {
        super(driver);
    }

    public String getMyProfilePageText() {
        return OlxWebElementsSetup.getText(mySearchResultsFoundText());
    }

    public void pressClosePopUpButton() {
        OlxWebElementsSetup.elementClick(searchResultsPopUpCloseButton());
    }
}