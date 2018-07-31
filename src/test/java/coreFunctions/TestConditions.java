package coreFunctions;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class TestConditions extends DriverSetup {

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
        driverInstance.quit();
        driverInstance = null;
    }
}