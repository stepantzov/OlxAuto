package pages;

import coreFunctions.OlxWebElementsSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvertPage extends OlxWebElementsSetup {

    protected static WebDriver driver;

    public AdvertPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement advertPageTitle() {
        return getElement("//h1[@class='c000 x-large pding10 rel fleft']", DELAY, XPATH);
    }
}