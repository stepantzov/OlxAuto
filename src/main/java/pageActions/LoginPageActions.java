package pageActions;

import pages.LoginPage;
import pages.MyProfilePage;

import static pages.MainPage.myProfileLink;

public class LoginPageActions extends LoginPage {
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

    public static void loginOlxFacebook(String logVal, String passVal){
        pressLogInFacebook();
        FacebookLoginPageActions.setFacebookLoginField(logVal);
        FacebookLoginPageActions.setFacebookPasswordField(passVal);
        FacebookLoginPageActions.pressFacebookLoginButton();
    }

    private static void pressLogInFacebook() {
        setImplicitWaitTime(IMPLICITDELAY);
        elementClick(facebookBtn());
    }

    public static void logOutOlx() {
        hoverOver(myProfileLink(), MyProfilePage.myProfileLogOutLnk());
    }
}