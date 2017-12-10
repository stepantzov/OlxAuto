package pages;

import coreFunctions.WebSelectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyProfilePopUp extends WebSelectors {

    private static WebDriver driver;

    public MyProfilePopUp(WebDriver driver) {
        this.driver = driver;
    }

    public String getMyProfilePageText() {
        WebElement element = WebSelectors.getElement("//*[@id='login_tab']", 30, XPATH);

        return (element.getText());
    }
}