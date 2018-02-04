package coreFunctions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup extends GlobalDefinitions {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    private static void setDriver(String url) {
        driver = initChromeDriver(url);
    }

    private static WebDriver initChromeDriver(String url) {
        System.out.println("Launching google chrome with new profile..");
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);

        return driver;
    }

    @BeforeClass
    public static void initializeTestBaseSetup() {
        try {
            setDriver(URL);
        } catch (Exception e) {
            System.out.println("Error....." + e.getStackTrace());
        }
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}