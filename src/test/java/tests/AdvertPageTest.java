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
        LoginPageActions.loginOlx(LOGIN, PASSWORD);

        System.out.println("\n getAdvertPage test has started. ");
        AdvertPageActions advertPageActions = mainPageActions.pressAddNewAdvertLnk();
        Assert.assertEquals("Подать бесплатное объявление на OLX", advertPageActions.getAdvertPageTitle());
        System.out.println("\n getAdvertPage test has been completed.");
    }
}