package pageActions;

import coreFunctions.ActionsSetup;
import org.openqa.selenium.WebDriver;
import pages.MyProfilePage;

public class MyProfilePageActions extends MyProfilePage {
    protected static WebDriver driver;

    public MyProfilePageActions(WebDriver driver) {
        this.driver = driver;
    }

    public String getMyProfilePageText() {
        return ActionsSetup.getText(myProfilePageHeaderText());
    }

    public boolean verifyIfCustomerLoggedSuccessfully() {
        return myProfileNewAdvTitle().isDisplayed();
    }
}