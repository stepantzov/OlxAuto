package tests;

import coreFunctions.DriverSetup;
import coreFunctions.TestConditions;
import org.junit.Assert;
import org.junit.Test;
import pageActions.AdvertPageActions;
import pageActions.LoginPageActions;
import pageActions.MainPageActions;

public class AdvertPageTest extends TestConditions {
    private MainPageActions mainPageActions;

    @Test
    public void getAdvertPageTest() {
        mainPageActions = new MainPageActions(DriverSetup.driverInstance);
        mainPageActions.pressMyProfileLnk();
        LoginPageActions.loginOlxFacebook(FBLOGIN, FBPASSWORD);

        System.out.println("\n getAdvertPage test has started. ");
        mainPageActions.pressAddNewAdvertLnk();
        Assert.assertEquals("Подать объявление на OLX", AdvertPageActions.getAdvertPageTitle());
        System.out.println("\n getAdvertPage test has been completed.");
    }
}