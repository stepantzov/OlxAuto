package olxCucumber.conditions;

import coreFunctions.DriverSetup;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import static coreFunctions.DriverSetup.driverInstance;
import static coreFunctions.GlobalDefinitions.URL;

public class Hooks {

    @Before
    public static void beforeScenario() {
        try {
            DriverSetup.initDriver(URL);
        } catch (Exception e) {
            System.out.println("Error....." + e.getStackTrace());
        }
    }

    @After
    public static void afterScenario() {
        System.out.println("Closing browser. ");
        driverInstance.manage().deleteAllCookies();
        driverInstance.quit();
        driverInstance = null;
    }
}