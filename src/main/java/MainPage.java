import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    protected WebDriver driver;
    private By myProfileLink = By.xpath("//*[@id='topLoginLink']/span/strong");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MyProfilePage clickMyProfileLink() {
        System.out.println("Clicking on My Profile link.");
        WebElement MyProfileLink = driver.findElement(myProfileLink);
        MyProfileLink.click();
        return new MyProfilePage(driver);
    }
}