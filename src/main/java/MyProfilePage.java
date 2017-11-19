import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class MyProfilePage {

    private WebDriver driver;

    private By profileText = By.xpath("//*[@id='login_tab']");
    private By facebookLogInButton = By.xpath("//*[@id='fblogin']");
    private By enterButton = By.xpath("//*[@id='se_userLogin']");
    private By loginValidationPresent = By.xpath("//label[@for='userEmail']");
    private By passwordValidationPresent = By.xpath("//label[@for='userPass']");
    private By loginField = By.xpath("//*[@id='userEmail']");
    private By passwordField = By.xpath("//*[@id='userPass']");

    public MyProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMyProfilePageText() {
        WebElement element = driver.findElement(profileText);

        return (element.getText());
    }

    public Boolean verifyFacebookLogInButtonPresent() {
        System.out.println("Checking if Facebook button is present.");
        WebElement element = driver.findElement(facebookLogInButton);

        return (element.isDisplayed());
    }

    public WebElement pressEnterButton() {
        WebElement enterButtonElement = driver.findElement(enterButton);

        return enterButtonElement;
    }

    public Boolean verifyMyProfileValidation() {
        pressEnterButton().click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement loginValidation = driver.findElement(loginValidationPresent);
        WebElement passwordValidation = driver.findElement(passwordValidationPresent);

        return (loginValidation.isDisplayed() || passwordValidation.isDisplayed());
    }

    public void login(String login, String password) {

        WebElement loginEmail = driver.findElement(loginField);
        WebElement passwordEnter = driver.findElement(passwordField);

        loginEmail.sendKeys(login);
        passwordEnter.sendKeys(password);
        pressEnterButton().click();
    }
}