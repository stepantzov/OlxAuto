package pages;

import coreFunctions.WebSelectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainPage extends WebSelectors {

    protected static WebDriver driver;
    protected static final int DELAY = 30;

    private String login = "stepantov@gmail.com";
    private String password = "123ZZror";

    public MainPage(WebDriver driver) {

        this.driver = driver;
    }

    public static void clickMyProfileLink() {
        WebElement myProfileLink = WebSelectors.getElement("//*[@id='topLoginLink']/span/strong", DELAY, XPATH);
        myProfileLink.click();
    }

    public SearchResultsPage getSearchResultsPage(String keyWord, String localization) {
        WebElement mySearchButton = WebSelectors.getElement("//*[@id='submit-searchmain']", DELAY, XPATH);
        WebElement mySearchField = WebSelectors.getElement("//*[@id='headerSearch']", DELAY, XPATH);
        WebElement mySearchLocalization = WebSelectors.getElement("//*[@id='cityField']", DELAY, XPATH);

        mySearchField.sendKeys(keyWord);
        mySearchLocalization.sendKeys(localization);
        mySearchButton.click();

        return new SearchResultsPage(driver);
    }

    public SearchResultsPage getSearchResultsPage(String keyWord) {

        WebElement mySearchButton = WebSelectors.getElement("//*[@id='submit-searchmain']", DELAY, XPATH);
        WebElement mySearchField = WebSelectors.getElement("//*[@id='headerSearch']", DELAY, XPATH);
        WebElement mySearchLocalization = WebSelectors.getElement("//*[@id='cityField']", DELAY, XPATH);

        mySearchField.sendKeys(keyWord);
        mySearchButton.click();

        return new SearchResultsPage(driver);
    }

    public static void login(String login, String password) {
        WebElement enterButtonElement = WebSelectors.getElement("//*[@id='se_userLogin']", DELAY, XPATH);
        WebElement loginEmail = WebSelectors.getElement("//*[@id='userEmail']", DELAY, XPATH);
        WebElement passwordEnter = WebSelectors.getElement("//*[@id='userPass']", DELAY, XPATH);

        loginEmail.sendKeys(login);
        passwordEnter.sendKeys(password);
        enterButtonElement.click();
    }

    public static void logout(){

    }

    public AdvertPage getAdvertPageAfterLogin() {
        WebElement addNewAdvertLink = WebSelectors.getElement("//*[@id='postNewAdLink']", DELAY, XPATH);
        addNewAdvertLink.click();
        login(login, password);

        return new AdvertPage(driver);
    }

    public static MyProfileSettingsPage openMyProfileSettings() {
        Actions action = new Actions(driver);
        WebElement myProfileLink = WebSelectors.getElement(".//*[@id='topLoginLink']/span/strong", DELAY, XPATH);
        action.moveToElement(myProfileLink).moveToElement(WebSelectors.
                getElement(".//*[@id='login-box-settings']/span", DELAY, XPATH)).click().build().perform();

        return new MyProfileSettingsPage(driver);
    }
}