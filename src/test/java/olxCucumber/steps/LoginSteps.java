package olxCucumber.steps;

import coreFunctions.DriverSetup;
import coreFunctions.TestConditions;
import org.junit.Test;
import pageActions.LoginPageActions;
import pageActions.MainPageActions;
import pageActions.MyProfilePageActions;

public class LoginSteps extends TestConditions {

    @Test
    public boolean verifyOlxMainPage() {
        MainPageActions mainPageActions = new MainPageActions(DriverSetup.driverInstance);

        return mainPageActions.verifyIfMainPageOpened();
    }

    @Test
    public void clickMyProfileLink() {
        MainPageActions mainPageActions = new MainPageActions(DriverSetup.driverInstance);

        mainPageActions.pressMyProfileLnk();
    }

    @Test
    public boolean verifyFacebookButtonPresent() {
        LoginPageActions loginPageActions = new LoginPageActions(DriverSetup.driverInstance);

        return loginPageActions.verifyFacebookButtonPresent();
    }

    @Test
    public void logInOlxWithCorrectCredentials() {
        LoginPageActions loginPageActions = new LoginPageActions(DriverSetup.driverInstance);

        if (loginPageActions.ifLoginRequired() == true) {
            loginPageActions.logInOlxWithCorrectCredentials(FBLOGIN, FBPASSWORD);
        }
/*
        loginPageActions.logInOlxWithCorrectCredentials(LOGIN, PASSWORD);*/
    }

    @Test
    public boolean verifyIfCustomerLoggedSuccessfully() {
        MyProfilePageActions myProfilePageActions = new MyProfilePageActions(DriverSetup.driverInstance);

        return myProfilePageActions.verifyIfCustomerLoggedSuccessfully();
    }

    @Test
    public void openHomePage() {
        MainPageActions mainPageActions = new MainPageActions(DriverSetup.driverInstance);

        mainPageActions.openHomePage();
    }

    @Test
    public void pressFacebookLoginButton() {
        LoginPageActions loginPageActions = new LoginPageActions(DriverSetup.driverInstance);

        loginPageActions.pressFacebookLoginButton();
    }
}