package pages;

import coreFunctions.WebSelectors;
import org.openqa.selenium.WebDriver;

public class MyProfileSettingsPage extends WebSelectors {

    protected static final int DELAY = 30;
    private WebDriver driver;

    public MyProfileSettingsPage(WebDriver driver) {

        this.driver = driver;
    }
}