import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SearchResultsTest extends BaseSetup {

    private static WebDriver driver;
    private MainPage mainPage;

    @BeforeClass
    public static void setUp() {
        driver = getDriver();
    }


    @Test
    public void searchResultsFoundTest() {

        mainPage = new MainPage(driver);

        SearchResultsPage mySearchResultsPage = mainPage.doSearch("Ваз 2103");
        mySearchResultsPage.closePopUp();
        String results = mySearchResultsPage.getSearchResultsCountText();
        Assert.assertTrue("No results present.", results.contains("Найдено"));
        System.out.println(results);
        System.out.println("Search Results Found test has been completed.");
    }
}