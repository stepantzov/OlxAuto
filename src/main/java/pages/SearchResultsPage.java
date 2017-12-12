package pages;

import coreFunctions.OlxWebElementsSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends OlxWebElementsSetup {

    private WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement mySearchResultsFoundText(){
        return getElement("//div[@class='hasPromoted section clr']|p[@class='color-2']", DELAY, XPATH);
    }

    public WebElement searchResultsPopUpCloseButton(){
        return getElement("//span[@class='highlight-close']", DELAY, XPATH);
    }
}