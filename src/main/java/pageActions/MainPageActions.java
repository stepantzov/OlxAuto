package pageActions;

import coreFunctions.WebSelectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.MainPage;

public class MainPageActions extends MainPage {

    private WebDriver driver;
    private static String login = "stepantzov@gmail.com";
    private static String password = "123ZZror";
    protected static final int DELAY = 30;

    public MainPageActions(WebDriver driver) {

        super(driver);
    }

    public static Boolean verifyFacebookLoginButtonPresent() {
        MainPage.clickMyProfileLink();
        System.out.println("Checking if Facebook button is present.");

        return ((WebSelectors.getElement("//*[@id='fblogin']", DELAY, XPATH)).isDisplayed());
    }

    public static Boolean verifyLoginSuccessfully() {
        MainPage.clickMyProfileLink();
        MainPage.login(login, password);

        return ((WebSelectors.getElement(".//*[@id='usertabs']//*[@class='x-large fbold lheight20']",
                30, XPATH)).isDisplayed());
    }

    public static Boolean verifyLoginValidation() {
        //need to add log out here
        MainPage.clickMyProfileLink();
        WebElement enterButtonElement = WebSelectors.getElement("//*[@id='se_userLogin']", DELAY, XPATH);
        enterButtonElement.click();
        WebElement loginValidation = WebSelectors.getElement("//label[@for='userEmail']", DELAY, XPATH);
        WebElement passwordValidation = WebSelectors.getElement("//label[@for='userPass']", DELAY, XPATH);

        return (loginValidation.isDisplayed() || passwordValidation.isDisplayed());
    }

    public static Boolean verifyOpenMyProfileSettings() {
        MainPage.openMyProfileSettings();

        return (WebSelectors.getElement(".//*[@id='se_deleteAccount']/span", DELAY, XPATH).isDisplayed());
    }
}