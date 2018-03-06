import coreFunctions.DriverSetup;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageActions.LoginPageActions;
import pageActions.MainPageActions;
import pages.LoginPage;
import pages.MyProfilePage;

public class LoginTest extends DriverSetup {
    private static WebDriver driver;
    private MainPageActions mainPageActions;

    @Test
    public void myProfileFacebookButtonPresent() {
        mainPageActions = new MainPageActions(driver);
        mainPageActions.pressMyProfileLnk();

        System.out.println("\nmyProfile Facebook Button Present test started");
        Assert.assertTrue("Facebook button is absent", LoginPage.facebookBtn().isDisplayed());
        System.out.println("MyProfile Facebook Button Present test has been completed.\n");
    }

    @Test
    public void myProfileValidationVerification() {
        mainPageActions = new MainPageActions(driver);
        mainPageActions.pressMyProfileLnk();

        System.out.println("\nMy Profile Validation Verification test started");
        LoginPageActions.pressLoginButton();
        Assert.assertTrue("Login validation is absent", LoginPage.loginValidationAlrt().isDisplayed());
        Assert.assertTrue("Password validation is absent", LoginPage.passwordValidationAlrt().isDisplayed());
        System.out.println("My Profile Validation Verification test has been completed.\n");
    }

    @Test
    public void myProfileLoginSuccessfullTest() {
        mainPageActions = new MainPageActions(driver);
        mainPageActions.pressMyProfileLnk();

        System.out.println("myProfileLoginTest test started");
        LoginPageActions.loginOlxFacebook();
        Assert.assertTrue("Can't log in successfully", MyProfilePage.myProfileActiveAdvTitle().isDisplayed());
        LoginPageActions.logOutOlx();
        System.out.println("myProfileLoginTest test has been completed.\n");
    }
}