package pages;

import coreFunctions.OlxWebElementsSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends OlxWebElementsSetup {
    protected static WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement enterButton() {
        return getElement("//*[@id='se_userLogin']", DELAY, XPATH);
    }

    public static WebElement loginEnterField() {
        return getElement("//*[@id='userEmail']", DELAY, XPATH);
    }

    public static WebElement passwordEnterField() {
        return getElement("//*[@id='userPass']", DELAY, XPATH);
    }

    public static WebElement loginValidationAlert(){
        return getElement("//label[@for='userEmail']", DELAY, XPATH);
    }

    public static WebElement passwordValidationAlert(){
        return getElement("//label[@for='userPass']", DELAY, XPATH);
    }
}