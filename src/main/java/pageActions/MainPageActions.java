package pageActions;

import coreFunctions.WebSelectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.MainPage;

public class MainPageActions extends MainPage {

    private WebDriver driver;
    private static String login = "stepantzov@gmail.com";
    private static String password = "123ZZror";

    public MainPageActions(WebDriver driver) {
        super(driver);
    }

    public static Boolean verifyFacebookLoginButtonPresent() {
        MainPage.clickMyProfileLink();
        System.out.println("Checking if Facebook button is present.");

        return ((WebSelectors.getElement("//*[@id='fblogin']", 30, XPATH)).isDisplayed());
    }

    public static Boolean verifyLoginSuccessfully() {
        MainPage.login(login, password);

        return ((WebSelectors.getElement(".//*[@id='usertabs']//*[@class='x-large fbold lheight20']",
                30, XPATH)).isDisplayed());
    }

    public static Boolean verifyLoginValidation() {
        WebElement enterButtonElement = WebSelectors.getElement("//*[@id='se_userLogin']", 30, XPATH);
        enterButtonElement.click();
        WebElement loginValidation = WebSelectors.getElement("//label[@for='userEmail']", 30, XPATH);
        WebElement passwordValidation = WebSelectors.getElement("//label[@for='userPass']", 30, XPATH);

        return (loginValidation.isDisplayed() || passwordValidation.isDisplayed());
    }

    public static Boolean verifyOpenMyProfileSettings() {
        MainPage.openMyProfileSettings();

        return (WebSelectors.getElement(".//*[@id='se_deleteAccount']/span", 30, XPATH).isDisplayed());
    }
}