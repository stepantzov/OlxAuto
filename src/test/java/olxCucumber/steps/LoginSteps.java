package olxCucumber.steps;

import coreFunctions.DriverSetup;
import pageActions.LoginPageActions;
import pageActions.MainPageActions;
import pageActions.MyProfilePageActions;

import static coreFunctions.GlobalDefinitions.FBLOGIN;
import static coreFunctions.GlobalDefinitions.FBPASSWORD;

public class LoginSteps {
    MainPageActions mainPageActions = new MainPageActions(DriverSetup.driverInstance);
    LoginPageActions loginPageActions = new LoginPageActions(DriverSetup.driverInstance);
    MyProfilePageActions myProfilePageActions = new MyProfilePageActions(DriverSetup.driverInstance);

    public boolean verifyOlxMainPage() {
        return mainPageActions.verifyIfMainPageOpened();
    }

    public void clickMyProfileLink() {
        mainPageActions.pressMyProfileLnk();
    }

    public boolean verifyFacebookButtonPresent() {
        return loginPageActions.verifyFacebookButtonPresent();
    }

    public void logInOlxWithCorrectCredentials() {
        if (loginPageActions.ifLoginRequired() == true) {
            loginPageActions.logInOlxWithCorrectCredentials(FBLOGIN, FBPASSWORD);
        }
    }

    public boolean verifyIfCustomerLoggedSuccessfully() {
        return myProfilePageActions.verifyIfCustomerLoggedSuccessfully();
    }

    public void openHomePage() {
        mainPageActions.openHomePage();
    }

    public void pressFacebookLoginButton() {
        loginPageActions.pressFacebookLoginButton();
    }
}