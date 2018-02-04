package pages;

import coreFunctions.ActionsSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends ActionsSetup {
    protected WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement mySearchResultsFoundText(){
        return getElement("//div[@class='hasPromoted section clr']|p[@class='color-2']", DELAY, XPATH);
    }

    public static WebElement searchResultsPopUpCloseButton(){
        return getElement("//span[@class='highlight-close']", DELAY, XPATH);
    }

   /* public static WebElement searchResultsPopUpFrame(){
        return getElement("//iframe[@id='google_osd_static_frame_224834594489']",DELAY,XPATH);
    }*/
}