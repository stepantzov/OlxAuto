import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseSetup {

    private WebDriver driver;

    static String driverPath = "C:\\Program Files (x86)\\Google\\Chrome\\";
    static String Url = "https://www.olx.ua/";

    public WebDriver getDriver() {
        return driver;
    }


    public void setDriver(String Url) {
        driver = initChromeDriver(Url);
    }

    public static WebDriver initChromeDriver(String Url) {
        System.out.println("Launching google chrome with new profile..");
        System.setProperty("webdriver.chrome.driver", driverPath
                + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.navigate().to(Url);
        return driver;
    }

    @Before
    public void initializeTestBaseSetup() {
        try {
            setDriver(Url);

        } catch (Exception e) {
            System.out.println("Error....." + e.getStackTrace());
        }
    }


    @After
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}