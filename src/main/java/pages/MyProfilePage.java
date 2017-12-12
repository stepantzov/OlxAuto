package pages;

import coreFunctions.OlxWebElementsSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyProfilePage extends OlxWebElementsSetup {
    protected static WebDriver driver;

    public MyProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement myProfilePageHeaderText() {
        return getElement("//*[@id='login_tab']", DELAY, XPATH);
    }

    public static WebElement myProfileSettings() {
        return getElement(".//*[@id='login-box-settings']/span", DELAY, XPATH);
    }

    public static WebElement facebookLoginButton(){
        return getElement("//*[@id='fblogin']", DELAY, XPATH);
    }
}