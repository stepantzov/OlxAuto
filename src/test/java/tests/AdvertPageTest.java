package tests;

import coreFunctions.DriverSetup;
import coreFunctions.TestConditions;
import org.junit.Assert;
import org.junit.Test;
import pageActions.AdvertPageActions;
import pageActions.MainPageActions;

import static pageActions.LoginPageActions.pressLogInFacebook;

public class AdvertPageTest extends TestConditions {
    private MainPageActions mainPageActions;

    @Test
    public void getAdvertPageTest() {
        System.out.println("Get AdvertPage test has started. ");

        mainPageActions = new MainPageActions(DriverSetup.driverInstance);
        mainPageActions.pressMyProfileLnk();
        pressLogInFacebook();
        //loginOlxFacebook(FBLOGIN, FBPASSWORD);
        mainPageActions.pressAddNewAdvertLnk();
        Assert.assertEquals("Подать объявление на OLX", AdvertPageActions.getAdvertPageTitle());
        mainPageActions.logOutOlx();

        System.out.println("Get AdvertPage test has been completed successfully.");
    }
}