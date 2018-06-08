package pages;

import coreFunctions.ActionsSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage extends ActionsSetup {
    protected static WebDriver driver;
    protected static String facebookLoginPageUrlPattern = "www.facebook.com";

    public FacebookLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement loginEnterFld() {
        return getElement("//*[@id='email']", DELAY, XPATH);
    }

    public static WebElement passwordFld() {
        return getElement("//input[@type='password']", DELAY, XPATH);
    }

    public static WebElement loginBtn() {
        return getElement("//button[@id='loginbutton']", DELAY, XPATH);
    }

    public static WebElement facebookBtn() {
        return getElement("div.olxCucumber.steps-box:nth-child(2) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > div:nth-child(1) > form:nth-child(1) > a:nth-child(1)", DELAY, CSS);
    }
}