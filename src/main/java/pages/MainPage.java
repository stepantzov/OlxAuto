package pages;

import coreFunctions.WebSelectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends WebSelectors {

    protected WebDriver driver;

    private String login = "stepantov@gmail.com";
    private String password = "123ZZror";


    public MainPage(WebDriver driver) {

        this.driver = driver;
    }

    public MyProfilePage clickMyProfileLink() {
        WebElement myProfileLink = WebSelectors.getElement("//*[@id='topLoginLink']/span/strong", 30, XPATH);
        myProfileLink.click();

        return new MyProfilePage(driver);
    }

    public SearchResultsPage getSearchResultsPageLocal(String keyWord, String localization) {
        WebElement mySearchButton = WebSelectors.getElement("//*[@id='submit-searchmain']",30,XPATH);
        WebElement mySearchField = WebSelectors.getElement("//*[@id='headerSearch']", 30, XPATH);
        WebElement mySearchLocalization = WebSelectors.getElement("//*[@id='cityField']",30,XPATH);

        mySearchField.sendKeys(keyWord);
        mySearchLocalization.sendKeys(localization);
        mySearchButton.click();

        return new SearchResultsPage(driver);
    }

    public SearchResultsPage getSearchResults(String keyWord) {

        WebElement mySearchButton = WebSelectors.getElement("//*[@id='submit-searchmain']",30,XPATH);
        WebElement mySearchField = WebSelectors.getElement("//*[@id='headerSearch']", 30, XPATH);
        WebElement mySearchLocalization = WebSelectors.getElement("//*[@id='cityField']",30,XPATH);

        mySearchField.sendKeys(keyWord);
        mySearchButton.click();

        return new SearchResultsPage(driver);
    }

    public MyProfilePage getAdvertPageLoggedOutUser() {

        WebElement addNewAdvertLink = WebSelectors.getElement("//*[@id='postNewAdLink']",30,XPATH);
        addNewAdvertLink.click();
        return new MyProfilePage(driver);
    }

/*
    public AdvertPage getAdvertPageAfterLogin() {
        WebElement addNewAdvertLink = WebSelectors.getElement("//*[@id='postNewAdLink']",30,XPATH);
        addNewAdvertLink.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myProfilePage = new MyProfilePage(driver);
        myProfilePage.login(login, password);

        return new AdvertPage(driver);
    }*/

      public AdvertPage getAdvertPageAfterLogin() {
          WebElement addNewAdvertLink = WebSelectors.getElement("//*[@id='postNewAdLink']",30,XPATH);
          addNewAdvertLink.click();
          WebElement loginEmail = WebSelectors.getElement("//*[@id='userEmail']", 30, XPATH);
          WebElement passwordEnter = WebSelectors.getElement("//*[@id='userPass']", 30, XPATH);

          loginEmail.sendKeys(login);
          passwordEnter.sendKeys(password);
          WebElement enterButtonElement = WebSelectors.getElement("//*[@id='se_userLogin']", 30,XPATH);
          return new AdvertPage(driver);
      }
}