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
    private MainPageActions mainPageActions;

    @Test
    public void getAdvertPageTest() {
        mainPageActions = new MainPageActions(DriverSetup.driverInstance);

        System.out.println("Get AdvertPage test has started. ");
        mainPageActions.pressMyProfileLnk();
        pressLogInFacebook();

        if (LoginPageActions.ifLoginRequired() == true) {
            LoginPageActions.loginOlxFacebook(FBLOGIN, FBPASSWORD);
        }

        mainPageActions.pressAddNewAdvertLnk();
        Assert.assertEquals("Подать объявление на OLX", AdvertPageActions.getAdvertPageTitle());
        mainPageActions.logOutOlx();

        System.out.println("Get AdvertPage test has been completed successfully.");
    }
}

  /*  @Test
    public void advertPageUrlVerificationTest(){
        mainPageActions = new MainPageActions(DriverSetup.driverInstance);

        System.out.println("Get AdvertPage test has started. ");
        mainPageActions.pressMyProfileLnk();

        if (LoginPageActions.ifLoginRequired() == true) {
            LoginPageActions.loginOlxFacebook(FBLOGIN, FBPASSWORD);

        }

        mainPageActions.pressAddNewAdvertLnk();
        UrlInterpreter.verifyIfUrlLocaleCorrect();
        Assert.assertEquals("Подать объявление на OLX", AdvertPageActions.getAdvertPageTitle());
*/