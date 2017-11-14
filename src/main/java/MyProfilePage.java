import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyProfilePage {

    private WebDriver driver;

    private By enterProfileText = By.xpath("//*[@id='login_tab']");

    public MyProfilePage (WebDriver driver){
        this.driver = driver;
    }

    public String verifyMyProfilePageText() {
        WebElement element = driver.findElement(enterProfileText);
        return (element.getText());
    }
}
