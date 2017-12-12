package actionsVetification;

import org.openqa.selenium.WebDriver;
import pageActions.AdvertPageActions;

public class AdvertPageActionsVerify extends AdvertPageActions {
    public AdvertPageActionsVerify(WebDriver driver) {
        super(driver);
    }

    public boolean verifyAdvertPageText() {
        String advertPageTitleText = getAdvertPageTitleText();
        String expectedText = "Подать бесплатное объявление на OLX";

        return advertPageTitleText.contains(expectedText);
    }
}