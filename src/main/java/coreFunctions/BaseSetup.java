package coreFunctions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseSetup {

    static String driverPath = "C:\\Program Files (x86)\\Google\\Chrome\\";
    static String Url = "https://www.olx.ua/";
    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    private static void setDriver(String Url) {
        driver = initChromeDriver(Url);
    }

    private static WebDriver initChromeDriver(String Url) {
        System.out.println("Launching google chrome with new profile..");
        System.setProperty("webdriver.chrome.driver", driverPath
                + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.navigate().to(Url);
        return driver;
    }

    @BeforeClass
    public static void initializeTestBaseSetup() {
        try {
            setDriver(Url);

        } catch (Exception e) {
            System.out.println("Error....." + e.getStackTrace());
        }
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}