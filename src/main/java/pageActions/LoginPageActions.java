package pageActions;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.MyProfilePage;

import static pages.MainPage.myProfileLink;

public class LoginPageActions extends LoginPage {
    public LoginPageActions(WebDriver driver) {
        super(driver);
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

    public static void logOutOlx() {
        hoverOver(myProfileLink(), MyProfilePage.myProfileLogOutLnk());
    }
}