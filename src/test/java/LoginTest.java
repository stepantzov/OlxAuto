import coreFunctions.BaseSetup;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageActions.MainPageActions;

public class LoginTest extends BaseSetup {

    private static WebDriver driver;
    private MainPageActions mainPageActions;

    private String login = "stepantzov@gmail.com";
    private String password = "123ZZror";

    @BeforeClass
    public static void setUp() {
        driver = getDriver(); //can driver be static actually????
    }

    @Test
    public void myProfileFacebookButtonPresent() {

        mainPageActions = new MainPageActions(driver);

        System.out.println("\nmyProfile Facebook Button Present test started");
        Assert.assertTrue("Facebook button is absent", mainPageActions.verifyFacebookLoginButtonPresent());
        System.out.println("MyProfile Facebook Button Present test has been completed.\n");
    }

    @Test
    public void myProfileValidationVerification() {
//need to add logOutHere
        mainPageActions = new MainPageActions(driver);

        System.out.println("\nMy Profile Validation Verification test started");

        Assert.assertTrue("Validation is missing.", mainPageActions.verifyLoginValidation());
        System.out.println("My Profile Validation Verification test has been completed.\n");
    }

    @Test //login is just an atomic method it need to be run with another Myprofile related methods
    public void myProfileLoginTest() {

        mainPageActions = new MainPageActions(driver);

        System.out.println("myProfileLoginTest test started");
        Assert.assertTrue("Can't log in successfully", mainPageActions.verifyLoginSuccessfully());
        System.out.println("myProfileLoginTest test has been completed.\n");
    }
}