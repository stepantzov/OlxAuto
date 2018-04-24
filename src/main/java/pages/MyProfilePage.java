package pages;

import coreFunctions.ActionsSetup;
import org.openqa.selenium.WebElement;

public class MyProfilePage extends ActionsSetup {
    protected String myProfileSettingsPageUrlPattern = "/myaccount/settings/";

    public WebElement myProfilePageHeaderText() {
        return getElement("//*[@id='login_tab']", DELAY, XPATH);
    }

    public static WebElement myProfileSettingsLnk() {
        return getElement("//*[@id='login-box-settings']", DELAY, XPATH);
    }

    public static WebElement facebookLoginButton() {
        return getElement("//*[@id='fblogin']", DELAY, XPATH);
    }

    public static WebElement myProfileLogOutLnk() {
        return getElement("//div[@style='display: block;']//span[@class='link fbold']//span[text()='Выйти']", DELAY, XPATH);
    }

    public static WebElement myProfileNewAdvTitle() {
        return getElement("//*[@id='postNewAdLink']/span", DELAY, XPATH);
    }
}