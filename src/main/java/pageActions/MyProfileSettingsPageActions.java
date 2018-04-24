package pageActions;

import org.openqa.selenium.WebDriver;
import pages.MyProfilePage;

import static pages.MyProfileSettingsPage.myProfileAdsHeader;

public class MyProfileSettingsPageActions extends MyProfilePage {
    protected static WebDriver driver;

    public String getMyProfileSettingsPageUrlPattern() {
        return myProfileSettingsPageUrlPattern;
    }

    public MyProfileSettingsPageActions(WebDriver driver) {
        this.driver = driver;
    }

    public static String getMyProfileSettingsHeader() {
        return getText(myProfileAdsHeader());
    }
}