package tests;

import coreFunctions.TestConditions;
import org.junit.Assert;
import org.junit.Test;
import pageActions.LoginPageActions;
import pageActions.MainPageActions;
import pageActions.MyProfileSettingsPageActions;

import static pageActions.LoginPageActions.pressLogInFacebook;

public class MyProfileSettingsPageTest extends TestConditions {

    @Test
    public void myProfileSettingsPageHeaderVerification() {
        MainPageActions mainPageActions;

        mainPageActions = new MainPageActions(driverInstance);

        System.out.println("My Profile Settings page header verification test started");
        mainPageActions.pressMyProfileLnk();
        pressLogInFacebook();

        if (LoginPageActions.ifLoginRequired() == true) {
            LoginPageActions.logInOlxWithCorrectCredentials(FBLOGIN, FBPASSWORD);
        }

        mainPageActions.openMyProfileSettings();
        Assert.assertEquals("Настройки", MyProfileSettingsPageActions.getMyProfileSettingsHeader());
        mainPageActions.logOutOlx();

        System.out.println("My Profile Settings page header verification test been completed successfully.\n");
    }
}