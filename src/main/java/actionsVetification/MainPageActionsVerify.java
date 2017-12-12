package actionsVetification;

import org.openqa.selenium.WebDriver;
import pageActions.LoginPageActions;
import pageActions.MainPageActions;
import pages.LoginPage;
import pages.MainPage;
import pages.MyProfilePage;
import pages.MyProfileSettingsPage;

public class MainPageActionsVerify extends MainPage {

    private WebDriver driver;

    public MainPageActionsVerify(WebDriver driver) {
        super(driver);
    }

    public static Boolean verifyFacebookLoginButtonPresent() {
        MainPageActions.clickMyProfileLink();
        System.out.println("Checking if Facebook button is present.");

        return (MyProfilePage.facebookLoginButton().isDisplayed());
    }

    public static Boolean verifyLoginSuccessfully() {
        MainPageActions.clickMyProfileLink();
        LoginPageActions.loginOlx(login, password);

        return (MyProfileSettingsPage.myProfileAdsHeader().isDisplayed());
    }

    public static Boolean verifyLoginValidation() {
        //need to add log out here!!!
        MainPageActions.clickMyProfileLink();
        LoginPageActions.pressLoginButton();

        return (LoginPage.loginValidationAlert().isDisplayed() || LoginPage.passwordValidationAlert().isDisplayed());
    }

    public static Boolean verifyOpenMyProfileSettings() {
        MainPageActions.openMyProfileSettings();

        return (MyProfileSettingsPage.deleteMyProfileLink().isDisplayed());
    }
}