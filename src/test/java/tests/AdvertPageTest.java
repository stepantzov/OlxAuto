package tests;

import coreFunctions.DriverSetup;
import coreFunctions.TestConditions;
import org.junit.Assert;
import org.junit.Test;
import pageActions.AdvertPageActions;
import pageActions.LoginPageActions;
import pageActions.MainPageActions;
import static pageActions.LoginPageActions.pressLogInFacebook;

public class AdvertPageTest extends TestConditions {

    @Test
    public void getAdvertPageTest() {
        MainPageActions mainPageActions;
        mainPageActions = new MainPageActions(DriverSetup.driverInstance);

        System.out.println("Get AdvertPage test has started. ");
        mainPageActions.pressMyProfileLnk();
        pressLogInFacebook();

        if (LoginPageActions.ifLoginRequired() == true) {
            LoginPageActions.logInOlxWithCorrectCredentials(FBLOGIN, FBPASSWORD);
        }

        mainPageActions.pressAddNewAdvertLnk();
        Assert.assertEquals("Подать объявление на OLX", AdvertPageActions.getAdvertPageTitle());
        mainPageActions.logOutOlx();

        System.out.println("Get AdvertPage test has been completed successfully.");
    }
}