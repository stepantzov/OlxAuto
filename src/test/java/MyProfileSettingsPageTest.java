import coreFunctions.BaseSetup;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageActions.MainPageActions;

public class MyProfileSettingsPageTest extends BaseSetup {

    private static WebDriver driver;
    private MainPageActions mainPageActions;

    private String login = "stepantzov@gmail.com";
    private String password = "123ZZror";

    @BeforeClass
    public static void setUp() {
        driver = getDriver(); //can driver be static actually????
    }

    @Test
    public void myProfileLoginTest() {

        mainPageActions = new MainPageActions(driver);

        System.out.println("myProfileLoginTest test started");
        Assert.assertTrue("Can't log in successfully", mainPageActions.verifyLoginSuccessfully());
        System.out.println("myProfileLoginTest test has been completed.\n");
    }

    @Test
    public void MyProfileSettingsPageOpenVerification() {

        mainPageActions = new MainPageActions(driver);

        System.out.println("\nMy Profile Settings PageOpen Verification test started");
        Assert.assertTrue("Element is missing or Page is not opened", mainPageActions.verifyOpenMyProfileSettings());
        System.out.println("My Profile Settings PageOpen Verification test has been completed.\n");
    }
}