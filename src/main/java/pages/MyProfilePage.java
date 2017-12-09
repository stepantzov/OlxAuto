package pages;

import coreFunctions.WebSelectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class MyProfilePage extends WebSelectors {

    private static WebDriver driver;

    private static By enterButton = By.xpath("//*[@id='se_userLogin']");

    public MyProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMyProfilePageText() {
        WebElement element = WebSelectors.getElement("//*[@id='login_tab']",30,XPATH);

        return (element.getText());
    }

    public static WebElement getEnterButton() {
        WebElement enterButtonElement = WebSelectors.getElement("//*[@id='se_userLogin']", 30, XPATH);

        return enterButtonElement;
    }
    public void login(String login, String password) {

        WebElement loginEmail = WebSelectors.getElement("//*[@id='userEmail']", 30, XPATH);
        WebElement passwordEnter = WebSelectors.getElement("//*[@id='userPass']", 30, XPATH);

        loginEmail.sendKeys(login);
        passwordEnter.sendKeys(password);
        getEnterButton().click();
    }

    public Boolean verifyMyProfileValidation() {
        getEnterButton().click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement loginValidation = WebSelectors.getElement("//label[@for='userEmail']",30,XPATH);
        WebElement passwordValidation = WebSelectors.getElement("//label[@for='userPass']",30,XPATH);

        return (loginValidation.isDisplayed() || passwordValidation.isDisplayed());
    }

    public Boolean verifyIfLoginSuccessfully(String login, String password) {
        login(login, password);
        WebElement myAccountHeader = WebSelectors.getElement(".//*[@id='usertabs']//*[@class='x-large fbold lheight20']",
                30, XPATH);

        return (myAccountHeader.isDisplayed());
    }

    public Boolean verifyFacebookLogInButtonPresent() {
        System.out.println("Checking if Facebook button is present.");
        WebElement element = WebSelectors.getElement("//*[@id='fblogin']", 30, XPATH);

        return (element.isDisplayed());
    }

}