package coreFunctions;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestConditions extends DriverSetup {
    @BeforeSuite
    public static void initializeTestBaseSetup() {
        try {
            DriverSetup.initDriver(URL);
        } catch (Exception e) {
            System.out.println("Error....." + e.getStackTrace());
        }
    }

    @AfterSuite
    public static void tearDown() {
        System.out.println("Closing browser. ");
        driverInstance.quit();
        driverInstance = null;
    }
}