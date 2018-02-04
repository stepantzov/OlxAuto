package pageActions;

import coreFunctions.ActionsSetup;
import org.openqa.selenium.WebDriver;
import pages.MyProfilePage;

public class MyProfilePageActions extends MyProfilePage {
    public MyProfilePageActions(WebDriver driver) {
        super(driver);
    }

    public String getMyProfilePageText() {
        return ActionsSetup.getText(myProfilePageHeaderText());
    }
}