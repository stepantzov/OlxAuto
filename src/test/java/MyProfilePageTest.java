import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class MyProfilePageTest extends BaseSetup {

    private static WebDriver driver;
    private MainPage mainPage;

    @BeforeClass
    public static void setUp() {
        driver = getDriver();
    }

    @Test
    public void myProfileOpen() {

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
        Assert.assertTrue("not", myProfilePage.verifyFacebookLogInButtonPresent());
        System.out.println("MyProfile Facebook Button Present test has been completed.\n");
    }
}