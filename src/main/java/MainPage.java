import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    protected WebDriver driver;
    private By profileLink = By.xpath("//*[@id='topLoginLink']/span/strong");
    private By searchButton = By.xpath("//*[@id='submit-searchmain']");
    private By searchField = By.xpath("//*[@id='headerSearch']");
    private By searchLocalization = By.xpath("//*[@id='cityField']");
    private By addNewAdvert = By.xpath("//*[@id='postNewAdLink']");

    private String login = "stepantov@gmail.com";
    private String password = "123ZZror";

    public MainPage(WebDriver driver) {

        this.driver = driver;
    }

    public MyProfilePage clickMyProfileLink() {
        WebElement myProfileLink = driver.findElement(profileLink);
        myProfileLink.click();

        return new MyProfilePage(driver);
    }

    public SearchResultsPage getSearchResults(String keyWord, String localization) {
        WebElement mySearchButton = driver.findElement(searchButton);
        WebElement mySearchField = driver.findElement(searchField);
        WebElement mySearchLocalization = driver.findElement(searchLocalization);

        mySearchField.sendKeys(keyWord);
        mySearchLocalization.sendKeys(localization);
        mySearchButton.click();

        return new SearchResultsPage(driver);
    }

    public SearchResultsPage getSearchResults(String keyWord) {

        WebElement mySearchButton = driver.findElement(searchButton);
        WebElement mySearchField = driver.findElement(searchField);
        WebElement mySearchLocalization = driver.findElement(searchLocalization);

        mySearchField.sendKeys(keyWord);
        mySearchButton.click();

        return new SearchResultsPage(driver);
    }

    public AdvertPage clickAddNewAdvert() {

        WebElement addNewAdvertLink = driver.findElement(addNewAdvert);
        addNewAdvertLink.click();

        MyProfilePage myProfilePage = new MyProfilePage(driver);
        myProfilePage.login(login, password);

        return new AdvertPage(driver);
    }
}