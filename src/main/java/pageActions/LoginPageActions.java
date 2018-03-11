package pageActions;

import pages.LoginPage;


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

    public static void loginOlxFacebook(String logVal, String passVal) {
        pressLogInFacebook();
        FacebookLoginPageActions.setFacebookLoginField(logVal);
        FacebookLoginPageActions.setFacebookPasswordField(passVal);
        FacebookLoginPageActions.pressFacebookLoginButton();
    }

    public static void pressLogInFacebook() {
        elementClick(facebookBtn());
    }
}