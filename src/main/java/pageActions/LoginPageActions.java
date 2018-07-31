package pageActions;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginPageActions extends LoginPage {
    protected static WebDriver driver;

    public LoginPageActions(WebDriver driverInstance) {
        this.driver = driver;
    }

    public static void setLoginEnterField(String loginValue) {
        sendKeys(loginEnterFld(), loginValue);
    }

    public static void setPasswordEnterField(String passwordValue) {
        sendKeys(passwordEnterFld(), passwordValue);
    }

    public static void pressLoginButton() {
        elementClick(enterBtn());
    }

    public static void loginOlx(String login, String password) {
        MainPageActions.clickMyProfileLnk();
        setLoginEnterField(login);
        setPasswordEnterField(password);
        pressLoginButton();
    }

    public static void logInOlxWithCorrectCredentials(String logVal, String passVal) {
        FacebookLoginPageActions.setFacebookLoginField(logVal);
        FacebookLoginPageActions.setFacebookPasswordField(passVal);
        FacebookLoginPageActions.pressFacebookLoginButton();
    }

    public static void pressLogInFacebook() {
        elementClick(facebookBtn());
    }

    public static boolean ifLoginRequired() {
        return ifLoginRequiredIndicator();
    }

    public boolean verifyFacebookButtonPresent() {
        return facebookBtn().isDisplayed();
    }

    public void pressFacebookLoginButton() {
        facebookBtn().click();
    }
}