package pageActions;

import coreFunctions.OlxWebElementsSetup;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginPageActions extends LoginPage {

    public LoginPageActions(WebDriver driver) {
        super(driver);
    }

    public static void setLoginEnterField(String loginValue) {
        OlxWebElementsSetup.sendKeys(loginEnterField(), loginValue);
    }

    public static void setPasswordEnterField(String passwordValue) {
        OlxWebElementsSetup.sendKeys(passwordEnterField(), passwordValue);
    }

    public static void pressLoginButton() {
        OlxWebElementsSetup.elementClick(enterButton());
    }

    public static void loginOlx(String login, String password) {
        MainPageActions.clickMyProfileLink();
        setLoginEnterField(login);
        setPasswordEnterField(password);
        pressLoginButton();
    }
}
