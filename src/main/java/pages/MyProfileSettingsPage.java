package pages;

import coreFunctions.ActionsSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyProfileSettingsPage extends ActionsSetup {
    protected WebDriver driver;

    public MyProfileSettingsPage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement myProfileAdsHeader(){
        return getElement(".//*[@id='usertabs']//*[@class='x-large fbold lheight20']", DELAY, XPATH);
    }

    public static WebElement deleteMyProfileLink(){
        return getElement(".//*[@id='se_deleteAccount']/span", DELAY, XPATH);
    }
}