import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class MyProfilePageTest extends BaseSetup {

    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUp() {
        driver = getDriver();
    }

    @Test
    public void myProfileOpen() {

        mainPage = new MainPage(driver);

        System.out.println("\nMy Profile page test started. ");
        MyProfilePage myProfilePage = mainPage.clickMyProfileLink();
        assertTrue(myProfilePage.verifyMyProfilePageText().contains("Войти"));
        System.out.println("My Profile page test has been completed. ");
    }
}