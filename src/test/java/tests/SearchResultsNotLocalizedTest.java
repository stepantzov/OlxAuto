package tests;

import coreFunctions.DriverSetup;
import coreFunctions.TestConditions;
import externalDictionary.ExternalDictionary;
import externalDictionary.SearchParametersFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pageActions.MainPageActions;
import pageActions.SearchResultsPageActions;

import java.util.List;

@RunWith(Parameterized.class)
public class SearchResultsNotLocalizedTest extends TestConditions {
    private MainPageActions mainPageActions;

    @Parameterized.Parameter()
    public String searchKeyword;

    @Parameterized.Parameters
    public static List dataNotLocalized() {
        SearchParametersFactory searchParametersFactory = new SearchParametersFactory();
        ExternalDictionary externalDictionaryNotLocalized = searchParametersFactory.getDictionary("PARAMETERSNOTLOCALIZED");

        return externalDictionaryNotLocalized.getSearchParameter();
    }

    @After
    public void navigateHomePage() {
        mainPageActions.navigateHomePage();
    }

    @Test
    public void searchResultsNotLocalizedTest() {
        mainPageActions = new MainPageActions(DriverSetup.driverInstance);

        System.out.println("\nSearch Results Test test started...");
        System.out.format("Searching for key value='%s' \n", searchKeyword);

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