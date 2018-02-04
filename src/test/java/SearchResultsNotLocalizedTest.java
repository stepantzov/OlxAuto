import coreFunctions.DriverSetup;
import externalDictionary.ExternalDictionary;
import externalDictionary.SearchParametersFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import pageActions.MainPageActions;
import pageActions.SearchResultsPageActions;
import java.util.List;

@RunWith(Parameterized.class)
public class SearchResultsNotLocalizedTest extends DriverSetup {
    private static WebDriver driver;
    private MainPageActions mainPageActions;

    @Parameterized.Parameter(0)
    public String searchKeyword;

    @Parameterized.Parameters
    public static List dataNotLocalized() {
        SearchParametersFactory searchParametersFactory = new SearchParametersFactory();
        ExternalDictionary externalDictionaryNotLocalized = searchParametersFactory.getDictionary("PARAMETERSNOTLOCALIZED");

        return externalDictionaryNotLocalized.getSearchParameter();
    }

    @BeforeClass
    public static void setUp() {
        driver = getDriver();
    }

    @After
    public void navigateHomePage() {
        mainPageActions.navigateHomePage();
    }

    @Test
    public void searchResultsNotLocalizedTest() {
        mainPageActions = new MainPageActions(driver);

        System.out.println("\nSearch Results Test test started...");
        System.out.format("Searching for keyvalue='%s' \n", searchKeyword);

        mainPageActions.setSearchFieldVal(searchKeyword);
        mainPageActions.pressSearchButton();

        SearchResultsPageActions.pressClosePopUpButton();
        String results = SearchResultsPageActions.getMyProfilePageText();
        Assert.assertTrue("No results present.", results.contains("Найдено"));
        System.out.println(results);
        mainPageActions.navigateHomePage();
        System.out.println("Search Results Found test has been completed.");
    }
}

