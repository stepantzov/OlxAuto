import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class AdvertPageTest extends BaseSetup {

    private static WebDriver driver;
    private MainPage mainPage;

    @BeforeClass
    public static void setUp() {
        driver = getDriver();
    }

    @Test
    public void advertPageTitleTest() {

        mainPage = new MainPage(driver);

        System.out.println("\n Advert Page Title test has started. ");
        AdvertPage myAdvertPage = mainPage.clickAddNewAdvert();
        Assert.assertTrue("No text present.", myAdvertPage.verifyAdvertPageText());
        System.out.println("\n Advert Page Title test has been completed.");
    }
}