package pages;

import coreFunctions.ActionsSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyProfilePage extends ActionsSetup {
    protected static WebDriver driver;

    public MyProfilePage(WebDriver driver) {
        this.driver = driver;
    }

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
        return getElement("//*[@id='login-box-logout']/span/span", DELAY, XPATH);
    }

    public static WebElement myProfileNewAdvTitle() {
        return getElement("//a[@id='postNewAdLink']//span[text()='Подать объявление']", DELAY, XPATH);
    }
}