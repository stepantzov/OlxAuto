package pages;

import coreFunctions.WebSelectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvertPage extends WebSelectors {

    private WebDriver driver;

    public AdvertPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyAdvertPageText() {
        WebElement myAdvertPageTextTitle = getElement("//h1[@class='c000 x-large pding10 rel fleft']", 60, XPATH);
        String advertPageTitleText = myAdvertPageTextTitle.getText();
        String expectedText = "Подать бесплатное объявление на OLX";

        return advertPageTitleText.contains(expectedText);
    }
}