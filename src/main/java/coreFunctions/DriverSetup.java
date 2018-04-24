package coreFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverSetup extends GlobalDefinitions {
    public static WebDriver driverInstance = null;

    public static void initDriver(String url) {
        if (driverInstance == null) {
            switch (browserType) {
                case "chrome":
                    System.out.println("Launching google chrome with new profile..");
                    System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH + "chromedriver.exe");
                    driverInstance = new ChromeDriver();
                    break;

                case "FF":
                    System.out.println("Launching FireFox driver with new profile...\n");
                    driverInstance = new FirefoxDriver();
                    break;

                case "IE":
                    System.out.println("Launching google chrome with new profile..");
                    System.setProperty("webdriver.ie.driver", IE_DRIVER_PATH + "cIEDriverServer.exe");
                    driverInstance = new InternetExplorerDriver();
                    break;

                default:
                    System.out.println("Invalid browser type specified.");
            }

            driverInstance.manage().window().maximize();
            driverInstance.navigate().to(url);
        }
    }
}