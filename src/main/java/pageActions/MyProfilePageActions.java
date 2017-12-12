package pageActions;

import coreFunctions.OlxWebElementsSetup;
import org.openqa.selenium.WebDriver;
import pages.MyProfilePage;

public class MyProfilePageActions extends MyProfilePage {
    public MyProfilePageActions(WebDriver driver) {
        super(driver);
    }

    public String getMyProfilePageText() {
        return OlxWebElementsSetup.getText(myProfilePageHeaderText());
    }
}