package coreFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup extends GlobalDefinitions {
    public static WebDriver driverInstance = null;

    public static void initDriver(String url) {
        if (driverInstance == null) {
            if (browserType.equalsIgnoreCase("chrome")) {
                System.out.println("Launching google chrome with new profile..");
                System.setProperty("webdriver.chrome.driver", DRIVER_PATH + "chromedriver.exe");
                driverInstance = new ChromeDriver();
            } else if (browserType.equalsIgnoreCase("firefox"))
                driverInstance = new FirefoxDriver();
        }
        driverInstance.manage().window().maximize();
        driverInstance.navigate().to(url);
    }
}