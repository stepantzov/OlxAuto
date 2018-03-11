package tests;

import coreFunctions.DriverSetup;
import coreFunctions.TestConditions;
import org.junit.Assert;
import org.junit.Test;
import pageActions.LoginPageActions;
import pageActions.MainPageActions;
import pageActions.MyProfileSettingsPageActions;

public class MyProfileSettingsPageTest extends TestConditions {
    private MainPageActions mainPageActions;

    @Test
    public void MyProfileSettingsPageHeaderVerification() {
        mainPageActions = new MainPageActions(DriverSetup.driverInstance);
        mainPageActions.pressMyProfileLnk();
        LoginPageActions.loginOlxFacebook(FBLOGIN, FBPASSWORD);

        System.out.println("My Profile Settings page header verification test started");
        mainPageActions.openMyProfileSettings();
        Assert.assertEquals("Настройки", MyProfileSettingsPageActions.getMyProfileSettingsHeader());
        mainPageActions.logOutOlx();
        System.out.println("My Profile Settings page header verification test been completed successfully.\n");
    }
}