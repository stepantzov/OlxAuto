import actionsVetification.AdvertPageActionsVerify;
import coreFunctions.BaseSetup;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageActions.MainPageActions;
import pages.MainPage;

public class AdvertPageActionsTest extends BaseSetup {

    private static WebDriver driver;
    private MainPage mainPage;

    @BeforeClass
    public static void setUp() {
        driver = getDriver();
    }

    @Test
    public void getAdvertPageTest() {

        mainPage = new MainPage(driver);

        System.out.println("\n getAdvertPage test has started. ");
        AdvertPageActionsVerify myAdvertPageActions = mainPage.getAdvertPageAfterLogin();
        Assert.assertTrue("No text present.", myAdvertPageActions.verifyAdvertPageText());
        System.out.println("\n getAdvertPage test has been completed.");
    }
}