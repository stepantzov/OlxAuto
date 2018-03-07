package pageActions;

import coreFunctions.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.SearchResultsPage;

import static coreFunctions.ActionsSetup.getText;
import static coreFunctions.ActionsSetup.setImplicitWaitTime;

public class SearchResultsPageActions extends SearchResultsPage {
    public SearchResultsPageActions(WebDriver driver) {
        super(driver);
    }

    public static String getMyProfilePageText() {
        return getText(mySearchResultsFoundText());
    }

    public static void pressClosePopUpButton() {
        setImplicitWaitTime(1);
        if (DriverSetup.driverInstance.findElements(By.xpath("//span[@class='highlight-close']")).size() > 0) {
            searchResultsPopUpCloseButton().click();
        } else
            System.out.println("No pop-up present");
    }
}