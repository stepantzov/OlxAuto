package pages;

import coreFunctions.WebSelectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvertPage extends WebSelectors {

    private WebDriver driver;
    protected static final int DELAY = 30;

    public AdvertPage(WebDriver driver) {

        this.driver = driver;
    }

    public boolean verifyAdvertPageText() {
        WebElement myAdvertPageTextTitle = getElement("//h1[@class='c000 x-large pding10 rel fleft']", DELAY, XPATH);
        String advertPageTitleText = myAdvertPageTextTitle.getText();
        String expectedText = "Подать бесплатное объявление на OLX";

        return advertPageTitleText.contains(expectedText);
    }
}