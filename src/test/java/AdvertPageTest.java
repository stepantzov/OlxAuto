import coreFunctions.DriverSetup;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageActions.AdvertPageActions;
import pageActions.LoginPageActions;
import pageActions.MainPageActions;

public class AdvertPageTest extends DriverSetup {
    private static WebDriver driver;
    private MainPageActions mainPageActions;

    @Test
    public void getAdvertPageTest() {
        mainPageActions = new MainPageActions(driver);
        LoginPageActions.loginOlx(LOGIN, PASSWORD);

        System.out.println("\n getAdvertPage test has started. ");
        AdvertPageActions advertPageActions = mainPageActions.pressAddNewAdvertLnk();
        Assert.assertEquals("Подать бесплатное объявление на OLX", advertPageActions.getAdvertPageTitle());
        System.out.println("\n getAdvertPage test has been completed.");
    }
}