import coreFunctions.BaseSetup;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.AdvertPage;
import pages.MainPage;

public class AdvertPageTest extends BaseSetup {

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
        AdvertPage myAdvertPage = mainPage.getAdvertPageAfterLogin();
        Assert.assertTrue("No text present.", myAdvertPage.verifyAdvertPageText());
        System.out.println("\n getAdvertPage test has been completed.");
    }
}