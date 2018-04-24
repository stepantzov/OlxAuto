package pageActions;

import org.openqa.selenium.WebDriver;
import pages.AdvertPage;

public class AdvertPageActions extends AdvertPage {
    protected static WebDriver driver;

    public AdvertPageActions(WebDriver driver) {
        this.driver = driver;
    }

    public static String getAdvertPageTitle() {
        return getText(advertPageTitle());
    }

    public String getgetAdvertPageUrlPattern() {
        return advertPageUrlPattern;
    }
}