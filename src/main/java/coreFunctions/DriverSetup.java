package coreFunctions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup extends GlobalDefinitions {
    public static WebDriver webDriverInstance = null;

 /*   private static void setDriver(String url) {
        driver = initChromeDriver(url);
    }
*/
    public static void initDriver(String url) {
        if (webDriverInstance == null) {
            if (browserType.equalsIgnoreCase("chrome")) {
                System.out.println("Launching google chrome with new profile..");
                System.setProperty("webdriver.chrome.driver", DRIVER_PATH + "chromedriver.exe");
                webDriverInstance = new ChromeDriver();
            } else if (browserType.equalsIgnoreCase("firefox"))
                webDriverInstance = new FirefoxDriver();
        }
        webDriverInstance.manage().window().maximize();
        webDriverInstance.navigate().to(url);
    }

    @BeforeClass
    public static void initializeTestBaseSetup() {
        try {
            DriverSetup.initDriver(URL);

        } catch (Exception e) {
            System.out.println("Error....." + e.getStackTrace());
        }
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Closing browser. ");
        webDriverInstance.quit();
        webDriverInstance = null;
    }
}