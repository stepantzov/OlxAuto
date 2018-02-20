
import coreFunctions.DriverSetup;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageActions.LoginPageActions;
import pageActions.MainPageActions;
import pageActions.MyProfileSettingsPageActions;

public class MyProfileSettingsPageTest extends DriverSetup {

    private static WebDriver driver;
    private MainPageActions mainPageActions;

    @BeforeClass
    public static void setUp() {
        driver = getDriver();
    }

    @Test
    public void MyProfileSettingsPageHeaderVerification() {
        mainPageActions = new MainPageActions(driver);
        LoginPageActions.loginOlx(LOGIN, PASSWORD);

        System.out.println("\nMy Profile Settings page header verification test started");
        MainPageActions.openMyProfileSettings();
        Assert.assertEquals("Настройки", MyProfileSettingsPageActions.getMyProfileSettingsHeader());
        System.out.println("My Profile Settings page header verification test been completed.\n");
    }
}