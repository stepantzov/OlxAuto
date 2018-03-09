package tests;

import coreFunctions.DriverSetup;
import coreFunctions.TestConditions;
import externalDictionary.DictionaryReader;
import externalDictionary.SearchParametersFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pageActions.MainPageActions;
import pageActions.SearchResultsPageActions;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SearchResultsLocalizedTest extends TestConditions {
    private MainPageActions mainPageActions;
    private final static int parametersCount = 2;

    @Parameterized.Parameter(0)
    public String searchKeyword;
    @Parameterized.Parameter(1)
    public String searchLocale;

    @Parameterized.Parameters
    public static Collection<Object[]> dataNotLocalized() {
        SearchParametersFactory searchParametersFactory = new SearchParametersFactory();

        int dictionarySize = DictionaryReader.dictionarySize();
        Object[][] data = new Object[dictionarySize][parametersCount];

        for (int i = 0; i < data.length; i++) {
            data[i][0] = searchParametersFactory.getDictionary("PARAMETERSNOTLOCALIZED").getSearchParameter().get(i);
        }
        for (int j = 0; j < data.length; j++) {
            data[j][1] = searchParametersFactory.getDictionary("PARAMETERSLOCALIZED").getSearchParameter().get(j);
        }

        return Arrays.asList(data);
    }


    @After
    public void navigateHomePage() {
        mainPageActions.navigateHomePage();
    }

    @Test
    public void searchResultsLocalizedTest() {
        mainPageActions = new MainPageActions(DriverSetup.driverInstance);
        System.out.println("Search Results Localized test test started");

        mainPageActions.setSearchFieldVal(searchKeyword);
        mainPageActions.setSearchLocalizationVal(searchLocale);
        mainPageActions.clickLocaliationSuggest();
        mainPageActions.pressSearchButton();

        SearchResultsPageActions.pressClosePopUpButton();
        String results = SearchResultsPageActions.getMyProfilePageText();
        Assert.assertTrue("No results present.", results.contains("Найдено"));
        System.out.println(results);
        mainPageActions.navigateHomePage();

        System.out.println("Search Results Found Localized test has been completed.");
    }
}