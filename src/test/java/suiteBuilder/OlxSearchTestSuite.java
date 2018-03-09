package suiteBuilder;

import tests.SearchResultsLocalizedTest;
import tests.SearchResultsNotLocalizedTest;

public class OlxSearchTestSuite extends SearchFunctionalityTest {
    long executionDuration;

    @Override
    public String name() {
        return "suiteBuilder.OlxSearchTestSuite";
    }

    @Override
    public String priority() {
        return "Medium";
    }

    @Override
    public void Scope() {
        long startTime = System.nanoTime();
        SearchResultsLocalizedTest searchResultsLocalizedTest = new SearchResultsLocalizedTest();
        searchResultsLocalizedTest.searchResultsLocalizedTest();

        SearchResultsNotLocalizedTest searchResultsNotLocalizedTest = new SearchResultsNotLocalizedTest();
        searchResultsNotLocalizedTest.searchResultsNotLocalizedTest();
        long endTime = System.nanoTime();
        executionDuration = (endTime - startTime);
    }

    @Override
    public long executionTime() {
        return executionDuration;
    }
}