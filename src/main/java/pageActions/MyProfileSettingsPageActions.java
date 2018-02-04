package pageActions;

import org.openqa.selenium.WebDriver;

import static coreFunctions.ActionsSetup.getText;
import static pages.MyProfileSettingsPage.myProfileAdsHeader;

public class MyProfileSettingsPageActions {
    protected static WebDriver driver;

    public MyProfileSettingsPageActions(WebDriver driver) {
        this.driver = driver;
    }

    public static String getMyProfileSettingsHeader (){
        return getText(myProfileAdsHeader());
    }
}