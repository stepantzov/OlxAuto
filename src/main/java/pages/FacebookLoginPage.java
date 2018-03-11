package pages;

import coreFunctions.ActionsSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage extends ActionsSetup {
    protected static WebDriver driver;

    public FacebookLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement loginEnterFld() {
        return getElement("//div[@id='email_container']//input[@aria-label='Email or Phone Number']", DELAY, XPATH);
    }

    public static WebElement passwordFld() {
        return getElement("//input[@type='password']", DELAY, XPATH);
    }

    public static WebElement loginBtn() {
        return getElement(" //button[@id='loginbutton']", DELAY, XPATH);
    }
}