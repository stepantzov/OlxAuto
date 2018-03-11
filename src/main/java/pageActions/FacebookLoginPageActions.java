package pageActions;

import org.openqa.selenium.WebDriver;
import pages.FacebookLoginPage;

public class FacebookLoginPageActions extends FacebookLoginPage {
    public FacebookLoginPageActions(WebDriver driver) {
        super(driver);
    }

    public static void setFacebookLoginField(String facebookLoginValue) {
        sendKeys(loginEnterFld(), facebookLoginValue);
    }

    public static void setFacebookPasswordField(String facebookPasswordValue) {
        sendKeys(passwordFld(), facebookPasswordValue);
    }

    public static void pressFacebookLoginButton() {
        elementClick(loginBtn());
    }
}