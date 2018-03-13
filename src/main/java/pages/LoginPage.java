package pages;

import coreFunctions.ActionsSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends ActionsSetup {
    public static WebElement enterBtn() {
        return getElement("//*[@id='se_userLogin']", DELAY, XPATH);
    }

    public static WebElement loginEnterFld() {
        return getElement("//*[@id='userEmail']", DELAY, XPATH);
    }

    public static WebElement passwordEnterFld() {
        return getElement("//*[@id='userPass']", DELAY, XPATH);
    }

    public static WebElement loginValidationAlrt() {
        return getElement("//label[@for='userEmail']", DELAY, XPATH);
    }

    public static WebElement passwordValidationAlrt() {
        return getElement("//label[@for='userPass']", DELAY, XPATH);
    }

    public static WebElement facebookBtn() {
        return getElement("//*[@id='fblogin']", DELAY, XPATH);
    }

    public static boolean ifLoginRequiredIndicator() {
        return (driverInstance.findElements(By.xpath("//span[text()='Log into Facebook']")).size() !=0);
    }
}