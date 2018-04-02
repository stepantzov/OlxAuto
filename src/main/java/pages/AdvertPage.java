package pages;

import coreFunctions.ActionsSetup;
import org.openqa.selenium.WebElement;

public class AdvertPage extends ActionsSetup {

    protected static String advertPageUrlPattern = "/post-new-ad/";
    protected static String advertPageUrlLocale;

    public static WebElement advertPageTitle() {
        return getElement("//h1[@class='c000 x-large pding10 rel fleft']", DELAY, XPATH);
    }
}