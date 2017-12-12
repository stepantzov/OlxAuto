package pages;

import coreFunctions.WebSelectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends WebSelectors {

    protected static final int DELAY = 30;
    private WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSearchResultsCountText() {
        WebElement mySearchResultsFoundText = WebSelectors.
                getElement("//div[@class='hasPromoted section clr']|p[@class='color-2']", DELAY, XPATH);

        return (mySearchResultsFoundText.getText());
    }

    public void closePopUp() {
        WebElement closePopUp = WebSelectors.getElement("//span[@class='highlight-close']", DELAY, XPATH);
        closePopUp.click();
    }
}