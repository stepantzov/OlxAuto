import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvertPage {
    private By advertPageTextTitle = By.xpath("//h1[@class='c000 x-large pding10 rel fleft']");

    private WebDriver driver;

    public AdvertPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyAdvertPageText() {
        WebElement myAdvertPageTextTitle = driver.findElement(advertPageTextTitle);
        String advertPageTitleText = myAdvertPageTextTitle.getText();
        String expectedText = "Подать бесплатное объявление на OLX";

        return advertPageTitleText.contains(expectedText);
    }
}
