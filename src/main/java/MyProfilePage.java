import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyProfilePage {

    private WebDriver driver;

    private By enterProfileText = By.xpath("//*[@id='login_tab']");
    private By facebookLogInButton = By.xpath("//*[@id='fblogin']");

    public MyProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMyProfilePageText() {
        WebElement element = driver.findElement(enterProfileText);

        return (element.getText());
    }

    public Boolean verifyFacebookLogInButtonPresent() {
        System.out.println("Checking if Facebook button is present.");
        WebElement element = driver.findElement(facebookLogInButton);

        return (element.isDisplayed());
    }
}
