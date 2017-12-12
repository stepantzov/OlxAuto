package pageActions;

import coreFunctions.OlxWebElementsSetup;
import org.openqa.selenium.WebDriver;
import pages.AdvertPage;

public class AdvertPageActions extends AdvertPage {
    public AdvertPageActions(WebDriver driver) {
        super(driver);
    }

    public String getAdvertPageTitleText() {
        return OlxWebElementsSetup.getText(advertPageTitle());
    }
}
