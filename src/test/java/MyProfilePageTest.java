import coreFunctions.BaseSetup;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.MyProfilePage;

import static org.junit.Assert.assertTrue;

public class MyProfilePageTest extends BaseSetup {

    private static WebDriver driver;
    private MainPage mainPage;

    private String login = "stepantzov@gmail.com";
    private String password = "123ZZror";

    @BeforeClass
    public static void setUp() {
        driver = getDriver();
    }

    @Test
    public void myProfileOpenTest() {

        mainPage = new MainPage(driver);

        System.out.println("\nMy Profile page test started. ");
        MyProfilePage myProfilePage = mainPage.clickMyProfileLink();
        assertTrue(myProfilePage.getMyProfilePageText().contains("Войти"));
        System.out.println("My Profile page test has been completed.\n");
    }

    @Test
    public void myProfileFacebookButtonPresent() {

        mainPage = new MainPage(driver);

        System.out.println("\nmyProfile Facebook Button Present test started");
        MyProfilePage myProfilePage = mainPage.clickMyProfileLink();
        Assert.assertTrue("Facebook button is absent", myProfilePage.verifyFacebookLogInButtonPresent());
        System.out.println("MyProfile Facebook Button Present test has been completed.\n");
    }

    @Test
    public void myProfileValidationVerification() {

        mainPage = new MainPage(driver);

        System.out.println("\nMy Profile Validation Verification test started");
        MyProfilePage myProfilePage =  mainPage.clickMyProfileLink();
        Assert.assertTrue("Validation is missing.", myProfilePage.verifyMyProfileValidation());
        System.out.println("My Profile Validation Verification test has been completed.\n");
    }

    @Test
    public void myProfileLoginTest() {

        mainPage = new MainPage(driver);

        System.out.println("myProfileLoginTest test started");
        MyProfilePage myProfilePage = mainPage.clickMyProfileLink();
        Assert.assertTrue("Can't log in successfully", myProfilePage.verifyIfLoginSuccessfully(login, password));
    }
}