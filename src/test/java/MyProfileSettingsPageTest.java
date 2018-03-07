
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
        LoginPageActions.loginOlx(LOGIN, PASSWORD);

        System.out.println("\nMy Profile Settings page header verification test started");
        MainPageActions.openMyProfileSettings();
        Assert.assertEquals("Настройки", MyProfileSettingsPageActions.getMyProfileSettingsHeader());
        System.out.println("My Profile Settings page header verification test been completed.\n");
    }
}