import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {
    private By searchResultsFoundText = By.xpath("//div[@class='hasPromoted section clr']|p[@class='color-2']");
    private By popUp = By.xpath("//span[@class='highlight-close']");
    private WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSearchResultsCountText() {
        WebElement mySearchResultsFoundText = driver.findElement(searchResultsFoundText);
        return (mySearchResultsFoundText.getText());
    }

    public void closePopUp() {
       WebElement closePopUp = driver.findElement(popUp);
       closePopUp.click();
    }
}