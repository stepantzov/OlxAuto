package tests;

import coreFunctions.DriverSetup;
import coreFunctions.TestConditions;
import org.junit.Assert;
import org.junit.Test;
import pageActions.LoginPageActions;
import pageActions.MainPageActions;
import pages.LoginPage;
import pages.MyProfilePage;

import static pageActions.LoginPageActions.pressLogInFacebook;

public class LoginTest extends TestConditions {

    @Test
    public void myProfileFacebookButtonPresent() {
        MainPageActions mainPageActions;

        mainPageActions = new MainPageActions(DriverSetup.driverInstance);
        mainPageActions.pressMyProfileLnk();

        System.out.println("\nmyProfile Facebook Button Present test started");
        Assert.assertTrue("Facebook button is absent", LoginPage.facebookBtn().isDisplayed());
        System.out.println("MyProfile Facebook Button Present test has been completed.\n");
    }

    @Test
    public void myProfileValidationVerification() {
        MainPageActions mainPageActions;

        mainPageActions = new MainPageActions(DriverSetup.driverInstance);
        mainPageActions.pressMyProfileLnk();

        System.out.println("My Profile Validation Verification test started");
        LoginPageActions.pressLoginButton();
        Assert.assertTrue("Login validation is absent", LoginPage.loginValidationAlrt().isDisplayed());
        Assert.assertTrue("Password validation is absent", LoginPage.passwordValidationAlrt().isDisplayed());
        System.out.println("My Profile Validation Verification test has been completed.");
    }

    @Test
    public void myProfileLoginSuccessfulTest() {
        MainPageActions mainPageActions;

        mainPageActions = new MainPageActions(DriverSetup.driverInstance);

        System.out.println("myProfileLoginTest test started");
        mainPageActions.pressMyProfileLnk();
        pressLogInFacebook();

        if (LoginPageActions.ifLoginRequired() == true) {
            LoginPageActions.logInOlxWithCorrectCredentials(FBLOGIN, FBPASSWORD);
        }

        Assert.assertTrue("Can't log in successfully", MyProfilePage.myProfileNewAdvTitle().isDisplayed());
        mainPageActions.logOutOlx();

        System.out.println("myProfileLoginTest test has been completed.\n");
    }
}